package Ch05;

public class Car {
	
	// �ڵ��� �Ӽ�
	private String color;
	private String name;
	private int speed;
	
	// ������
	public Car(String color, String name, int speed){
		this.color = color;
		this.name = name;
		this.speed = speed;
	}
	// �ڵ��� ���
	public void speedUp(int speed) {
		this.speed += speed;		
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("=======================");
		System.out.println("�ڵ��� ���� : "+this.color);
		System.out.println("�ڵ��� �̸� : "+this.name);
		System.out.println("�ڵ��� ���� �ӵ� : "+this.speed);
	}
	
	

}
