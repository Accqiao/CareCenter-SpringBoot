package com.care.center.service.impl;

import com.care.center.mapper.FoodMapper;
import com.care.center.model.Food;
import com.care.center.service.FoodService;
import com.care.center.util.Define;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodMapper foodMapper;

    /**
     * 根据id查找食品信息
     * @param id
     * @return
     */
    @Override
    public Food findById(Integer id){
        return foodMapper.selectByPrimaryKey(id);
    }

    /**
     * 查找所有食品信息
     * @return
     */
    @Override
    public List<Food> findAll(){
        return foodMapper.selectAll();
    }

    /**
     * 查找所有食品信息,分页
     * @param currPage
     * @return
     */
    @Override
    public PageInfo<Food> findAllByPages(Integer currPage){
        if (currPage == 0) {
            currPage = 1;
        }
        //设置从第几页开始查询的记录数
        PageHelper.startPage(currPage, Define.ADMIN_PAGE_SIZE);
        PageInfo<Food> pageInfo = new PageInfo<>(findAll());
        return pageInfo;
    }

    /**
     * 按条件查找
     * @param food
     * @return
     */
    @Override
    public List<Food> findByCondition(Food food){
        return foodMapper.findByCondition(food);
    }

    /**
     * 按条件查找,分页
     * @param food
     * @param currPage
     * @return
     */
    @Override
    public PageInfo<Food> findByConditionAndPages(Food food,Integer currPage){
        if (currPage == 0) {
            currPage = 1;
        }
        //设置从第几页开始查询的记录数
        PageHelper.startPage(currPage, Define.ADMIN_PAGE_SIZE);
        PageInfo<Food> pageInfo = new PageInfo<>(findByCondition(food));
        return pageInfo;
    }

    /**
     * 添加
     * @param food
     */
    @Override
    public void add(Food food){
        foodMapper.insert(food);
    }

    /**
     * 根据id，删除
     * @param id
     */
    @Override
    public void delete(Integer id){
        foodMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改
     * @param food
     */
    @Override
    public void update(Food food){
        foodMapper.updateByPrimaryKey(food);
    }

    /**
     * 按条件修改
     * @param food
     */
    @Override
    public void updateByCondition(Food food){
        foodMapper.updateByCondition(food);
    }

    /**
     * 根据食品id查找该食品的所有供应信息
     * @param id
     * @return
     */
    @Override
    public Food findAllSupplyByFood(Integer id){
        return foodMapper.findAllSupplyByFood(id);
    }
}
