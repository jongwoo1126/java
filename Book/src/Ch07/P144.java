package Ch07;

class Car{
	
	//필드
	String color;
	String company;
	String type;
	
	//메서드
	public void go() {
		System.out.println("전진하다.");
	}
	public void back() {
		System.out.println("후진하다.");
	}
}

public class P144 {
	
	public static void main(String[] args) {
		
		Car tico = new Car();
		Car pride = new Car();
		
		tico.color = "화이트";
		tico.company = "대우";
		tico.type = "경차";
		
		pride.color = "블랙";
		pride.company = "기아";
		pride.type = "소형";
		
		tico.go();
		pride.go();
		
		System.out.println(tico.color);
		System.out.println(tico.company);
		System.out.println(tico.type);
		
		System.out.println(pride.color);
		System.out.println(pride.company);
		System.out.println(pride.type);
	}

}
