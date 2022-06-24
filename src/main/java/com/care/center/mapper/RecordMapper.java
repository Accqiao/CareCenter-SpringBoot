package com.care.center.mapper;

import com.care.center.model.Record;
import java.util.List;

public interface RecordMapper {
    int deleteByPrimaryKey(Integer reid);

    int insert(Record record);

    Record selectByPrimaryKey(Integer reid);

    List<Record> selectAll();

    int updateByPrimaryKey(Record record);

    List<Record> selectByBuilding(String status,String build);

    boolean toTui(String des,String rid);

    boolean upDes(String reid,String rid,String des);
    boolean insertNew(String indescribe,String rid,String cid);
}