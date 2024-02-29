package ex;

public class Ex1 {
	public static void main(String[] args) {
		int i = 0;
		int count1 = 0, count2 = 0, count3 = 0;
		int sum1 = 0, sum2 = 0, sum3 = 0;
		
		while(i < 100) {
			i++;
			if((i % 2) == 0) {
				count1++;
				sum1 += i;
			} else if((i % 3) == 0) {
				count2++;
				sum2 += i;
			} else if((i % 5) == 0) {
				count3++;
				sum3 += i;
			}
		}
		System.out.println("2의 배수 개수 : " + count1);
		System.out.println("3의 배수 개수 : " + count2);
		System.out.println("5의 배수 개수 : " + count3);
		
		int result = sum1 + sum2 - sum3;
		System.out.println("2의 배수의 합 + 3의 배수의 합 - 5의 배수의 합 : " + result);
	}
}
