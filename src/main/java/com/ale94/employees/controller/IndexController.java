package com.ale94.employees.controller;

import com.ale94.employees.entity.EmployeeEntity;
import com.ale94.employees.services.IEmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showAdd() {
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("employeeForm") EmployeeEntity employee) {
        log.info(String.valueOf(employee));
        service.create(employee);
        return "redirect:/";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String showEdit(@RequestParam Long id, ModelMap model) {
        var employee = service.getById(id);
        log.info("Empleado a editar: {}", employee);
        model.put("employee", employee);
        return "edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String edit(@ModelAttribute("employeeForm") EmployeeEntity employee) {
        log.info("String.valueOf(employee)");
        service.create(employee);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String showEdit(@RequestParam Long id) {
        service.delete(id);
        return "redirect:/";
    }

}
