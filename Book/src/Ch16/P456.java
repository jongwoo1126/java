package Ch16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P456 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		
		long start = System.nanoTime();
		list.stream().forEach(a -> {
			try {
				Thread.sleep(1);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		long end = System.nanoTime();
		System.out.println("���� ��Ʈ�� ó�� �ð� : "+(end-start)+" nano sec");
		
		start =System.nanoTime();
		list.parallelStream().forEach(a -> {
			try {
				Thread.sleep(1);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		end = System.nanoTime();
		System.out.println("���� ��Ʈ�� ó�� �ð� : "+(end-start)+" nano sec");
	}
	
}