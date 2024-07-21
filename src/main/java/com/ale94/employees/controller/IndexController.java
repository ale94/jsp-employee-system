package com.ale94.employees.controller;

import com.ale94.employees.services.IEmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@AllArgsConstructor
@Slf4j
public class IndexController {

    private final IEmployeeService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String start(ModelMap model) {
        var employees = service.getAll();
        employees.forEach(e -> log.info(String.valueOf(e)));
        model.put("employees", employees);
        return "index";
    }

}
