package Ch07;

public class P169 {
	
	public static void main(String[] args) {
		
		Student stu = new Student("홍길동", 4, "소프트웨어공학");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		Student stu2 = new Student("이순신", 3, "디자인");
	
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
		// 기본 생성자로 객체 생성
		// Student stu0 = new Student(); --> 에러 발생
	}

}
