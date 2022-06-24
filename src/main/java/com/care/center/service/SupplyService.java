package com.care.center.service;

import com.care.center.model.Supply;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface SupplyService {
    /**
     * 按id查找供应信息
     * @param id
     * @return
     */
    Supply findById(Integer id);

    /**
     * 查找所有供应信息
     * @return
     */
    List<Supply> findAll();

    /**
     * 添加信息
     * @param supply
     */
    void add(Supply supply);

    /**
     * 按id删除供应信息
     * @param id
     * @return
     */
    void delete(Integer id);

    /**
     * 删除信息
     * @param supply
     */
    void update(Supply supply);

    /**
     * 一对一，查找膳食信息与供应信息
     * @param supply
     * @param currPage
     * @return
     */
    PageInfo<Supply> findAllSupplyAndFood(Supply supply,Integer currPage);

}
