package ex;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 이상의 숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		int count = 0;
		
		while(num > 0) {
			System.out.print(num + " ");
			num--;
			count++;
			if(count % 5 == 0) {
				System.out.println();
			}
		}
		scanner.close();
	}
}
