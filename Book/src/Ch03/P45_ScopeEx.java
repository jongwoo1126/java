package Ch03;
/*
 * 날짜 : 2021/12/31
 * 이름 : 박종우
 * 내용 : 자바 변수의 범위(scope) 교재 p45
 */
public class P45_ScopeEx {
	
	int no;
	
	public static void main(String[] args) {
		
		String name;
		if (true) {
			
			name = "홍길동"
					
			String email = "hong@test.com"		
		}
		
		email = "hong@test.com"
	}

}
