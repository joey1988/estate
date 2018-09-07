package com.todo.estate.controller.house;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@Scope("prototype")
public class InitHouseController {

        /**
         * 新房销售总入口（区列表），先这样写，后期扩展再修改
         */
        @RequestMapping("/initAreaHouse/{page}")
        public String initAreaHouse(@PathVariable(value = "page")String page){
            return "house/"+page;
        }


    /**
     * 新房销售总入口，先这样写，后期扩展再修改
     */
    @RequestMapping("/initHouse/{page}")
    public String initHouse(@PathVariable(value = "page")String page){
        return "house/"+page;
    }
}
