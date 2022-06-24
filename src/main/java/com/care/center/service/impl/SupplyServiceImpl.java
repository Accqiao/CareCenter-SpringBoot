package com.care.center.service.impl;

import com.care.center.mapper.SupplyMapper;
import com.care.center.model.Supply;
import com.care.center.service.SupplyService;
import com.care.center.util.Define;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplyServiceImpl implements SupplyService {

    @Autowired
    private SupplyMapper supplyMapper;

    /**
     * 按id查找供应信息
     * @param id
     * @return
     */
    @Override
    public Supply findById(Integer id){
        return supplyMapper.selectByPrimaryKey(id);
    }

    /**
     * 查找所有供应信息
     * @return
     */
    @Override
    public List<Supply> findAll(){
        return supplyMapper.selectAll();
    }

    /**
     * 添加信息
     * @param supply
     */
    @Override
    public void add(Supply supply){
        supplyMapper.insert(supply);
    }

    /**
     * 按id删除供应信息
     * @param id
     * @return
     */
    @Override
    public void delete(Integer id){
        supplyMapper.deleteByPrimaryKey(id);
    }

    /**
     * 删除信息
     * @param supply
     */
    @Override
    public void update(Supply supply){
        supplyMapper.updateByPrimaryKey(supply);
    }

    /**
     * 一对一，查找膳食信息与供应信息
     * @param supply
     * @param currPage
     * @return
     */
    @Override
    public PageInfo<Supply> findAllSupplyAndFood(Supply supply, Integer currPage){
        if (currPage == 0) {
            currPage = 1;
        }
        //设置从第几页开始查询的记录数
        PageHelper.startPage(currPage, Define.ADMIN_PAGE_SIZE);
        PageInfo<Supply> pageInfo = new PageInfo<>(supplyMapper.findAllSupplyAndFood(supply));
        return pageInfo;
    }

}
