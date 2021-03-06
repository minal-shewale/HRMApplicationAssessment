package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/adddata")
    public ResponseEntity<String> addData(@RequestBody Employee employee)
    {
        employeeService.addData(employee);
        return ResponseEntity.ok("Data Added Successfully");
    }

    @PostMapping("/getdatabyusinganyinput")
    public ResponseEntity<List<Employee>> getDataByUsingAnyInput(@RequestBody Employee employee)
    {
        return ResponseEntity.ok(employeeService.getDataByUsingAnyInput(employee));
    }
    @GetMapping("/api")
    public String sayHello()
    {
      return "WELCOME TO PUNE";
    }


}
