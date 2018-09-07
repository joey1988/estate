package com.todo.estate.controller.rent;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
public class IndexRentController {

    public String user;

    @RequestMapping("/initRent")
    public String initRent(){
        return "rent/initRent";
    }

}
