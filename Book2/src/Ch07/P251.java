package Ch07;

class G {
	G(){
		System.out.println("첫 번째 생성자");
	}
	G(int a){
		System.out.println("두 번째 생성자");
	}
	G(int a, int b){
		System.out.println("세 번째 생성자");
	}
}

public class P251 {
	
	public static void main(String[] args) {
		G g1 = new G();
		G g2 = new G(3);
		G g3 = new G(3, 5);
	}
}
