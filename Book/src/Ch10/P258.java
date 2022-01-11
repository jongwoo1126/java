package Ch10;

import Ch10.A;
public class P258 {

	public static void main(String[] args) {
		
		A a = new A();
		
		// static 멤버 클래스 객체 생성
		A.B b = new A.B();
		b.var1 =3;
		b.method1();
		A.B.var2 = 3;
		A.B.method2();
		
		// 인스턴스 내부 클래스 객체 생성
		A.P257 c = a.new P257();
		c.var1 = 3;
		c.method1();
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
		
		
	}
}
