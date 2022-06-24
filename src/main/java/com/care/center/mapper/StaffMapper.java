package com.care.center.mapper;

import com.care.center.model.Staff;

import java.util.List;

public interface StaffMapper {
    int deleteByPrimaryKey(Integer staffId);

    int insert(Staff record);

    Staff selectByPrimaryKey(Integer staffId);

    List<Staff> selectAll();

    int updateByPrimaryKey(Staff record);

    List<Staff> findByCondition(Staff record);

    int updateByCondition(Staff record);

}
