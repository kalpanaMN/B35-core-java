package tns.india.demoonoperator;
import java.util.Scanner;

public class TernoryOperator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a= s.nextInt();
		int b=s.nextInt();
		int result=(a>b)?a:b;
		String result1=(a>b)?"true":"false";
		System.out.println("result is"+result);
		System.out.println("result is"+result1);

	}

}

 