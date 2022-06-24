package com.care.center.controller;

import com.alibaba.fastjson.JSONObject;
import com.care.center.model.Customer;
import com.care.center.model.Record;
import com.care.center.model.UserInfo;
import com.care.center.service.CustomerService;
import com.care.center.service.RecordService;
import com.care.center.service.RoomService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Resource
    private RecordService recordService;
    @Resource
    private CustomerService customerService;
    @Resource
    private RoomService roomService;

    @RequestMapping("little/{build}")
    public List<UserInfo> Little(@PathVariable String build){
        List<UserInfo> userInfos = new ArrayList<>();
        List<Record> records =  recordService.selectByBuilding("using",build+"%");
        for (Record re: records) {
            Customer customer = customerService.selectByPrimaryKey(re.getCid());
            UserInfo userInfo = new UserInfo();
            userInfo.setReid(re.getReid());
            userInfo.setIntime(getDate(re.getIntime()));
            userInfo.setIndescribe(re.getIndescribe());
            userInfo.setRid(re.getRid());
            userInfo.setCid(customer.getCid());
            userInfo.setName(customer.getName());
            userInfo.setSex(customer.getSex());
            userInfo.setAge(customer.getAge()+"");
            userInfo.setPhone(customer.getPhone());
            userInfo.setIllness(customer.getIllness());
            userInfo.setNotes(customer.getNotes());
            userInfo.setPhoto(customer.getPhoto());
            userInfos.add(userInfo);
        }
        return userInfos;
    }@RequestMapping("all")

    public List<UserInfo> All(){
        List<UserInfo> userInfos = new ArrayList<>();
        List<Record> records = recordService.sellAll();
        for (Record re: records) {
            Customer customer = customerService.selectByPrimaryKey(re.getCid());
            UserInfo userInfo = new UserInfo();
            userInfo.setReid(re.getReid());
            userInfo.setIntime(getDate(re.getIntime()));
            userInfo.setIndescribe(re.getIndescribe());
            userInfo.setRid(re.getRid());
            userInfo.setCid(customer.getCid());
            userInfo.setName(customer.getName());
            userInfo.setSex(customer.getSex());
            userInfo.setAge(customer.getAge()+"");
            userInfo.setPhone(customer.getPhone());
            userInfo.setIllness(customer.getIllness());
            userInfo.setNotes(customer.getNotes());
            userInfo.setPhoto(customer.getPhoto());
            if(re.getOuttime() != null)
            userInfo.setOuttime(getDate(re.getOuttime()));
            userInfo.setOutdescribe(re.getOutdescribe());
            userInfo.setStatus(getStatus(re.getStatus()));


            userInfos.add(userInfo);
        }
        return userInfos;
    }
    public String getDate(Date date){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置日期格式"yyyy-MM-dd hh:mm:ss"
        String thisday = sdf.format(date);//获取String类型的时间

        return thisday;
    }
    public String getStatus(String status){
        if(status.equals("using") ){
            return "仍入住中";
        }else{
            return "已退住";
        }

    }

    @RequestMapping("insert")
    public void insertRC(@RequestBody String str){
        JSONObject json = JSONObject.parseObject(str);
        Customer customer = new Customer();
        customer.setCid(json.getString("cid"));
        customer.setName(json.getString("name"));
        customer.setAge(Integer.parseInt(json.getString("age")));
        customer.setSex((json.getString("sex")));
        customer.setPhone(json.getString("phone"));
        customer.setPhoto(json.getString("photo"));
        customer.setIllness(json.getString("illness"));
        customer.setNotes(json.getString("notes"));
        String rid = json.getString("rid");
        String desc = json.getString("json");
        String cid = json.getString("cid");
        //修改房屋状态
        roomService.toTui("using",rid);

        //插入新的用户，或者修改用户信息
        System.out.println(customerService.selectByPrimaryKey(cid)!= null);
        if(customerService.selectByPrimaryKey(cid) == null){
            customerService.insert(customer);
        }{
            customerService.updateByPrimaryKey(customer);
        }
        //新增记录
        recordService.insertNew(desc,rid,cid);
    }



}
