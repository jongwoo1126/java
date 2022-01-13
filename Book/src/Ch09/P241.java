package Ch09;

class Eagle implements Animal{

	@Override
	public void sleep() {
		System.out.println("잠을 잔다.");
		
	}
	
	public void eat() {
		System.out.println("먹는다.");
		
	}
	
}

public class P241 {

	public static void main(String[] args) {
		
		Animal eagle = new Eagle();
		
		eagle.sleep();
		// eagle.eat(); 에러발생
		
		Eagle eagleObj = (Eagle)eagle;  // 강제 형변환
		eagleObj.eat();  				// Eagle 클래스의 eat() 메서드
	}
}
