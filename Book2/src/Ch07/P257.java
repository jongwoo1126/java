package Ch07;

class AAA{
	AAA(){
		System.out.println("첫 번째 생성자");
	}
	AAA(int a){
		this();
		System.out.println("두 번째 생성자");
	}
}

public class P257 {
	
	public static void main(String[] args) {
		
		AAA aaa1 = new AAA();
		System.out.println();
		AAA aaa2 = new AAA(3);
	}

}
