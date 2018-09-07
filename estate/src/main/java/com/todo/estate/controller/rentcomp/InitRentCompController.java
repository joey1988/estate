package com.todo.estate.controller.rentcomp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 租赁公司
 */
@Controller
@Scope("prototype")
public class InitRentCompController {
    @RequestMapping("/rentcomp/{page}")
    public String initRestComp(@PathVariable(value = "page") String page){
        return "rentcomp/"+page;
    }
}
