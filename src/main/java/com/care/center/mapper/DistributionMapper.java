package com.care.center.mapper;

import com.care.center.model.Customer;
import com.care.center.model.Distribution;

import java.util.List;

public interface DistributionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Distribution record);

    Distribution selectByPrimaryKey(Integer id);

    List<Distribution> selectAll();

    int updateByPrimaryKey(Distribution record);

    /**
     * 一对一，供应信息，膳食信息，客户信息
     * 根据客户信息，查找该客户的膳食日历
     * @param customer
     * @return
     */
    List<Distribution> findAllSupplyAndCustomer(Customer customer);
}