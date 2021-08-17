package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;

public interface ServiceI {
	
	void addDepartment(Department department);

	void addEmployeeWithDepartment(List<Employee> employee,String dname);
	
	List<Employee> deletePerticularEmployee(int id);
	
	List<Employee> deleteAlData();
	
	List<Employee> getAllEmployeeUnderPerticularDeprtment(String name);

	String storeData(Employee emp);
}
