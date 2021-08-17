package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.ServiceI;

@RestController
public class EmployeeController {

	@Autowired
	private ServiceI s;

	@PostMapping("/addEmployee/{dname}")
	public String m1(@RequestBody List<Employee> employee, @PathVariable("dname") String dname) {
		System.out.println("Department :" + employee + "   " + dname);
		s.addEmployeeWithDepartment(employee, dname);
		return "Department inserted";
	}

	@DeleteMapping("/{id}")
	public List<Employee> m2(@PathVariable("id") int id) {
		return s.deletePerticularEmployee(id);
	}

	@DeleteMapping("/allDataDelete")
	public List<Employee> m3() {
		return s.deleteAlData();
	}

	@PostMapping("/store")
	public String storeEmpl(@RequestBody Employee emp)

	{
		String msg = s.storeData(emp);
		return msg;
	}
}
