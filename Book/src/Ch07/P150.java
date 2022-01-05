package Ch07;

public class P150 {

	public static void main(String[] args) {
		
		Local local = new Local();
		
		System.out.println(local.name);
		
		local.process();
		System.out.println(local.name);
		
		local.printAge1();
		local.printAge2();
		
		// for문 블록 내에서의 변수 선언
		for(int i=0 ; i<10 ; i++) {
			int temp = 0;
			temp += 1;
		
		}
		System.out.println(temp);   // 에러(for문 안에서만 사용되는 지역변수 temp)
		
	}
}

class Local{
	
	String name;
	
	void process() {
		name = "홍길동";
	}
	void printAge1() {
		int age = 20;
		System.out.println(age);
	}
	
	void printAge2() {
		int age = 30;
		System.out.println(age);
	}
}