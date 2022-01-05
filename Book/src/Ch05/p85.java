package Ch05;
/*
 * 날짜 : 2022/01/04
 * 이름 : 박종우
 * 내용 : 중첩 if
 */
public class p85 {

	public static void main(String[] args) {
		
		int math = 90;
		int eng = 95;
		
		if(math >= 60) {
			if(eng >= 60) {  
				System.out.println("통과");
			}else {
				System.out.println("탈락");
			}
		}
	}
}
