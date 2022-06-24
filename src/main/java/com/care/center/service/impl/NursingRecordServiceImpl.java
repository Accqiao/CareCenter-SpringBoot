package com.care.center.service.impl;

import com.care.center.mapper.NursingRecordMapper;
import com.care.center.model.NursingRecord;
import com.care.center.service.NursingRecordService;
import com.care.center.util.Define;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NursingRecordServiceImpl implements NursingRecordService {

    @Autowired
    private NursingRecordMapper nursingRecordMapper;

    @Override
    public NursingRecord selById(Integer id) {
        return nursingRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<NursingRecord> queryAll(NursingRecord nursingRecord, Integer currPage) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage, Define.ADMIN_PAGE_SIZE);
        PageInfo<NursingRecord> pageInfo = new PageInfo<>(nursingRecordMapper.queryAll(nursingRecord));
        System.out.println(pageInfo);
        return pageInfo;
    }

    @Override
    public void add(NursingRecord nursingRecord) {
        nursingRecordMapper.insert(nursingRecord);
    }

    @Override
    public void del(Integer id) {
        nursingRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(NursingRecord nursingRecord) {
        nursingRecordMapper.updateByPrimaryKey(nursingRecord);
    }
}
