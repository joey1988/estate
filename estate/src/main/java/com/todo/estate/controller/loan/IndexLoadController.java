package com.todo.estate.controller.loan;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
public class IndexLoadController {
    /**
     * 房贷计算器跳转,默认为商业贷
     * @return
     */
    @RequestMapping("/initJsq")
    public String initJsq(){
        return "jsq/index";
    }

    /**
     * 公积金贷款入口
     */
    @RequestMapping("/initgjj")
    public String initgjj(){
        return "jsq/gjj";
    }

    /**
     * 组合贷入口
     */
    @RequestMapping("/initzhd")
    public String initzhd(){
        return "jsq/zhd";
    }

}
