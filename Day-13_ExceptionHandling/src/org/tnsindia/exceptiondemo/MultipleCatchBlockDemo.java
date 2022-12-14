package org.tnsindia.exceptiondemo;
//Demo on Multiple catch block
public class MultipleCatchBlockDemo {

	public static void main(String[] args) {
		try {
			//by default it takes 0 as we have not pass any argument to args
			int a=args.length;
			System.out.println("The length of a is: "+a);
			int b=12/a;
			System.out.println(b);
			int arr[]= {23,45,41};
			System.out.println(arr[3]);
			String x=null;
			System.out.println(x.length());
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("Exception handled "+e);
		}

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception Handled"+e);

        }*/
		//child catch block
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled");
		}
		//default exception-parent catch block
		catch(Exception e)
		{
			System.out.println(e);

		}
		finally
		{
        	System.out.println("Finally block is always executed");

		}

	}

}
