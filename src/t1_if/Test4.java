package t1_if;

import java.util.Scanner;

/*
 점수를 입력받아서 학점을 구하시오.
 90점 이상 A, 80점 이상 B ...
 */
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int su = 0;
		char gr;

		System.out.print("점수를 입력하세요 : ");
		su = sc.nextInt();

		switch (su / 10) {
			case 10:
			case 9:
				gr = 'A';
				break;
			case 8:
				gr = 'B';
				break;
			case 7:
				gr = 'C';
				break;
			case 6:
				gr = 'D';
				break;
			default:
				gr = 'F';
		}
		System.out.println("점수 " + su + "는 " + gr + "학점입니다.");

		sc.close();
	}
}
