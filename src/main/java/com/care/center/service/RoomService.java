package com.care.center.service;

import com.care.center.model.Room;

import java.util.List;

public interface RoomService {
    List<Room> selByBuilding(String build);

    int insert(Room record);

    boolean toTui(String sta,String rid);

    List<Room> sellAll();
    List<Room> selectByUse(String use);
    int deleteByPrimaryKey(String rid);
    List<String> selRoom();
}
