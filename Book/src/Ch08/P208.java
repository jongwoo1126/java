package Ch08;

public class P208 {

	public static void main(String[] args) {
		
		P206 P = new Child4();
		
		P.run();
		
		// �ڽ� Ŭ������ �ڷ������� ��ȯ
		Child4 c = (Child4)P;
		c.eat();
	}
}
