package com.care.center.controller;

import com.care.center.mapper.RoomMapper;
import com.care.center.model.Room;
import com.care.center.service.RoomService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/overview")
public class OverViewController {

    @Resource
    private RoomService roomService;


    @RequestMapping("selBuild/{build}")
    public List<Room> selBuild(@PathVariable String build){
        return roomService.selByBuilding(build+"%");
    }

}
