package com.todo.estate.controller.assess;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */
@Controller
@Scope("prototype")
public class InitAssessController {
    @RequestMapping("/assess/{page}")
    public String initAssess(@PathVariable(value = "page") String page){
        return "assess/"+page;
    }
}
