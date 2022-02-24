package Ch16;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class P450 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		long count = list.stream().count();
		System.out.println("��ҵ��� ���� : "+count);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("��ҵ��� �� : "+sum);
		
		// ��Ұ� ���� ���� �߻�(P450)
		/*
		OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();
		System.out.println("��ҵ��� ��� : "+avg.getAsDouble());
		
		OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
		System.out.println("��ҵ��� �ִ� �� : "+max.getAsInt());
		
		OptionalInt min = list.stream().mapToInt(Integer::intValue).min();
		System.out.println("��ҵ��� �ּ� �� : "+min.getAsInt());
		
		OptionalInt first = list.stream().mapToInt(Integer::intValue).findFirst();
		System.out.println("��ҵ� �� ù��° �� : "+first.getAsInt());
		*/
		
		// ��Ұ� �����ϴ� ��쿡�� ��� ���(P452)
		OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();
		
		if(avg.isPresent()) {
			System.out.println("��ҵ��� ��� : "+avg.getAsDouble());
		}
		
		// ��Ұ��� ���� ��� �⺻�� ����(P452)
		int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("��ҵ� �� �ִ� �� : "+max);
		
		int min = list.stream().mapToInt(Integer::intValue).min().orElse(-1);
		System.out.println("��ҵ� �� �ּ� �� : "+min);
		
		// ��Ұ� �����ϸ� ����(P452)
		list.stream().mapToInt(Integer::intValue).findFirst().ifPresent(a -> System.out.println("��� �� ù��° �� : "+a));
	}
}
