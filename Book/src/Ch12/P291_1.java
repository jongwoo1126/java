package Ch12;

public class P291_1 {

	public static void main(String[] args) {
		Fruit2 f = new Fruit2("사과", "빨강");
		System.out.println(f);
	}
}

class Fruit2{
	String name;
	String color;
	public Fruit2(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public String toString() {
		return "과일이름 : "+this.name+"\n과일 색상 : "+this.color;
	}
	
}
