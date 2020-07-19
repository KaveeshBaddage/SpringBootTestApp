package com.kaveesh.testApp.controller;

import com.kaveesh.testApp.dto.user.AdminCreateRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user/")
public class UserController {

    @PostMapping("admin/create")
    public void createAdminAccount(@Valid @RequestBody AdminCreateRequestDTO request){
        System.out.println("XXXXXXXXXXXXXXXXXXXx");
    }
}
