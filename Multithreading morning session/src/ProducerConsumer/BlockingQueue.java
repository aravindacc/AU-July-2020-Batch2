package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class BlockingQueue {

	public static void main(String[] args) {

List<Integer> sharedList=new ArrayList<Integer>();
		
		Thread thread1 = new Thread (new Producer(sharedList));
		Thread thread2 = new Thread (new Consumer(sharedList));
		thread1.start();
		thread2.start();
	}

}

class Producer implements Runnable{
	List<Integer> sharedList =null;
	final int MAX_SIZE =7;
	private int i=0;
	public Producer(List<Integer> sharedList) {
		super();
		this.sharedList = sharedList;
	}

	public void run() {
		while(true) {
			try {
				produce(i++);
			} catch (InterruptedException e) {
				
			}
			
		}
	}
	
	public void produce(int i) throws InterruptedException
	{
		synchronized (sharedList) {
			while(sharedList.size()==MAX_SIZE) {
				System.out.println("Queue is full.Non task is taken bhy any of consumer");
				sharedList.wait();
			}
		}
		synchronized (sharedList) {
			System.out.println("Producer produces element" + i );
			sharedList.add(i);
			Thread.sleep(1000);
			sharedList.notify();
		}
	}
	
}
 
 class Consumer implements Runnable{
	List<Integer> sharedList =null;
	
       Consumer(List<Integer> sharedList) {
		super();
		this.sharedList = sharedList;
	}

	public void run() {
		while(true) {
			try {
				Consume();
			} catch (InterruptedException e) {
				
			}
			
		}
	}
	
	public void Consume() throws InterruptedException
	{
		synchronized (sharedList) {
			while(sharedList.isEmpty()) {
				System.out.println("Queue is empty.There is no task in the queue");
				sharedList.wait();
			}
		}
		synchronized (sharedList) {
			
			
			Thread.sleep(1000);
			System.out.println("Consumed element is:"  + sharedList.remove(0));
			sharedList.notify();
		}
	}
 }
