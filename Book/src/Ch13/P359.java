package Ch13;

import java.util.HashSet;
import java.util.Set;

public class P359 {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add(new String("abc"));
		set.add(new String("abc"));
		
		// ����� ���� Ŭ����
		set.add(new P360("ȫ�浿", 40));
		set.add(new P360("ȫ�浿", 40));
		
		System.out.println(set);
	}
}
