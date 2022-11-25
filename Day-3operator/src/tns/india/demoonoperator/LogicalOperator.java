package tns.india.demoonoperator;
import java.util.Scanner;

public class LogicalOperator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a= s.nextInt();
		int w=s.nextInt();
		boolean result=(a>18)&&(w>50);
		System.out.println("result is :"+result);
		s.close();

	}

}
