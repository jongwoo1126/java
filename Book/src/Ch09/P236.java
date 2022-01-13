package Ch09;

public class P236 {

	public static void main(String[] args) {
		
		ComplexcerInterface ci = new ComplexcerInterface() {
			
			@Override
			public void send(String tel) {
				System.out.println("여기는 익명 구현 객체의 send");
				
			}
			
			@Override
			public void receive(String tel) {
				System.out.println("여기는 익명 구현 객체의 receive");
				
			}
			
			@Override
			public void scan() {
				System.out.println("여기는 익명 구현 객체의 scan");
				
			}
			
			@Override
			public void print() {
				System.out.println("여기는 익명 구현 객체의 print");
				
			}
		};
		
		ci.send("1234");
		ci.receive("5678");
		ci.print();
		ci.scan();
	}
}
