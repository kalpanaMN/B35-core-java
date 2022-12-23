package org.tnsindia.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.tnsindia.entities.Employee;
import org.tnsindia.repository.EmployeeRepo;
import org.tnsindia.repository.EmployeeRepoImpl;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public boolean AddEmployee(Employee emp) {
		String query="INSERT INTO EMPLOYEE VALUES(?,?)";
		EmployeeRepo repo=new EmployeeRepoImpl();
		int count=repo.add(query, emp);
		if(count==1)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public Employee UpdateEmployee(Employee emp) {
		String query="UPDATE EMPLOYEE SET NAME=? WHERE (ID=?)";
		EmployeeRepo repo=new EmployeeRepoImpl();
		int count=repo.update(query, emp);
		if(count==1)
		{
			Employee e=GetEmployee(emp.getID());
			return e;
		}
		
		return null;
	}

	@Override
	public boolean DeleteEmployee(int ID) {
			String query="DELETE FROM EMPLOYEE WHERE ID= "+ID;
			EmployeeRepo repo=new EmployeeRepoImpl();
			int count=repo.delete(query);
			if(count==1)
			{
				return true;
			}
			
			return false;
	}

	@Override
	public Employee GetEmployee(int ID) {
		Employee emp=new Employee();
		EmployeeRepo repo=new EmployeeRepoImpl();
		String query="SELECT * FROM EMPLOYEE  WHERE ID= "+ID;
		ResultSet rs=repo.retreive(query);
		
		try {
			rs.next();
			emp.setID(rs.getInt(1));
			emp.setNAME(rs.getString(2));
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		return emp;
	}

	@Override
	public List<Employee> GetAll() {
		List<Employee> e1=new ArrayList<Employee>();
		EmployeeRepo repo=new EmployeeRepoImpl();
		String query="SELECT * FROM EMPLOYEE";
		ResultSet rs=repo.retreive(query);
		
		try {
			while(rs.next())
			{
				Employee emp=new Employee();
				emp.setID(rs.getInt(1));
				emp.setNAME(rs.getString(2));
				e1.add(emp);

			}
		}

			
		catch (SQLException e) {
			System.out.println(e);
		}
		
		return e1;
	}

}
