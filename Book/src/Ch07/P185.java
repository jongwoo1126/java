package Ch07;

import Ch07.P184;

public class P185 {

	public static void main(String[] args) {
		
		P184 ca = new P184();
		ca.print();
		
		ClassB cb = new ClassB();  //접근제한자 때문에 에러
	}
}
