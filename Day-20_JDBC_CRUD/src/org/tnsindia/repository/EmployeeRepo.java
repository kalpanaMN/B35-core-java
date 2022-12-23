package org.tnsindia.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.tnsindia.entities.Employee;

public interface EmployeeRepo {
	
	//to execute a query use Statement
	Statement createStatement();
	PreparedStatement createPrepareStatement(String query);
	public ResultSet retreive(String query);
	public int add(String query, Employee emp);
	public int update(String query, Employee emp);
	public int delete(String query);


}
