package com.care.center.service;

import com.care.center.model.Staff;
import com.github.pagehelper.PageInfo;

public interface StaffService {

  /**
   * 按id查职工信息
   * @param id
   * @return
   */
  Staff findById(Integer id);

  /**
   * 查询所有职工信息
   * @Param currPage
   * @return
   */
  PageInfo<Staff> findAll(Integer currPage);

  /**
   * 更新职工信息
   * @param staff
   * @return
   */
  int updateById (Staff staff);

  /**
   * 添加职工信息
   * @param record
   * @return
   */
  int insert(Staff record);

  /**
   * 删除职工信息
   * @param staffId
   * @return
   */
  int deleteByPrimaryKey(Integer staffId);

  /**
   * 按条件查找，分页
   * @param record
   * @param currPage
   * @return
   */
  PageInfo<Staff> findByCondition(Staff record,Integer currPage);

  /**
   * 按条件修改
   * @param record
   * @return
   */
  void updateByCondition(Staff record);
}
