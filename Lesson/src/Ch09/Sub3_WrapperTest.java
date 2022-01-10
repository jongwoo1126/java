package Ch09;
/*
 * 날짜 : 2022/01/10
 * 이름 : 박종우
 * 내용 : 자바 Wrapper 내장클래(API)스 실습하기 교재 p314
 */
public class Sub3_WrapperTest {

	public static void main(String[] args) {
		
		// 기본타입 변수(primitive Type)
		int var1 =1;
		double var2 = 2.14;
		boolean var3 = true;
				
		// 기본타입 -> Wrapper 클래스로 포장(Boxing)
		Integer w1 = var1;
		double w2 = var2;
		Boolean w3 = var3;
		
		System.out.println("w1 : "+w1);
		System.out.println("w2 : "+w2);
		System.out.println("w3 : "+w3);
		
		// 문자열 -> 기본타입 변환
		String str1 = "1";
		String str2 = "2.3";
		String str3 = "false";
		
		int res1 = Integer.parseInt(str1);
		double res2 = Double.parseDouble(str2);
		boolean res3 = Boolean.parseBoolean(str3);
		
		System.out.println("res1 : "+res1);
		System.out.println("res2 : "+res2);
		System.out.println("res3 : "+res3);
		
		// 문자열 -> Wrapper 변환
		Integer wr1 = Integer.valueOf(str1);
		Double wr2 = Double.valueOf(str2);
		Boolean wr3 = Boolean.valueOf(str3);
		
		System.out.println("wr1 : "+wr1);
		System.out.println("wr2 : "+wr2);
		System.out.println("wr3 : "+wr3);
		
		// Wrapper -> 문자열 변환
		String s1 =wr1.toString();
		String s2 =wr2.toString();
		String s3 =wr3.toString();
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
		// Wrapper -> 기본타입 변환(Auto-Unboxing)
		int v1 = wr1;
		double v2 = wr2;
		boolean v3 = wr3;
		
		System.out.println("v1 : "+v1);
		System.out.println("v2 : "+v2);
		System.out.println("v3 : "+v3);
		
		
	}
}
