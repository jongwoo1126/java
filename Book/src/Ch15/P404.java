package Ch15;

public class P404 {

	public static void main(String[] args) {
		
		System.out.println("����");
		Runnable run = () -> {
			for(int i=1;i<=10;i++) {
				System.out.println("ù��°:"+i);
			}
		};
		Runnable run2 = () -> {
			for(int i=1;i<=10;i++) {
				System.out.println("�ι�°:"+i);
			}
		};
		
		Thread t = new Thread(run);
		Thread t2 = new Thread(run2);
		t.start();
		t2.start();
		System.out.println("����");
		
	}
}
