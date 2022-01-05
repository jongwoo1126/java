package Ch05;
/*
 * 날짜 : 2022/01/04
 * 이름 : 박종우
 * 내용 : 중첩 반복문
 */
public class p98 {

	public static void main(String[] args) {
		
		for(int j=2 ; j<10 ; j++) {
			System.out.println("["+j+"단]");
			for(int i=1 ; i<10 ; i++) {
				System.out.println(j + " * " + i + " = " + j*i );
			}
		}
			
	}
}
