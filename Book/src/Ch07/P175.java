package Ch07;

public class P175 {

	// 생성자
	P175(){
		System.out.println("생성자 호출");
	 }
	
	// static 초기화 블럭
	static {
		System.out.println("클래스 초기화 블럭 실행");
	}
	
	//인스턴스 초기화 블럭
	{
		System.out.println("인스턴스 초기화 블럭 실행");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main 메서드시작");
		System.out.println("main init 객체 생성");
		P175 init1 = new P175();
		System.out.println("main init2 객체 생성");
		P175 init2 = new P175();
	}
}
