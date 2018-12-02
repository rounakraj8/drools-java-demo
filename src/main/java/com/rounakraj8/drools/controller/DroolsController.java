package com.rounakraj8.drools.controller;

import com.rounakraj8.drools.payload.Input;
import com.rounakraj8.drools.payload.Output;
import com.rounakraj8.drools.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DroolsController {

    private final SalaryService salaryService;

    @Autowired
    public DroolsController(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    @RequestMapping(value = "salary", method = RequestMethod.POST)
    public Output getSalary(@RequestBody Input input) {
        return salaryService.getSalary(input);
    }
}
