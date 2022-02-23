package Ch16;

import java.util.stream.IntStream;

public class P430 {

	public static void main(String[] args) {
		
		String str = "자바 세상을 만들자";
		
		IntStream isr = str.chars();
		
		isr.forEach(s -> System.out.println((char)s));
	}
}
