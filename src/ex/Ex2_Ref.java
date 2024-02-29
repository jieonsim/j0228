package ex;

import java.util.Scanner;

/*
 2번 : 두개의 숫자를 입력받아서 두개 숫자 사이에 값들을 모두 더하는 프로그램을 작성하되, 
 이때 5개항씩 그 결과를 출력시켜주시오.(마지막에 남은 값이 있으면 그합까지도 마지막에 출력할수 있어야함)
여기서 두개의 숫자는 임의의 숫자를 입력할수 있기에 첫번째숫자가 더 큰 숫자가 먼저 입력될수도 있다.
예시)
   첫번째 수 : 33,  두번째 수 : 5
    5 ~ 9 : 35
    10 ~ 14 : 60
    15 ~ 19 : 85
    20 ~ 24 : 110
    25 ~ 29 : 135
    30 ~ 33 : 126
    총합(5~33) : 551
 */

public class Ex2_Ref {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su1, su2; // 수를 입력받기 위한 변수
		int temp = 0; // 수를 교환하기 위한 변수
		int cnt = 0; // 5개항씩 세기 위한 변수
		int sum = 0; // 5개항의 부분 합
		int tot = 0; // 전체 합
		int startSu; // 첫 수 고정하는 변수
		
		System.out.print("첫번째 수를 입력하세요 : ");
		su1 = sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요 : ");
		su2 = sc.nextInt();
		
		System.out.println("첫번째 수 : " + su1 + ", 두번째 수 : " + su2);
		
		// su1이 su2보다 클 경우 두 수를 교환
		if(su1 > su2) {
			temp = su1;
			su1 = su2;
			su2 = temp;
		}
		
		startSu = temp = su1;
		
		while(su1 <= su2) {
			sum += su1;
			tot += su1;
			cnt++;
			if (cnt % 5 == 0) {
				System.out.println(temp + " ~ " + su1 + " : " + sum);
				sum = 0;
				temp = su1 + 1; // 두번째 출력 줄부터 시작 수에 + 1을 해야 함
			}
			su1++;
		}
		// 5개항이 아닐 경우에 남은 수까지 출력될 수 있도록 하는 것 
		if(cnt % 5 != 0) {
			System.out.println(temp + " ~ " + --su1 + " : " + sum);
		}
		System.out.println("총합("+ startSu + " ~" + su2 + ") : " + tot);
		
		sc.close();
	}
}
