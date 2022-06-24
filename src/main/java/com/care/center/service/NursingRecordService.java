package com.care.center.service;

import com.care.center.model.NursingRecord;
import com.github.pagehelper.PageInfo;

public interface NursingRecordService {

    NursingRecord selById(Integer id);

    PageInfo<NursingRecord> queryAll(NursingRecord nursingRecord,Integer currPage);

    void add(NursingRecord nursingRecord);

    void del(Integer id);

    void update(NursingRecord nursingRecord);
}
