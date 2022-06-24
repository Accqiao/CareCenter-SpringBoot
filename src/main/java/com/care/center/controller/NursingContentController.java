package com.care.center.controller;

import com.care.center.model.NursingContent;
import com.care.center.service.NursingContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nursingContent")
public class NursingContentController {

    @Autowired
    private NursingContentService nursingContentService;

    @RequestMapping("selDistinctName")
    public List<NursingContent> selDistinctName(){
        return nursingContentService.selDistinctName();
    };
}
