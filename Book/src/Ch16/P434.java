package Ch16;

import java.util.Arrays;
import java.util.List;

public class P434 {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("ȫ�浿", "������", "ȫ�浿", "�̼���", "ȫ�浿", "������");
		
		System.out.println("distinct()");
		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();
		
		System.out.println("filter()");
		list.stream().filter(n -> n.startsWith("ȫ")).forEach(n -> System.out.println(n));
		System.out.println();
		
		System.out.println("distinct() + filter()");
		list.stream().distinct().filter(n -> n.startsWith("ȫ")).forEach(n -> System.out.println(n));
		
		
		
	}
}
