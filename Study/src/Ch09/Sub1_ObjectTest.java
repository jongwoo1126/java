package Ch09;
/*
 * 날짜 : 2022/01/10
 * 이름 : 박종우
 * 내용 : 자바 Object 내장클래스 실습하기 교재 p284
 */
public class Sub1_ObjectTest {

	public static void main(String[] args) {
		
		// 자바의 최상위 클래스 Object로 업캐스팅(다형성)
		Object apple = new Apple("한국", 5000);
		Object banana = new Banana("일본", 3000);
		
		apple.toString();
		banana.toString();
	}
}
