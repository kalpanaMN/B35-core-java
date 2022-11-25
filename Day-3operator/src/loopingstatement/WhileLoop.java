package loopingstatement;
import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int i=1;
		Scanner s=new Scanner(System.in);
		while(i<=5)
		{
			System.out.println("welcome"+i);
			i++;
		}
		s.close();
	}

}
