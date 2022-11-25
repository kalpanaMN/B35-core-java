package loopingstatement;
import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		int i=1;
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(i=1;i<num;i++)
		{
			System.out.println("welcome"+i);
			
		}
		s.close();
	}



}
