package Ch07;

class AAA{
	AAA(){
		System.out.println("ù ��° ������");
	}
	AAA(int a){
		this();
		System.out.println("�� ��° ������");
	}
}

public class P257 {
	
	public static void main(String[] args) {
		
		AAA aaa1 = new AAA();
		System.out.println();
		AAA aaa2 = new AAA(3);
	}

}
