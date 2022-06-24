package com.care.center.service.impl;

import com.care.center.mapper.NursingLevelMapper;
import com.care.center.model.NursingLevel;
import com.care.center.service.NursingLevelService;
import com.care.center.util.Define;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NursingLevelServiceImpl implements NursingLevelService {

    @Autowired
    private NursingLevelMapper nursingLevelMapper;

    @Override
    public NursingLevel selById(Integer id) {
        return nursingLevelMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<NursingLevel> selAll(){
        return nursingLevelMapper.selectAll();
    }

    @Override
    public void add(NursingLevel n) {
        nursingLevelMapper.insert(n);
    }

    @Override
    public void del(Integer id){
        nursingLevelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(NursingLevel n) {
        nursingLevelMapper.updateByPrimaryKey(n);
    }

    @Override
    public PageInfo<NursingLevel> queryAll(NursingLevel nursingLevel, Integer currPage) {
        if(currPage == null) currPage = 1;
        //设置从第几页开始查询的记录数
        PageHelper.startPage(currPage, Define.ADMIN_PAGE_SIZE);
        PageInfo<NursingLevel> pageInfo = new PageInfo<>(nursingLevelMapper.queryAll(nursingLevel));
        return pageInfo;
    }
    @Override
    public List<NursingLevel> selDistinctLevelName() {
        return nursingLevelMapper.selDistinctLevelName();
    }
}
