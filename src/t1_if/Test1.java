package t1_if;

import java.util.Scanner;

/*
 두 개의 수를 교환
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su1, su2, temp;
		
		System.out.print("첫번째 수를 입력하세요 : ");
		su1 = sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요 : ");
		su2 = sc.nextInt();
		
		System.out.println("입력된 수 su1 : " + su1 + ", su2 : " + su2);
		
		// 두 수의 교환
		temp = su1;
		su1 = su2;
		su2 = temp;
		
		System.out.println("교환된 수 su1 : " + su1 + ", su2 : " + su2);
		
		sc.close();
	}
}
