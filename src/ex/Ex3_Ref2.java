package ex;

import java.util.Scanner;

/*
 3번 : 2자리 숫자를 입력받아서, 입력받은 숫자를 거꾸로 1이될때까지 출력하되,
 한줄에 5개씩 출력하는 프로그램을 만드시오. (음수도 고려하시오)
 */
public class Ex3_Ref2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = 0; // 5개씩 세기위한 카운트 변수

		System.out.print("두 자리 수를 입력하세요 : ");
		int su = sc.nextInt();

		// 양수일 때
		if (su >= 10) {
			while (su >= 1) {
				System.out.print(su + "\t"); // \t : 숫자 하나씩 띄어서 출력하기 위함
				su--;
				cnt++; // 5개를 세기 위해 증가
				if (cnt % 5 == 0) { // 한줄에 5개씩 출력하기 위함
					System.out.println();
				}
			}
		}
		// 음수일때
		if (su <= -10) {
			while (su <= 1) {
				System.out.print(su + "\t"); // \t : 숫자 하나씩 띄어서 출력하기 위함
				su++;
				cnt++; // 5개를 세기 위해 증가
				if (cnt % 5 == 0) { // 한줄에 5개씩 출력하기 위함
					System.out.println();
				}
			}
		}
		sc.close();
	}
}
