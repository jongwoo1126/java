package Ch16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P441 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("ȫ�浿", "������", "�̼���", "������");
		System.out.println("�⺻ ����");
		list.stream().sorted().forEach(System.out::println);
		System.out.println();
		
		System.out.println("���� ����");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}
}
