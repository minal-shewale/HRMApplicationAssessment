package com.csi.service;

import com.csi.dao.EmployeeDao;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public void addData(Employee employee) {
        employeeDao.addData(employee);
    }

    @Override
    public List<Employee> getDataByUsingAnyInput(Employee employee) {
        return employeeDao.getDataByUsingAnyInput(employee);
    }
}
