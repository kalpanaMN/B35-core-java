package org.tnsindia.streamapidemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//demo on reduce
public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(15,7,3,39);
		Optional<Integer> result = intList.stream().reduce((a,b)->(a>b)?a:b);
		if(result.isPresent()) {
		System.out.println("Result:"+result.get());
		}
	}


	

}
