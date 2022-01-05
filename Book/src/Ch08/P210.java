package Ch08;

class Nvidia extends GraphicCard{
	
	public void process() {
		System.out.println("Nvidia 그래픽 처리");
	}
}

public class P210 {

	public static void main(String[] args) {
		
		GraphicCard gc = new GraphicCard();
		gc.process();
		
		gc = new Amd();
		gc.process();
		
		gc = new Nvidia();
		gc.process();
	}
}
