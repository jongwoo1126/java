package Ch16;

import java.util.Arrays;
import java.util.List;

public class P439 {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("���ع���", "��λ���", "������ �⵵��");
		
		System.out.println("�Լ��� �������̽� ���");
		list.stream().mapToInt(s -> s.length()).forEach(len -> System.out.println(len));
		System.out.println();
		
		System.out.println("�޼��� ���� ���");
		list.stream().mapToInt(String::length).forEach(len -> System.out.println(len));
	}
}
