package com.care.center.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.care.center.mapper.RoomMapper;
import com.care.center.model.Record;
import com.care.center.service.RecordService;
import com.care.center.service.RoomService;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@RestController
@RequestMapping("/record")
public class RecordController {

    @Resource
    private RecordService recordService;
    @Resource
    private RoomService roomService;


    @RequestMapping("all")
    public List<Record> selAll(){
        return recordService.sellAll();
    }

    @RequestMapping("tui")
    public void toTui(@RequestBody String str){
        try {
            str = URLDecoder.decode(str,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String des = str.substring(4);
        String rid = str.substring(0,4);
        recordService.toTui(des.substring(0,des.length()-1), rid);
        roomService.toTui("no",rid);
    }

    @RequestMapping("del")
    public void del(@RequestBody String reid){
        recordService.del(reid.substring(0,reid.length()-1));
    }

    @RequestMapping("updes")
    public void upDes(@RequestBody String str) {
        JSONObject json = JSONObject.parseObject(str);
        String rid = json.getString("rid");
        String reid = json.getString("reid");
        String desc = json.getString("desc");
        String oldrid = json.getString("oldrid");
        recordService.upDes(reid,rid,desc);
        System.out.println(oldrid+"//"+rid);
        if(!oldrid.equals(reid)){
            roomService.toTui("no",oldrid);
            roomService.toTui("using",rid);
        }
    }
}
