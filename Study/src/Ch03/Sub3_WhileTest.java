package Ch03;
/*
 * ��¥ : 2022/01/04
 * �̸� : ������
 * ���� : �ڹ� �ݺ��� While �ǽ��ϱ� ���� p92
 */
public class Sub3_WhileTest {
	
	public static void main(String[] args) {
		
		// 1���� 10���� ��
		int sum = 0;
		int k = 1;
		
		while (k <= 10) {
			
			sum += k;
			k++;
			
		}
		System.out.println("1���� 10���� �� : "+sum);
		
		// do ~ while��
		int tot = 0;
		int i = 1;
			
		do {
			if(i % 2 == 0) {
				
				tot += i;
			}
			
			i++;
						
		}while(i <= 10);
		
		System.out.println("1���� 10���� ¦���� : "+tot);
		
		// break
		int num = 1;
				
		while(true) {
			
			if(num % 5 == 0 && num % 7 == 0) {
				
				break;
			}
			num++;
		}
		System.out.println("5�� 7�� �ּҰ���� : "+num);
		
		// continue
		int total = 0;
		int j =0;
		
		while(j <= 10) {
			
			j++;
			if(j % 2 == 1) {
				continue;
			}
			
			total += j;
		}
		System.out.println("1���� 10���� ¦���� : "+total);
	}

}