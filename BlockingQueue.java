package com.hcl;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingQueue {
	public static void main(String[] args) throws InterruptedException {
		ArrayBlockingQueue<String> queue = new  ArrayBlockingQueue<>(5);
		queue.put("srh");
		queue.put("mi");
		queue.put("kkr");
		queue.put("rcb");
		queue.put("dc");
		System.out.println("  "+queue);
		
		queue.remove("kkr");
		queue.remove();
		System.out.println(queue);
		queue.put("rr");
		
		 System.out.println(queue);
     
      LinkedBlockingDeque<Integer> bq = new LinkedBlockingDeque<>(4);
      bq.add(212);
      bq.add(111);
      bq.add(343);
      bq.add(666);
      
      System.out.println("  "+bq);
      bq.remove();
      bq.remove();
      System.out.println(bq);

		
	}

}
