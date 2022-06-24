package com.care.center.controller;

import com.care.center.model.Customer;
import com.care.center.service.CustomerService;
import com.care.center.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @RequestMapping("selAll")
    public List<Customer> sellAll(){
        return customerService.sellAll();
    }
    @RequestMapping("selPaging/{currPage}")
    public PageInfo<Customer> selPaging(@PathVariable Integer currPage){
        return customerService.selPaging(currPage);
    }

    @RequestMapping("selOne/{cid}")
    public Customer selectByPrimaryKey(@PathVariable String cid){
        return customerService.selectByPrimaryKey(cid);
    }

    /**
     * 按id查客户信息
     * @param id
     * @return
     */
    @RequestMapping("/findById/{id}")
    public Customer findById(@PathVariable String id){
        return customerService.findById(id);
    }

    /**
     * 查询所有客户信息
     * @param currPage
     * @return
     */
    @RequestMapping("/findAll/{currPage}")
    public PageInfo<Customer> findAll(@PathVariable Integer currPage) {
        return customerService.findAll(currPage);
    }

    /**
     * 更新客户信息
     * @param customer
     * @return
     */
    @RequestMapping("/updateById")
    public int updateById( Customer customer) {
        return customerService.updateById(customer);
    }

    /**
     * 添加客户信息
     * @param record
     * @return
     */
    @RequestMapping("/insert")
    public int insert(Customer record){
        return customerService.insert(record);
    }

    /**
     * 删除客户信息
     * @param customerId
     * @return
     */
    @RequestMapping("/delete/{customerId}")
    public int deleteByPrimaryKey(@PathVariable String customerId){
        return customerService.deleteByPrimaryKey(customerId);
    }

    /**
     * 按条件查找，分页
     * @param record
     * @param currPage
     * @return
     */
    @RequestMapping("/findByCondition/{currPage}")
    public PageInfo<Customer> findByCondition(Customer record, @PathVariable Integer currPage){
        return customerService.findByCondition(record,currPage);
    }

    /**
     * 按条件修改
     * @param record
     * @return
     */
    @RequestMapping("/updateByCondition")
    public void updateByCondition(Customer record){
        customerService.updateByCondition(record);
    }

    /**
     * 获取该用户的所有膳食信息
     * @param id
     * @return
     */
    @RequestMapping("/findAllDistributionByUser/{id}")
    public Customer findAllDistributionByUser(@PathVariable String id){
        return customerService.findAllDistributionByUser(id);
    }

    @RequestMapping("/login")
    public ResultVO login(Customer customer){
        return customerService.login(customer);
    }

}
