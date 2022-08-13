package com.example.hello.controller;

import com.example.hello.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    //ResponseEntity

//    @ResponseBody // 바디를 만들어 내린다.
//    @GetMapping("/user")
//    public User user() {
//        var user = new User();
//        user.setName("leesky");
//        user.setAddress("test");
//        return user;
//    }

}
