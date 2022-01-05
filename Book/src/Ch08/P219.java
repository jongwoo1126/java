package Ch08;

class Animal{
	String type;
	String name;
	
	Animal(String type, String name){
		this.type = type;
		this.name = name;
	}
	void sleep() {
		System.out.println(this.name +"은(는) 잠을 잔다.");
	}
}

class Eagle extends Animal{
	Eagle(String type, String name){
		super(type, name);
	}
	
	void sleep() {
		System.out.println(this.name +"은(는) 하늘에서 잠을 잔다.");
	
	}
}

class Tiger extends Animal{
	Tiger(String type, String name){
		super(type, name);
	}
	void sleep() {
		System.out.println(this.name +"은(는) 산속에서 잠을 잔다.");
	
	}
}

class Lion extends Animal{
	Lion(String type, String name){
		super(type, name);
	}
	void sleep() {
		System.out.println(this.name +"은(는) 숲속에서 잠을 잔다.");
	
	}
}

class Shark extends Animal{
	Shark(String type, String name){
		super(type, name);
	}
	void sleep() {
		System.out.println(this.name +"은(는) 물속에서 잠을 잔다.");
	
	}
}

public class P219 {

}
