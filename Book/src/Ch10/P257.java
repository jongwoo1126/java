package Ch10;

class A{
	A(){
		System.out.println("A 객체 생성");
	}
	
	static class B{
		B(){
			System.out.println("B 객체 생성");
		}
		
		int var1;
		static int var2;
		
		void method1() {
			System.out.println("static 내부 클래스의 method1()");
		}

		static void method2() {
			System.out.println("static 내부 클래스의 static method2()");
		}
	}

	public class P257 {
		P257(){
			System.out.println("P257 객체 생성");
		}
		
		int var1;
		
		void method1() {
			System.out.println("인스턴스 내부 클래스의 method1()");
		}
	}
	
	void method() {
		class D{
			D(){
				System.out.println("D 객체 생성");
			}
			
			int var1;
			
			void method1() {
				System.out.println("로컬 내부 클래스의 method1()");
			}
		}
		D d = new D();
		d.var1 = 3;
		d.method1();
	}
}

