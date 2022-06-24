package com.care.center.service.impl;

import com.care.center.mapper.StaffMapper;
import com.care.center.model.Staff;
import com.care.center.service.StaffService;
import com.care.center.util.Define;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StaffServiceImpl implements StaffService {

  @Autowired
  private StaffMapper staffMapper;

  /**
   * 按id查职工信息
   * @param id
   * @return
   */
  @Override
  public Staff findById(Integer id) {
    return staffMapper.selectByPrimaryKey(id);
  }

  /**
   * 查询所有职工信息
   * @param currPage
   * @return
   */
  @Override
  public PageInfo<Staff> findAll(Integer currPage) {
    if (currPage == 0) {
      currPage = 1;
    }
    //设置从第几页开始查询的记录数
    PageHelper.startPage(currPage, Define.ADMIN_PAGE_SIZE);

    PageInfo<Staff> pageInfo = new PageInfo<>(staffMapper.selectAll());

    return pageInfo;

  }

  /**
   * 更新职工信息
   * @param staff
   * @return
   */
  @Override
  public int updateById(Staff staff) {
    return staffMapper.updateByPrimaryKey(staff);
  }

  /**
   * 添加职工信息
   * @param record
   * @return
   */
  @Override
  public int insert(Staff record) {
    record.setStaffEntrytime(new Date());
    return staffMapper.insert(record);
  }

  /**
   * 删除职工信息
   * @param staffId
   * @return
   */
  @Override
  public int deleteByPrimaryKey(Integer staffId) {
    return staffMapper.deleteByPrimaryKey(staffId);
  }

  /**
   * 按条件查找，分页
   * @param record
   * @param currPage
   * @return
   */
  @Override
  public PageInfo<Staff> findByCondition(Staff record,Integer currPage){
    if (currPage == 0) {
      currPage = 1;
    }
    //设置从第几页开始查询的记录数
    PageHelper.startPage(currPage, Define.ADMIN_PAGE_SIZE);

    PageInfo<Staff> pageInfo = new PageInfo<>(staffMapper.findByCondition(record));

    return pageInfo;
  }

  /**
   * 按条件修改
   * @param record
   * @return
   */
  @Override
  public void updateByCondition(Staff record){
    staffMapper.updateByCondition(record);
  }
}
