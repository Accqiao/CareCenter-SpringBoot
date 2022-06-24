package com.care.center.service.impl;

import com.care.center.mapper.RecordMapper;
import com.care.center.model.Record;
import com.care.center.service.RecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {

    @Resource
    private RecordMapper recordMapper;


    @Override
    public List<Record> sellAll() {
        return recordMapper.selectAll();
    }

    @Override
    public List<Record> selectByBuilding(String status, String build) {
        return recordMapper.selectByBuilding(status, build);
    }

    @Override
    public boolean toTui(String des, String rid) {
        return recordMapper.toTui(des,rid);
    }

    @Override
    public int del(String reid) {
        return recordMapper.deleteByPrimaryKey(Integer.parseInt(reid));
    }

    @Override
    public boolean upDes(String reid, String rid, String des) {
        return recordMapper.upDes(reid,rid,des);
    }

    @Override
    public boolean insertNew(String indescribe, String rid, String cid) {
        return recordMapper.insertNew(indescribe,rid,cid);
    }
}
