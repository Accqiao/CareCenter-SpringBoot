package com.care.center.service.impl;

import com.care.center.mapper.RoomMapper;
import com.care.center.model.Room;
import com.care.center.service.RoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Resource
    private RoomMapper roomMapper;

    @Override
    public List<Room> selByBuilding(String build) {
        return roomMapper.selectByBuilding(build);
    }

    @Override
    public int insert(Room record) {
        return roomMapper.insert(record);
    }

    @Override
    public boolean toTui(String sta,String rid) {
        return roomMapper.toTui(sta,rid);
    }

    @Override
    public List<Room> sellAll() {
        return roomMapper.selectAll();
    }

    @Override
    public List<Room> selectByUse(String use) {
        return roomMapper.selectByUse(use);
    }

    @Override
    public int deleteByPrimaryKey(String rid) {
        return roomMapper.deleteByPrimaryKey(rid);
    }

    @Override
    public List<String> selRoom() {
        return roomMapper.selRoom();
    }
}
