package Ch16;

import java.util.stream.Stream;

public class P424 {
	public static void main(String[] args) {
		
		Stream stream = Stream.builder()
				.add("����ȭ")
				.add("��õ��")
				.add("ȭ������")
				.add("���ѻ��")
				.build();
		
		stream.forEach(s -> System.out.println(s+" "));
	}
}
