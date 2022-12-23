package org.tnsindia.client;

import java.util.List;
import java.util.Scanner;

import org.tnsindia.entities.Employee;
import org.tnsindia.service.EmployeeService;
import org.tnsindia.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {

		int choice;
		/*EmplService contains all the CRUD method that's why we have created the 
		 * object for EmployeeService
		 */
		EmployeeService service=new EmployeeServiceImpl();
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("Enter the Choice: ");
			System.out.println("1.Insert"+"\n2.Update"+"\n3.Reteive"+
			"\n4.RetriveAll"+"\n5.Delete"+"\n -1. Exit");

			choice=s.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter the details of the Employee for insertion");
				Employee emp=new Employee(s.nextInt(),s.nextLine());
				if(service.AddEmployee(emp))
				{
					System.out.println("Data inserted Successfully");
				}
				else
				{
					System.out.println("There was a problem in creation");

				}
			}
			break;
			case 2:
			{
				System.out.println("Enter the details of the Employee for Updation");
				Employee emp=new Employee();
				//retreive emp ID
				emp.setID(s.nextInt());
				System.out.println("Enter the updated Name: ");
				s.nextLine();
				emp.setNAME(s.nextLine());
				Employee e2=service.UpdateEmployee(emp);
				if(e2!=null)
				{
					System.out.println("Updated the data successfully");
				}
				else
				{
					System.out.println("There was a problem in updation");

				}
				
			}
			break;

			case 3:
			{
				System.out.println("Enter the Specific emp uid to retrive");
				Employee emp;
				try {
				emp=service.GetEmployee(s.nextInt());
				}
				catch(Exception e)
				{
					emp=null;
					System.out.println("Emp ID is not exist");

				}
				if(emp!=null)
				{
					System.out.println(emp);
					
				}
				else
				{
					System.out.println("Emp ID is not exist");

				}

			}
			break;

			case 4:
			{
				List<Employee>e1=service.GetAll();
				for(Employee itr:e1)
				{
					System.out.println(itr);
				}
			}
			break;
			case 5:
			{
				System.out.println("Enter the Specific emp uid to delete");
				boolean success=service.DeleteEmployee(s.nextInt());
				if(success)
					System.out.println("Employee deleted ");
				else
					
					System.out.println("data not found ");

			}
			break;
			case -1:
			{
				break;
			}
			}
		}while(choice>0);
			
		
		
	}

}
