package Ch15;

import java.util.function.Predicate;

public class P416 {
	
	static Student[] list = {
			new Student("ȫ�浿", 90, 80, "�İ�"),
			new Student("�̼���", 95, 70, "���"),
			new Student("������", 100, 60, "�İ�")
	};
	
	public static void main(String[] args) {
		
		double avg = avgEng(t -> t.getMajor().equals("�İ�"));
		System.out.println("�İ��� ��� �������� : "+avg);
		
		double avg2 = avgMath(t -> t.getMajor().equals("�İ�"));
		System.out.println("�İ��� ��� �������� : "+avg2);
		
	}
	private static double avgEng(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for(Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getEng();
			}
		}
		return (double)sum/count;
	}
	
	private static double avgMath(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for(Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getMath();
			}
		}
		return (double)sum/count;
	}
	
}
