package com.cdut.springbootdemo.controller;


import com.cdut.springbootdemo.entity.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Objects;

@CrossOrigin
@RestController
public class PersonPageController {

    //@RequestMapping(value = "/",method = RequestMethod.GET)
    @PostMapping("/api/person")
    @ApiImplicitParam(name = "个人id",value ="就是这个人的id",dataType = "java.lang.Integer",paramType = "java.lang.Integer",example = "147852369")
    public String  PersonPage(HttpServletRequest request){
        System.out.println(request.getParameter("firstname"));
        System.out.println(request.getParameter("lastname"));
        return request.getParameter("firstname")+"我知道了";
    }

    @PostMapping("/api/formpost")
    @ApiImplicitParam(name = "个人id",value ="就是这个人的id",dataType = "java.lang.Integer",paramType = "java.lang.Integer",example = "147852369")
    public String login(@RequestParam Map<String,Object> reqMap, Model model) {
        String account=reqMap.get("account").toString();
        String act_pwd=reqMap.get("act_pwd").toString();
        String phone=reqMap.get("phoned").toString();
        System.out.println("account:"+account);
        System.out.println("act_pwd:"+act_pwd);
        System.out.println("phone:"+phone);
        return "";
    }

    @PostMapping("/api/jsonpost")
    @ApiImplicitParam(name = "个人id",value ="就是这个人的id",dataType = "java.lang.Integer",paramType = "java.lang.Integer",example = "147852369")
    public String JSONPost(@RequestBody User requestUser) {
        System.out.println(requestUser);
        String account=requestUser.getAccount();
        String act_pwd=requestUser.getAct_pwd();
        String phone=requestUser.getPhone();
        System.out.println("account:"+account);
        System.out.println("act_pwd:"+act_pwd);
        System.out.println("phone:"+phone);
        return "";
    }
}
