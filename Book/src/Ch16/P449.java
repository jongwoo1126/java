package Ch16;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class P449 {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		for(int i=0 ; i<100 ; i++) {
			arr[i] = i+1;
		}
		
		long count = Arrays.stream(arr).count();
		System.out.println("요소들의 갯수 : "+count);
		
		int sum = Arrays.stream(arr).sum();
		System.out.println("요소들의 합 : "+sum);
		
		OptionalInt first = Arrays.stream(arr).findFirst();
		System.out.println("요소들 중 첫번째 값 : "+first.getAsInt());
		
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println("요소들 중 최대 값 : " +max.getAsInt());
		
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("요소들 중 최소 값 : "+min.getAsInt());
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println("요소들의 평균 : "+avg.getAsDouble());
	}
}
