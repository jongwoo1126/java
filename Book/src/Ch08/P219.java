package Ch08;

class Animal{
	String type;
	String name;
	
	Animal(String type, String name){
		this.type = type;
		this.name = name;
	}
	void sleep() {
		System.out.println(this.name +"��(��) ���� �ܴ�.");
	}
}

class Eagle extends Animal{
	Eagle(String type, String name){
		super(type, name);
	}
	
	void sleep() {
		System.out.println(this.name +"��(��) �ϴÿ��� ���� �ܴ�.");
	
	}
}

class Tiger extends Animal{
	Tiger(String type, String name){
		super(type, name);
	}
	void sleep() {
		System.out.println(this.name +"��(��) ��ӿ��� ���� �ܴ�.");
	
	}
}

class Lion extends Animal{
	Lion(String type, String name){
		super(type, name);
	}
	void sleep() {
		System.out.println(this.name +"��(��) ���ӿ��� ���� �ܴ�.");
	
	}
}

class Shark extends Animal{
	Shark(String type, String name){
		super(type, name);
	}
	void sleep() {
		System.out.println(this.name +"��(��) ���ӿ��� ���� �ܴ�.");
	
	}
}

public class P219 {

}
