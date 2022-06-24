package com.care.center.service;

import com.care.center.model.Customer;
import com.care.center.model.Distribution;
import com.github.pagehelper.PageInfo;

public interface DistributionService {
    /**
     * 一对一，供应信息，膳食信息，客户信息
     * 根据客户信息，查找该客户的膳食日历
     * @param customer
     * @param currPage
     * @return
     */
    PageInfo<Distribution> findAllSupplyAndCustomer(Customer customer,Integer currPage);

    /**
     * 添加
     * @param distribution
     */
    void add(Distribution distribution);
}
