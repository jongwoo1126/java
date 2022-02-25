package Ch17;

import java.util.Iterator;

public class P464 {

	public static void main(String[] args) {
		
		ThreadExtend t1 = new ThreadExtend();
		
		Runnable r = new RunnableImple();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

class ThreadExtend extends Thread{
	public void run() {
		System.out.println("Thread 惑加罐绰 规过");
		for (int i = 0; i < 50; i++) {
			System.out.println("ThreadExtend:"+i);
		}
	}
}

class RunnableImple implements Runnable{
	public void run() {
		System.out.println("Runnable 备泅窍绰 规过");
		for (int i = 0; i < 50; i++) {
			System.out.println("RunnableImple:"+i);
			
		}
	}
}
