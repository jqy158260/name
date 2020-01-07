package com.test.demo01.controller;

import com.test.demo01.model.User;
import com.test.demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test01.do",method = RequestMethod.GET)
    public String test01(){
        return "test01";
    }

    @RequestMapping(value = "/text03.do",method = RequestMethod.GET)
    public List<User> text03() {
        return userService.getAll();
    }
}
