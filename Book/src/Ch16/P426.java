package Ch16;

import java.util.stream.Stream;

public class P426 {
	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.iterate(1, n -> n + 1).limit(10);
		stream.forEach(s -> System.out.println(s));
	}
}
