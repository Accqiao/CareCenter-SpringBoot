package com.care.center.service.impl;

import com.care.center.mapper.DistributionMapper;
import com.care.center.model.Customer;
import com.care.center.model.Distribution;
import com.care.center.service.DistributionService;
import com.care.center.util.Define;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DistributionServiceImpl implements DistributionService {

    @Autowired
    private DistributionMapper distributionMapper;
    /**
     * 一对一，供应信息，膳食信息，客户信息
     * 根据客户信息，查找该客户的膳食日历,分页
     *  @param customer
     * @param customer
     * @return
     */
    @Override
    public PageInfo<Distribution> findAllSupplyAndCustomer(Customer customer ,Integer currPage){
        if (currPage == 0) {
            currPage = 1;
        }
        //设置从第几页开始查询的记录数
        PageHelper.startPage(currPage, Define.ADMIN_PAGE_SIZE);
        PageInfo<Distribution> pageInfo = new PageInfo<>(distributionMapper.findAllSupplyAndCustomer(customer));
        return pageInfo;
    }

    /**
     * 添加
     * @param distribution
     */
    @Override
    public void add(Distribution distribution){
        distribution.setAddDate(new Date());
        distributionMapper.insert(distribution);
    }
}
