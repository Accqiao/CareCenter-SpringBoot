package com.care.center.mapper;

import com.care.center.model.NursingLevel;

import java.util.List;

public interface NursingLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NursingLevel record);

    NursingLevel selectByPrimaryKey(Integer id);

    List<NursingLevel> selectAll();

    int updateByPrimaryKey(NursingLevel record);

    List<NursingLevel> queryAll(NursingLevel nursingLevel);

    List<NursingLevel> selDistinctLevelName();

}