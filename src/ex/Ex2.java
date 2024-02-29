package ex;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = scanner.nextInt();

		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		int sum = 0;
		int count = 0;
		int current = num1;
		int totalSum = 0;
		
		while (current <= num2) {
			sum += current;
			count++;
			if(count == 5) {
				System.out.print(sum + " ");
				totalSum += sum;
				sum = 0;
				count = 0;
			}
			current++;
		}
		System.out.println();
		System.out.println(num1 + " ~ " + num2 + "까지의 전체 합 : " + totalSum);				
		
		scanner.close();
	}
}
