package Ch07;

class Student3{

	// 필드
	String name;
	int grade;
	String department;
	
	// 1번 생성자
	Student3(){
		
	}
	
	// 2번 생성자
	Student3(String n){
		name = n;
	}
	
	// 3번 생성자
	Student3(String n, int g){
		name = n;
		grade = g;
	}
	
	// 4번 생성자
	Student3(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
	}
	
}
public class P171 {

	public static void main(String[] args) {
		
		Student3 stu1 = new Student3();
		Student3 stu2 = new Student3("홍길동");
		Student3 stu3 = new Student3("홍길동", 4);
		Student3 stu4 = new Student3("홍길동", 4, "소프트웨어공학");
		
	}
	
}
