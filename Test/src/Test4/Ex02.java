package Test4;

import java.util.Scanner;

class NotFoundException extends Exception{
	public NotFoundException() {
		super("�ش��ϴ� ���ڸ� ã�� �� �����ϴ�.");
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		int[] arr = {2, 4, 6, 8 , 10};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ã�� ���� �Է� : ");
		int find = sc.nextInt();
		
		try {
			searchArray(find, arr);
			System.out.println("�ش��Ѵ� ���� ã�� !!!");
			
		}catch(NotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		
		System.out.println("���α׷� ���� ����...");
}
	
	
	public static void searchArray(int find, int[] arr) throws NotFoundException {
		
		for(int i : arr) {
			if(i == find) {
				return;
			}
		}
		throw new NotFoundException();
	}
}
