package com.care.center.controller;

import com.care.center.model.Customer;
import com.care.center.model.Distribution;
import com.care.center.service.DistributionService;
import com.care.center.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/distribution")
public class DistributionController {

    @Resource
    private DistributionService distributionService;

    /**
     * 一对一，供应信息，膳食信息，客户信息
     * 根据客户信息，查找该客户的膳食日历,分页
     *  @param customer
     * @param customer
     * @return
     */
    @RequestMapping("/findAllSupplyAndCustomer/{currPage}")
    public PageInfo<Distribution> findAllSupplyAndCustomer(Customer customer , @PathVariable Integer currPage){
        return distributionService.findAllSupplyAndCustomer(customer,currPage);
    }

    /**
     * 添加
     * @param distribution
     */
    @RequestMapping("/add")
    public ResultVO add(Distribution distribution){
        distributionService.add(distribution);
        return new ResultVO(200,"添加成功");
    }
}
