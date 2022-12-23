package org.tnsindia.service;

import java.util.List;

import org.tnsindia.entities.Employee;

public interface EmployeeService {
	
	//by default all the methods are abstract in an interface
	
	//CRUD user defined method
	public boolean AddEmployee(Employee emp);
	public Employee UpdateEmployee(Employee emp);
	public boolean DeleteEmployee(int ID);
	public Employee GetEmployee(int ID);
	public List<Employee> GetAll();

}
