package org.tnsindia.finalkeyworddemo;

public class FinalMethodExecutor {

	public static void main(String[] args) {
		FinalMethodWithChild f=new FinalMethodWithChild ();
		f.aadhar_no=345678991678L;
		f.PAN_no="DFK157890";
		//f.print();
		f.print(f.PAN_no);
		

	}

}
