package Ch07;

public class P172 {
	
	    // 필드
		String name;
		int grade;
		String department;
		
		// 1번 생성자
		P172(){
			
		}
		
		// 2번 생성자
		P172(String n){
			name = n;
		}
		
		// 3번 생성자
		P172(String n, int g){
			name = n;
			grade = g;
		}
		
		// 4번 생성자
		P172(String n, int g, String d){
			name = n;
			grade = g;
			department = d;
		}
		
		// 학과와 학년을 매개변수로 받는 생성자 (에러 발생)
		//P172(String d, int g){
		//	department = d;
		//	grade = g;
	//}
}
