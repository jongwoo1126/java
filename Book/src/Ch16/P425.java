package Ch16;

import java.util.stream.Stream;

public class P425 {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.generate(() -> "¾Ö±¹°¡").limit(10);
		
		stream.forEach(s -> System.out.println(s));
	}
}
