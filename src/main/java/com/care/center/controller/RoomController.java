package com.care.center.controller;

import com.alibaba.fastjson.JSONObject;
import com.care.center.model.Record;
import com.care.center.model.Room;
import com.care.center.service.RoomService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Resource
    private RoomService roomService;


    @RequestMapping("all")
    public List<Room> selAll(){
        return  roomService.sellAll();
    }

    @RequestMapping("no")
    public List<Room> selNo(){
        return  roomService.selectByUse("no");
    }

    @RequestMapping("insert")
    public void insert(@RequestBody String str){
        JSONObject json = JSONObject.parseObject(str);
        Room room = new Room();
        room.setRid(json.getString("rid"));
        room.setFloor(Integer.parseInt(json.getString("floor")));
        room.setName(json.getString("name"));
        room.setStatus("no");
        room.setDes(json.getString("des"));
        roomService.insert(room);

    }

    @RequestMapping("del")
    public void deleteByPrimaryKey(@RequestBody String rid) {
        roomService.deleteByPrimaryKey(rid.substring(0,rid.length()-1));
    }
    @RequestMapping("selbuild")
    List<String> selRoom(){
        return roomService.selRoom();
    }

}
