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
		System.out.println("요소들의 갯수 : "+count);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("요소들의 합 : "+sum);
		
		// 요소가 없어 에러 발생(P450)
		/*
		OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();
		System.out.println("요소들의 평균 : "+avg.getAsDouble());
		
		OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
		System.out.println("요소들의 최대 값 : "+max.getAsInt());
		
		OptionalInt min = list.stream().mapToInt(Integer::intValue).min();
		System.out.println("요소들의 최소 값 : "+min.getAsInt());
		
		OptionalInt first = list.stream().mapToInt(Integer::intValue).findFirst();
		System.out.println("요소들 중 첫번째 값 : "+first.getAsInt());
		*/
		
		// 요소가 존재하는 경우에만 평균 출력(P452)
		OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();
		
		if(avg.isPresent()) {
			System.out.println("요소들의 평균 : "+avg.getAsDouble());
		}
		
		// 요소값이 없는 경우 기본값 설정(P452)
		int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("요소들 중 최대 값 : "+max);
		
		int min = list.stream().mapToInt(Integer::intValue).min().orElse(-1);
		System.out.println("요소들 중 최소 값 : "+min);
		
		// 요소가 존재하면 실행(P452)
		list.stream().mapToInt(Integer::intValue).findFirst().ifPresent(a -> System.out.println("요소 중 첫번째 값 : "+a));
	}
}
