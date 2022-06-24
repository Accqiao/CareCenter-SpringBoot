package com.care.center.controller;

import com.care.center.model.NursingRecord;
import com.care.center.service.NursingRecordService;
import com.care.center.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/nursingRecord")
public class NursingRecordController {

    @Autowired
    private NursingRecordService nursingRecordService;

    @RequestMapping("selById/{id}")
    public NursingRecord selById(@PathVariable Integer id){
        return nursingRecordService.selById(id);
    }

    @RequestMapping("queryAll/{currPage}")
    public PageInfo<NursingRecord> queryAll(@RequestBody NursingRecord nursingRecord,@PathVariable Integer currPage){
        return nursingRecordService.queryAll(nursingRecord,currPage);
    }

    @RequestMapping("add")
    public ResultVO add(@RequestBody NursingRecord nursingRecord){
        nursingRecord.setNursingTime(new Date());
        nursingRecordService.add(nursingRecord);
        return new ResultVO(200,"添加成功");
    }

    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        nursingRecordService.del(id);
        return new ResultVO(200,"删除成功");
    }

    @RequestMapping("/update")
    public ResultVO update(@RequestBody NursingRecord nursingRecord){
        nursingRecordService.update(nursingRecord);
        return new ResultVO(200,"修改成功");
    }
}
