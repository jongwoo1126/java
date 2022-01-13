package Ch05;
/*
 * 날짜 : 2022/01/05
 * 이름 : 박종우
 * 내용 : 자바 클래스 실습하기 교재 p159 
 */
public class Sub1_ClassTest {

	public static void main(String[] args) {
		
		// Car 객체 생성
		Car sonata = new Car("소나타", "흰색", 0);
		
		// 객체 초기화
		sonata.speedUp(100);
		sonata.speedDown(60);
		sonata.show();
		
		// bmw 객체 생성
		Car bmw = new Car("520d", "남색", 0);
		
		// 객체 초기화
		bmw.speedUp(60);
		bmw.speedDown(10);
		bmw.show();
		
		//  Account
		Account kb = new Account("국민은행", "101-12-1020", "김유신", 10000);
		kb.deposit(40000);
		kb.withdraw(5000);
		
		// 참조변수로 객체의 변수를 직접 참조해서 취약점 발생 --> 캡슐화 적용으로 취약코드 예방
		//kb.balance--;
		
		kb.show();
		
		Account wr = new Account("우리은행", "111-11-1325", "김춘추", 30000);
		wr.deposit(10000);
		wr.withdraw(12000);
		wr.show();
				
		
				
	}
}
