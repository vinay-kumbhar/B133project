package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.service.ServiceI;

@RestController
public class DepartmentController {

	@Autowired
	private ServiceI s;
	
	@PostMapping("/addDeprt")
	public String m1(@RequestBody Department department)
	{
		System.out.println("Department :" +department);
	      s.addDepartment(department);
		return "Department inserted";
	}
	
	@GetMapping("/getallEmployee/{dname}")
	public List<Employee> m3(@PathVariable("dname")String dname){
		return s.getAllEmployeeUnderPerticularDeprtment(dname);
	}
}
