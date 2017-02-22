package com.fx.supplier.basedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fx.supplier.basedata.model.Department;
import com.fx.supplier.basedata.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String list() {
        userService.get();
        System.out.println("UserController.list()");
        return "list";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Department department) {
        userService.save(department);
        return "redirect:list.form";
    }

}
