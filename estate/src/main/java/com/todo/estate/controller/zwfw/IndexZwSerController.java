package com.todo.estate.controller.zwfw;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 政务服务类
 */
@Controller
@Scope("prototype")
public class IndexZwSerController {

    /**
     * 政务服务总入口，先这样写，后期扩展再修改
     */
    @RequestMapping("/initZwSer/{page}")
    public String initZwSer(@PathVariable(value = "page")String page){
        return "zwser/"+page;
    }


}
