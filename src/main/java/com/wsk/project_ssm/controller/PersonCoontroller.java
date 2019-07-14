package com.wsk.project_ssm.controller;


import com.wsk.project_ssm.service.PersonService;
import com.wsk.project_ssm.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/person")
public class PersonCoontroller {

    @Resource
    PersonService personService;


    @RequestMapping("/getPersonList")
    public String getPersonList(Model model, @RequestParam(name = "cpage",defaultValue = "1")int cpage,
                                @RequestParam(name = "mohu",defaultValue = "")String mohu){

        int pageSize = 2;
        int index = (cpage-1)*pageSize;

        Map<String,Object> paramMap = new HashMap<String, Object>();
        paramMap.put("pageSize",pageSize);
        paramMap.put("index",index);
        paramMap.put("mohu",mohu);

        List< Map<String,Object>> mapPersonList = personService.getMapPersonList(paramMap);
        int count = personService.getCountPersonList(paramMap);

        Map<String,Object> page = PageUtil.page("getPersonList",cpage,pageSize,count,mohu);

        model.addAttribute("mapPersonList",mapPersonList);
        model.addAttribute("page",page);
        model.addAttribute("mohu",mohu);


        return "list";
    }

}
