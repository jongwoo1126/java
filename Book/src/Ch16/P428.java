package Ch16;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class P428 {
	public static void main(String[] args) {
		System.out.println("int 형 난수 스트림 : ");
		IntStream isr = new Random().ints(3);
		isr.forEach(s -> System.out.println(s));
		
		isr = new Random().ints(10, 0, 3);
		isr.forEach(s -> System.out.println(s));
		System.out.println();
		
		System.out.println("long 형 난수 스트림 : ");
		LongStream lsr = new Random().longs(3, 0, 10);
		lsr.forEach(s -> System.out.println(s));
		System.out.println();
		
		System.out.println("double 형 난수 스트림 : ");
		DoubleStream dsr = new Random().doubles(3);
		dsr.forEach(s -> System.out.println(s));
	}
}
