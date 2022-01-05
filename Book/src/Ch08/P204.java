package Ch08;

class Taxi extends P203{
	
	public void go() {
		System.out.println("미터기를 켜고 전진");
	}
}

public class P204 {

	public static void main(String[] args) {
		
		Taxi t = new Taxi();
		t.go();
	}
}
