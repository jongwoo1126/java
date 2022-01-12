package Test3;

class Customer{
	private int id;
	private String name;
	private String grade;
	private int point;
	private double pointRatio;
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.point = point;
		this.pointRatio = pointRatio;
	}
	
	public int calcPrice(int price) {
		point += price * pointRatio;
		return price;
	}
	
	public void showInfo() {
		System.out.println("===================");
		System.out.println("����ȣ : "+id);
		System.out.println("���̸� : "+name);
		System.out.println("����� : "+grade);
		System.out.println("���� ����Ʈ : "+point);
		System.out.println("����Ʈ ������ : "+poinRatio);
		
	}
}

class VipCustomer extends Customer{
	
	private double saleRatio;
	
	public VipCustomer(int id, String name) {
		this.id = id++;
		super.grade = "VIP";
		super.point = 1000;
		super.pointRatio = 0.1;
		this.saleRatio;
	}
}
public class Ex07 {
	
	public static void main(String[] args) {
		
		Customer kim = new Customer(1001, "������");
		VipCustomer lee = new VipCustomer(1002, "�̼���");
		
		System.out.println("�����ߴ��� ������ �ݾ� : "+kim.calcPrice(10000));
		System.out.println("�̼��Ŵ��� ������ �ݾ� : "+lee.calcPrice(10000));
		
		kim.showInfo();
		lee.showInfo();
		
	}

}
