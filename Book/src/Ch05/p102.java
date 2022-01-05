package Ch05;
/*
 * 날짜 : 2022/01/05
 * 이름 : 박종우
 * 내용 : 반복문 중지
 */
public class p102 {

	public static void main(String[] args) {
		
		for(int i=0 ; i<10 ; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
