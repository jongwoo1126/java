package Ch05;
/*
 * 날짜 : 2022/01/04
 * 이름 : 박종우
 * 내용 : while문
 */
public class p93 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("합계 : "+sum);
	}
}
