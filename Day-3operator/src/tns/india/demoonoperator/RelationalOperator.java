package tns.india.demoonoperator;
import java.util.Scanner;

public class RelationalOperator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a= s.nextInt();
		int b=s.nextInt();
		boolean result=(a>=b);
		System.out.println("result is :"+result);
        s.close();
	}

}
