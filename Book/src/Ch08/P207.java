package Ch08;

class Child4 extends P206{
	
	String name;
	
	// 재정의 메서드
	void run() {
		System.out.println("자식이 달린다.");
	}
	
	//추가된 메서드
	void eat() {
		System.out.println("자식이 먹는다.");
	}
}

public class P207 {
	
	public static void main(String[] args) {
		
		Child4 c = new Child4();
		
		c.run();
		
		// 부모 클래스의 자료형으로 선언
		P206 P = new Child4();
		P.run();   // 재정이된 메서드가 실행
		//p.eat();   에러
	}

}
