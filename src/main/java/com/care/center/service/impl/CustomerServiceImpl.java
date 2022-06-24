package com.care.center.service.impl;

import com.care.center.mapper.CustomerMapper;
import com.care.center.model.Customer;
import com.care.center.service.CustomerService;
import com.care.center.vo.ResultVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.care.center.util.Define;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> sellAll() {
        return customerMapper.selectAll();
    }
    @Override
    public PageInfo<Customer> selPaging(Integer currPage) {
        if(currPage == null)
            currPage = 1;
        PageHelper.startPage(currPage,3);
        PageInfo<Customer> pageInfo = new PageInfo<>(customerMapper.selectAll());
        return pageInfo;
    }
    @Override
    public Customer selectByPrimaryKey(String cid) {
        return customerMapper.selectByPrimaryKey(cid);
    }
    @Override
    public int updateByPrimaryKey(Customer record) {
        return customerMapper.updateByPrimaryKey(record);
    }
    @Override
    public int insert(Customer record) {
        return customerMapper.insert(record);
    }

    @Override
    public Customer findById(String id) {
        return customerMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<Customer> findAll(Integer currPage) {
        if (currPage == 0) {
            currPage = 1;
        }
        //设置从第几页开始查询的记录数
        PageHelper.startPage(currPage, Define.ADMIN_PAGE_SIZE);

        PageInfo<Customer> pageInfo = new PageInfo<>(customerMapper.selectAll());

        return pageInfo;
    }

    @Override
    public int updateById(Customer customer) {
        return customerMapper.updateByPrimaryKey(customer);
    }

    @Override
    public int deleteByPrimaryKey(String customerId) {
        return customerMapper.deleteByPrimaryKey(customerId);
    }

    @Override
    public PageInfo<Customer> findByCondition(Customer record, Integer currPage){
        if (currPage == 0) {
            currPage = 1;
        }
        //设置从第几页开始查询的记录数
        PageHelper.startPage(currPage, Define.ADMIN_PAGE_SIZE);

        PageInfo<Customer> pageInfo = new PageInfo<>(customerMapper.findByCondition(record));

        return pageInfo;
    }

//    @Override
//    public void updateByCondition(Customer record){
//        customerMapper.updateByPrimaryKey(record);
//    }

    @Override
    public void updateByCondition(Customer record){
        customerMapper.updateByCondition(record);
    }

    /**
     * 获取该用户的所有膳食信息
     * @param id
     * @return
     */
    @Override
    public Customer findAllDistributionByUser(String id){
        return customerMapper.findAllDistributionByUser(id);
    }

    /**
     * 登录
     * @param customer
     * @return
     */
    @Override
    public ResultVO<Customer> login(Customer customer) {
        ResultVO<Customer> resultVO = new ResultVO<>();
        List<Customer> findUser = customerMapper.findByCondition(customer);
        if (findUser.size() == 1) {
            resultVO.setStatus(200);
            resultVO.setMessage("登陆成功");
            resultVO.setObj(findUser.get(0));
        } else {
            resultVO.setStatus(500);
            resultVO.setMessage("用户名或密码错误");
        }
        return resultVO;
    }

}
