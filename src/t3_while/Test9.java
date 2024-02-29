package t3_while;

// 1~100까지의 홀수합 / 짝수합
public class Test9 {
	public static void main(String[] args) {
		int i = 0, odd = 0, even = 0;
		
		while(i < 100) {
			i = i + 1;
			odd = odd + i;
			
			i = i + 1;
			even = even + i;
					
		}
		System.out.println("1 ~ 100까지의 홀수 합 : " + odd);
		System.out.println("1 ~ 100까지의 짝수 합 : " + even);
	}
}
