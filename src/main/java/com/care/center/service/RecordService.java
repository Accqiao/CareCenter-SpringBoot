package com.care.center.service;

import com.care.center.model.Record;

import java.util.List;

public interface RecordService {
    List<Record> sellAll();

    List<Record> selectByBuilding(String status,String build);

    boolean toTui(String des,String rid);

    int del(String reid);
    boolean upDes(String reid,String rid,String des);
    boolean insertNew(String indescribe,String rid,String cid);
}
