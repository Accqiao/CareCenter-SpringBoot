package com.care.center.controller;

import com.care.center.model.Food;
import com.care.center.service.FoodService;
import com.care.center.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("food")
public class FoodController {
    @Resource
    private FoodService foodService;

    /**
     * 根据id查找食品信息
     * @param id
     * @return
     */
    @RequestMapping("/findById/{id}")
    public Food findById(@PathVariable Integer id){
        return foodService.findById(id);
    }

    /**
     * 查找所有食品信息,分页
     * @param currPage
     * @return
     */
    @RequestMapping("/findAllByPages/{currPage}")
    public PageInfo<Food> findAllByPages(@PathVariable Integer currPage){
        return foodService.findAllByPages(currPage);
    }

    /**
     * 按条件查找,分页
     * @param food
     * @param currPage
     * @return
     */
    @RequestMapping("/findByConditionAndPages/{currPage}")
    public PageInfo<Food> findByConditionAndPages(Food food,@PathVariable Integer currPage){
        return foodService.findByConditionAndPages(food,currPage);
    }

    /**
     * 添加
     * @param food
     */
    @RequestMapping("/add")
    public ResultVO add(Food food){
        foodService.add(food);
        return new ResultVO(200,"添加成功");
    }

    /**
     * 根据id，删除
     * @param id
     */
    @RequestMapping("/delete/{id}")
    public ResultVO delete(@PathVariable Integer id){
        foodService.delete(id);
        return new ResultVO(200,"删除成功");
    }

    /**
     * 按条件修改
     * @param food
     */
    @RequestMapping("/updateByCondition")
    public ResultVO updateByCondition(Food food){
        foodService.updateByCondition(food);
        return new ResultVO(200,"修改成功");
    }

    /**
     * 根据食品id查找该食品的所有供应信息
     * @param id
     * @return
     */
    @RequestMapping("/findAllSupplyByFood/{id}")
    public Food findAllSupplyByFood(@PathVariable Integer id){
        return foodService.findAllSupplyByFood(id);
    }
}
