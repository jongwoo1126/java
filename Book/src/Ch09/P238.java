package Ch09;

class Amd implements GraphicCard{
	
	public void process() {
		System.out.println("AMD �׷��� ó��");
	}
}

class Nvidia implements GraphicCard{
	
	public void process() {
		System.out.println("Nvidia �׷��� ó��");
	}
}

public class P238 {

	public static void main(String[] args) {
		
		GraphicCard gc = new Amd();
		
		System.out.println("�޸� : "+gc.MEMORY);
		
		// AMD�� ����
		gc = new Amd();
		gc.process();
		
		// Nvidia�� ��ü
		gc = new Nvidia();
		gc.process();
	}
}
