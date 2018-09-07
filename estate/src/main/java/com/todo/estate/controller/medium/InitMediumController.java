package com.todo.estate.controller.medium;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 中介类
 */
@Controller
@Scope("prototype")
public class InitMediumController {
    /**
     * 中介类综合跳转页面
     * @return
     */
    @RequestMapping("medium/{page}")
    public String initMedium(@PathVariable( value = "page") String page){
        return "medium/"+page;
    }

}
