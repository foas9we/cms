package com.briup.apps.web.controller;

import com.briup.apps.bean.extend.BaseUserExtend;
import com.briup.apps.service.IBaseUserService;
import com.briup.apps.util.Message;
import com.briup.apps.util.MessageUtil;
import com.briup.apps.vm.UserVM;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IBaseUserService  iBaseUserService;
    public Message login(@RequestBody UserVM userVM){
        //验证用户身份
        //产生一个token
        //保存起来
        Map<String,String> map = new HashMap<>();
        map.put("token","admin-token");
        return MessageUtil.success(map);
    }

    @ApiOperation(value = "退出")
    @PostMapping(value = "logout")
    public Message logout(){
        //1 将缓存中的token清楚
        //2 其他
        return MessageUtil.success("success");
    }

    @ApiOperation(value = "通过token获得用户信息")
    @GetMapping(value = "info")
    public Message Info(String token){
        //1 获取到token中用户信息
        BaseUserExtend user = iBaseUserService.findById(1l);
        return MessageUtil.success(user);

    }
}
