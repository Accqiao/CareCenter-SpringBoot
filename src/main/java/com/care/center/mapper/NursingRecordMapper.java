package com.care.center.mapper;

import com.care.center.model.NursingRecord;

import java.util.List;

public interface NursingRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NursingRecord record);

    NursingRecord selectByPrimaryKey(Integer id);

    List<NursingRecord> selectAll();

    int updateByPrimaryKey(NursingRecord record);

    List<NursingRecord> queryAll(NursingRecord nursingRecord);
}