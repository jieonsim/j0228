package t2_switch_case;

import java.util.Scanner;

/*
 점수를 입력받아서 학점을 구하시오.
 90점 이상 A, 80점 이상 B ...
 */
public class Test4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su = 0;
		char gr;
		
		System.out.print("점수를 입력하세요 : ");
		su = sc.nextInt();
		
		if(su >= 90) gr = 'A';
		else if(su >= 80) gr = 'B';
		else if(su >= 70) gr = 'C';
		else if(su >= 60) gr = 'D';
		else gr = 'F';
		
		System.out.println("점수 " + su + "는 " + gr + "학점입니다.");
		
		sc.close();
	}
}
