package Ch05;
/*
 * 날짜 : 2022/01/05
 * 이름 : 박종우
 * 내용 : 자바 Static 실습하기 교재 p148
 * 
 *  정적변수 (클래스 변수)
 *   - 클래스에서 static을 선언한 멤버변수
 *   - 메모리에서 하나의 변수로 관리
 *   - 클래스 타입으로 직접 참조 가능
 *   
 *  정적메서드(클래스 메서드)
 *   - 클래스에서 static을 선언한 멤버메서드
 *   - 메모리에서 하나의 메서드로 관리
 *   - 클래스 타입으로 직접 호출 가능
 * 
 */
public class Sub2_StaticTest {
	
	public static void main(String[] args) {
		
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		// 정적변수, 정적메서드는 클래스 이름으로 집접 참조할 수 있다.
		Increment.num2 = 0;
		Increment.add();
	}

}
