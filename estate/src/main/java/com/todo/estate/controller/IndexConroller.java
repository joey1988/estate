package com.todo.estate.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
public class IndexConroller {

    @RequestMapping("/initIndex")
    public String initIndex(){
        return "index";
    }
}
