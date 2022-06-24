package com.care.center.mapper;

import com.care.center.model.Room;
import java.util.List;

public interface RoomMapper {
    int deleteByPrimaryKey(String rid);

    int insert(Room record);

    Room selectByPrimaryKey(String rid);

    List<Room> selectAll();

    int updateByPrimaryKey(Room record);

    List<Room>selectByBuilding(String build);

    boolean toTui(String sta,String rid);

    List<Room> selectByUse(String use);

    List<String> selRoom();

}