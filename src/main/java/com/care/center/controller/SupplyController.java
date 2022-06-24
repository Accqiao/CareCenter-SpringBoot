package com.care.center.controller;

import com.care.center.model.Supply;
import com.care.center.service.SupplyService;
import com.care.center.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/supply")
public class SupplyController {
    @Resource
    private SupplyService supplyService;

    /**
     * 按id查找供应信息
     * @param id
     * @return
     */
    @RequestMapping("/findById/{id}")
    public Supply findById( @PathVariable Integer id){
        return supplyService.findById(id);
    }

    /**
     * 查找所有供应信息
     * @return
     */
    @RequestMapping("/findAll")
    public List<Supply> findAll(){
        return supplyService.findAll();
    }

    /**
     * 添加信息
     * @param supply
     * @return
     * */
    @RequestMapping("/add")
    public ResultVO add(Supply supply){
        supply.setAddDate(new Date());
        supplyService.add(supply);
        return new ResultVO(200,"添加成功");
    }

    /**
     * 按id删除供应信息
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    public ResultVO delete(@PathVariable Integer id){
        supplyService.delete(id);
        return new ResultVO(200,"删除成功");
    }

    /**
     * 删除信息
     * @param supply
     * @return
     */
    @RequestMapping("/update")
    public ResultVO update(Supply supply){
        supplyService.update(supply);
        return new ResultVO(200,"修改成功");
    }

    /**
     * 一对一，查找膳食信息与供应信息
     * @param supply
     * @param currPage
     * @return
     */
    @RequestMapping("/findAllSupplyAndFood/{currPage}")
    public PageInfo<Supply> findAllSupplyAndFood(Supply supply, @PathVariable Integer currPage){
        return supplyService.findAllSupplyAndFood(supply,currPage);
    }
}
