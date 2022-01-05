package Ch07;

public class P173 {

	// 필드
	String color;
	String company;
	String type;
	
	P173(){
		this("white", "기아", "경차");
	}
	
	P173(String color, String company, String type){
		this.color = color;
		this.company = company;
		this.type = type;
	}
	
	P173(String com, String t){
		this("white", com, t);
	}
	
	P173(String t){
		this("white", "기아", t);
	}
	public String toString() {
		return color + "-" + company + "-" + type;
	}
}
