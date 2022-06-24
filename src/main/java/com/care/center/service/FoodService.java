package com.care.center.service;

import com.care.center.model.Food;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface FoodService {

    /**
     * 根据id查找食品信息
     * @param id
     * @return
     */
    Food findById(Integer id);

    /**
     * 查找所有食品信息
     * @return
     */
    List<Food> findAll();

    /**
     * 查找所有食品信息,分页
     * @param currPage
     * @return
     */
    PageInfo<Food> findAllByPages(Integer currPage);

    /**
     * 按条件查找
     * @param food
     * @return
     */
    List<Food> findByCondition(Food food);

    /**
     * 按条件查找,分页
     * @param food
     * @param currPage
     * @return
     */
    PageInfo<Food> findByConditionAndPages(Food food,Integer currPage);

    /**
     * 添加
     * @param food
     */
    void add(Food food);

    /**
     * 根据id，删除
     * @param id
     */
    void delete(Integer id);

    /**
     * 修改
     * @param food
     */
    void update(Food food);

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
