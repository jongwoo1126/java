package Ch06;

class A{
	int m = 3;
	void print() {
		System.out.println("��ü ���� �� Ȱ��");
	}
}

public class P219 {

	public static void main(String[] args) {
		
		A a = new A();
		
		a.m = 5;
		System.out.println(a.m);
		
		a.print();
	}
}
