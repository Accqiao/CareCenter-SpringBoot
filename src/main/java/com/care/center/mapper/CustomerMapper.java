package com.care.center.mapper;

import com.care.center.model.Customer;
import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(String cid);

    int insert(Customer record);

    Customer selectByPrimaryKey(String cid);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);

    List<Customer> findByCondition(Customer record);

    int updateByCondition(Customer record);
    /**
     * 获取该用户的所有膳食信息
     * @param id
     * @return
     */
    Customer findAllDistributionByUser(String id);


}