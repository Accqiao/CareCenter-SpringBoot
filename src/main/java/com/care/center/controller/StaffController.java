package com.care.center.controller;

import com.care.center.model.Staff;
import com.care.center.service.StaffService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/staff")
public class StaffController {

  @Resource
  private StaffService  staffService;
  /**
   * 按id查职工信息
   * @param id
   * @return
   */
  @RequestMapping("/findById/{id}")
  public Staff findById(@PathVariable Integer id){
    return staffService.findById(id);
  }

  /**
   * 查询所有职工信息
   * @param currPage
   * @return
   */
  @RequestMapping("/findAll/{currPage}")
  public PageInfo<Staff> findAll(@PathVariable Integer currPage) {
    return staffService.findAll(currPage);
  }

  /**
   * 更新职工信息
   * @param staff
   * @return
   */
  @RequestMapping("/updateById")
  public int updateById(Staff staff) {
    return staffService.updateById(staff);
  }

  /**
   * 添加职工信息
   * @param record
   * @return
   */
  @RequestMapping("/insert")
  public int insert(Staff record){
    return staffService.insert(record);
  }

  /**
   * 删除职工信息
   * @param staffId
   * @return
   */
  @RequestMapping("/delete/{staffId}")
  public int deleteByPrimaryKey(@PathVariable Integer staffId){
    staffService.deleteByPrimaryKey(staffId);
    return 1;
  }

  /**
   * 按条件查找，分页
   * @param record
   * @param currPage
   * @return
   */
  @RequestMapping("/findByCondition/{currPage}")
  public PageInfo<Staff> findByCondition(Staff record,@PathVariable Integer currPage){
    return staffService.findByCondition(record,currPage);
  }

  /**
   * 按条件修改
   * @param record
   * @return
   */
  @RequestMapping("/updateByCondition")
  public void updateByCondition(Staff record){
    staffService.updateByCondition(record);
  }
}
