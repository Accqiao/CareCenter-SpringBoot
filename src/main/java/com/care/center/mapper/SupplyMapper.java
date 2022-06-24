package com.care.center.mapper;

import com.care.center.model.Supply;

import java.util.List;

public interface SupplyMapper {
    int deleteByPrimaryKey(Integer supplyId);

    int insert(Supply record);

    Supply selectByPrimaryKey(Integer supplyId);

    List<Supply> selectAll();

    int updateByPrimaryKey(Supply record);

    /**
     * 一对一，查找膳食信息与供应信息
     * @param supply
     * @return
     */
    List<Supply> findAllSupplyAndFood(Supply supply);
}