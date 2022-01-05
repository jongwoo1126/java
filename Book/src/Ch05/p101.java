package Ch05;
/*
 * 날짜 : 2022/01/05
 * 이름 : 박종우
 * 내용 : 반복문 중지
 */
public class p101 {

	public static void main(String[] args) {
		
		target : for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				if(j == 3) {
					break target;
				}
				System.out.println("i = "+i+", j = "+j);
			}
		}
		
	}

}
