package Ch08;

class Child4 extends P206{
	
	String name;
	
	// ������ �޼���
	void run() {
		System.out.println("�ڽ��� �޸���.");
	}
	
	//�߰��� �޼���
	void eat() {
		System.out.println("�ڽ��� �Դ´�.");
	}
}

public class P207 {
	
	public static void main(String[] args) {
		
		Child4 c = new Child4();
		
		c.run();
		
		// �θ� Ŭ������ �ڷ������� ����
		P206 P = new Child4();
		P.run();   // �����̵� �޼��尡 ����
		//p.eat();   ����
	}

}
