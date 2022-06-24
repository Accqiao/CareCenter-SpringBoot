package com.care.center.mapper;

import com.care.center.model.NursingContent;

import java.util.List;

public interface NursingContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NursingContent record);

    NursingContent selectByPrimaryKey(Integer id);

    List<NursingContent> selectAll();

    int updateByPrimaryKey(NursingContent record);

    List<NursingContent> selDistinctName();
}