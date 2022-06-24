package com.care.center.service;

import com.care.center.model.Customer;
import com.care.center.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface CustomerService {
    List<Customer> sellAll();
    PageInfo<Customer> selPaging(Integer currPage);
    Customer selectByPrimaryKey(String cid);
    int updateByPrimaryKey(Customer record);
    int insert(Customer record);

    Customer findById(String id);
    PageInfo<Customer> findAll(Integer currPage);
    int updateById (Customer customer);

    int deleteByPrimaryKey(String customerId);
    PageInfo<Customer> findByCondition(Customer record, Integer currPage);
    void updateByCondition(Customer record);

    /**
     * 获取该用户的所有膳食信息
     * @param id
     * @return
     */
    Customer findAllDistributionByUser(String id);

    /**
     * 登录
     * @param customer
     * @return
     */
    ResultVO<Customer> login(Customer customer);

}
