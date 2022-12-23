package org.tnsindia.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.tnsindia.dao.EmployeeDAO;
import org.tnsindia.entities.Employee;

public class EmployeeRepoImpl implements EmployeeRepo{

	
	EmployeeDAO dao;
	
	
	public EmployeeRepoImpl() {
		dao=new EmployeeDAO();
	}

	@Override
	public Statement createStatement() {
		Connection c=dao.createConnection();
		Statement s;
		
		try {
			s=c.createStatement();
		} catch (SQLException e) {
			s=null;
			System.out.println("Something went wrong");
		}
		return s;
	}

	@Override
	public PreparedStatement createPrepareStatement(String query) {
		Connection c=dao.createConnection();
		PreparedStatement s;
		
		try {
			s=c.prepareStatement(query);
		} catch (SQLException e) {
			s=null;
			System.out.println("Something went wrong");
		}
		return s;
	}

	@Override
	public ResultSet retreive(String query) {
		
		Statement s=createStatement();
		ResultSet rs;
		try {
			rs=s.executeQuery(query);
		} catch (SQLException e) {
			rs=null;
			System.out.println("Something went wrong");
		}
		return rs;
	}

	@Override
	public int add(String query, Employee emp) {
		PreparedStatement s=createPrepareStatement(query);
		int count=0;
		try {
			s.setInt(1, emp.getID());
			s.setString(2,emp.getNAME());
			count=s.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Data not found");
		}
		return count;
	}

	@Override
	public int update(String query, Employee emp) {
		PreparedStatement s=createPrepareStatement(query);
		int count=0;
		try {
			s.setInt(2, emp.getID());
			s.setString(1,emp.getNAME());
			count=s.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Data not found");
		}
		return count;
	}

	@Override
	public int delete(String query) {
		Statement s=createStatement();
		int count=0;
		
		try {
			count=s.executeUpdate(query);
		} catch (SQLException e) {
			count=0;
			System.out.println("Data Not found");
		}
		return count;
	}

}
