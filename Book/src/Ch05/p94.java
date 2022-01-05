package Ch05;
/*
 * 날짜 : 2022/01/04
 * 이름 : 박종우
 * 내용 : do~while문
 */
public class p94 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		}while(i <= 100);
		
		System.out.println("합계 : "+sum);
	}
}
