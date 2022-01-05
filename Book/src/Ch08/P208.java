package Ch08;

public class P208 {

	public static void main(String[] args) {
		
		P206 P = new Child4();
		
		P.run();
		
		// 자식 클래스의 자료형으로 변환
		Child4 c = (Child4)P;
		c.eat();
	}
}
