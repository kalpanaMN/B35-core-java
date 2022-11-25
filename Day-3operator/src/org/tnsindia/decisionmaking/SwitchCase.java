package org.tnsindia.decisionmaking;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		switch(num)
		{
		 case 1:
		 {
			System.out.println("eating");
			break;
		 }
		 case 2:
		 {
			System.out.println("playing");
			break;
		 }
		 case 3:
		 {
			System.out.println("sleeping");
			break;
		 }
		 default:
		 {
			System.out.println("invalid input");
		 }
	    }
		s.close();

}
}


