package Ch16;

import java.util.Arrays;
import java.util.List;

public class P434 {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("È«±æµ¿", "±èÀ¯½Å", "È«±æµ¿", "ÀÌ¼ø½Å", "È«±æµ¿", "À¯°ü¼ø");
		
		System.out.println("distinct()");
		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();
		
		System.out.println("filter()");
		list.stream().filter(n -> n.startsWith("È«")).forEach(n -> System.out.println(n));
		System.out.println();
		
		System.out.println("distinct() + filter()");
		list.stream().distinct().filter(n -> n.startsWith("È«")).forEach(n -> System.out.println(n));
		
		
		
	}
}
