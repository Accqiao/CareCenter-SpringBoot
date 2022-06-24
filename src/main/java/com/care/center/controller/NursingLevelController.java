package com.care.center.controller;


import com.care.center.model.NursingLevel;
import com.care.center.service.NursingLevelService;
import com.care.center.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nursingLevel")
public class NursingLevelController {

    @Autowired
    private NursingLevelService nursingLevelService;

    @RequestMapping("selById/{id}")
    public NursingLevel selById(@PathVariable Integer id){
        return nursingLevelService.selById(id);
    }

    @RequestMapping("selAll")
    public List<NursingLevel> selAll(){
        return nursingLevelService.selAll();
    }

    @RequestMapping("queryAll/{currPage}")
    public PageInfo<NursingLevel> queryAll(@RequestBody NursingLevel nursingLevel, @PathVariable Integer currPage){
        return nursingLevelService.queryAll(nursingLevel,currPage);
    }

    @RequestMapping("add")
    public ResultVO add(@RequestBody NursingLevel nursingLevel){
        nursingLevelService.add(nursingLevel);
        return new ResultVO(200,"添加成功");
    }

    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        nursingLevelService.del(id);
        return new ResultVO(200,"删除成功");
    }

    @RequestMapping("update")
    public ResultVO update(@RequestBody NursingLevel nursingLevel){
        nursingLevelService.update(nursingLevel);
        return new ResultVO(200,"修改成功");
    }
    @RequestMapping("selDistinctLevelName")
    public List<NursingLevel> selDistinctLevelName(){
        return nursingLevelService.selDistinctLevelName();
    }

}
