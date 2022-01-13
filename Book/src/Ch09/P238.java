package Ch09;

class Amd implements GraphicCard{
	
	public void process() {
		System.out.println("AMD 그래픽 처리");
	}
}

class Nvidia implements GraphicCard{
	
	public void process() {
		System.out.println("Nvidia 그래픽 처리");
	}
}

public class P238 {

	public static void main(String[] args) {
		
		GraphicCard gc = new Amd();
		
		System.out.println("메모리 : "+gc.MEMORY);
		
		// AMD로 생성
		gc = new Amd();
		gc.process();
		
		// Nvidia로 교체
		gc = new Nvidia();
		gc.process();
	}
}
