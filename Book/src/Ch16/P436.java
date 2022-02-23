package Ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class P436 {
	
	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("동해물과", "백두산이", "마르고 닳도록");
		list1.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(word -> System.out.println(word));
		System.out.println();
		
		List<String> list2 = Arrays.asList("1.1, 2.2, 3.3", "4.4, 5.5, 6.6");
		DoubleStream dsr = list2.stream().flatMapToDouble(data -> {
				String [] strArr = data.split(",");
				double [] dArr = new double [strArr.length];
				for (int i=0 ; i<dArr.length ; i++) {
					dArr[i] = Double.parseDouble(strArr[i].trim());
				}
				return Arrays.stream(dArr);
		});
		dsr.forEach(n -> System.out.println(n));
		System.out.println();
		
		
		List<String> list3 = Arrays.asList("1, 2, 3", "4, 5, 6");
		IntStream isr = list3.stream().flatMapToInt(data -> {
			String [] strArr = data.split(",");
			int [] intArr = new int [strArr.length];
			for(int i=0 ; i<strArr.length ; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		});
		isr.forEach(n -> System.out.println(n));
	}
}
