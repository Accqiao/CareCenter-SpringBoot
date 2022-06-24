package com.care.center.mapper;

import com.care.center.model.Food;

import java.util.List;

public interface FoodMapper {
    int deleteByPrimaryKey(Integer foodId);

    int insert(Food record);

    Food selectByPrimaryKey(Integer foodId);

    List<Food> selectAll();

    int updateByPrimaryKey(Food record);

    /**
     * 按条件查找
     * @param food
     * @return
     */
    List<Food> findByCondition(Food food);

    /**
     * 按条件修改
     * @param food
     */
    void updateByCondition(Food food);

    /**
     * 根据食品id查找该食品的所有供应信息
     * @param id
     * @return
     */
    Food findAllSupplyByFood(Integer id);
}