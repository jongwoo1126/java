package Ch15;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class P415 {
	
	static Student[] list = {
			new Student("ȫ�浿", 90, 80, "�İ�"),
			new Student("�̼���", 95, 70, "���"),
			new Student("������", 100, 60, "������")
	};
	
	public static void main(String[] args) {
		
		System.out.print("�ִ� ���� ���� : ");
		int max = maxOrMinMath((a, b) -> {
			if(a>=b) return a;
			else return b;
		});
		
		System.out.println(max);
		
		System.out.print("�ּ� �������� : ");
		System.out.println(maxOrMinMath((a,b) ->(a<=b?a:b)));
		
		System.out.print("�ִ� ������� : ");
		System.out.println(maxOrMinAvg((a,b) ->(a>=b?a:b)));
		
		System.out.print("�ּ� ������� : ");
		System.out.println(maxOrMinAvg((a,b) ->(a<=b?a:b)));
	}
	
	private static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for(Student s : list) {
			result = op.applyAsInt(result, s.getMath());
		}
		return result;
	}
	
	private static double maxOrMinAvg(DoubleBinaryOperator op) {
		double result = (list[0].getMath() + list[0].getEng()) / 2.0;
		for(Student s : list) {
			result = op.applyAsDouble(result, (s.getMath()+s.getEng()) / 2.0);
		}
		return result;
	}
}
