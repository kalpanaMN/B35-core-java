package org.tnsindia.collectiondemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer>obj=new PriorityQueue<>();
		obj.add(5);
		obj.add(11);
		obj.add(97);
		obj.add(25);
		System.out.println(obj);
	}

}
