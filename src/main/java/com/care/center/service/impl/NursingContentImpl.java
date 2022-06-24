package com.care.center.service.impl;

import com.care.center.mapper.NursingContentMapper;
import com.care.center.model.NursingContent;
import com.care.center.service.NursingContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NursingContentImpl implements NursingContentService {

    @Autowired
    private NursingContentMapper nursingContentMapper;

    @Override
    public List<NursingContent> selDistinctName() {
        return nursingContentMapper.selDistinctName();
    }
}
