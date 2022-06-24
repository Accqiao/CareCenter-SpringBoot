package com.care.center.service;

import com.care.center.model.NursingLevel;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface NursingLevelService {

    NursingLevel selById(Integer id);

    PageInfo<NursingLevel> queryAll(NursingLevel nursingLevel,Integer currPage);

    List<NursingLevel> selAll();

    void add(NursingLevel n );

    void del(Integer id);

    void update(NursingLevel n);
    List<NursingLevel> selDistinctLevelName();
}
