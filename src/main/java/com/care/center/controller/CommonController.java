package com.care.center.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;

@RestController
@RequestMapping("/common")
public class CommonController {

    @Value("${web.upload-path}")
    private String path;

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile multipartFile){
        String fileName = multipartFile.getOriginalFilename();
        //修改文件名，确保文件名唯一,UUID.randomUUID()数字较长
        String newFileName = System.currentTimeMillis() + fileName.substring(fileName.lastIndexOf("."));
        //String newFileName = UUID.randomUUID() + fileName.substring(fileName.lastIndexOf("."));

        try {
            //创建目标文件的地址
            FileOutputStream fileOutputStream = new FileOutputStream(path + newFileName);
            //复制文件
            FileCopyUtils.copy(multipartFile.getInputStream(),fileOutputStream);//输入流
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newFileName;
    }

}
