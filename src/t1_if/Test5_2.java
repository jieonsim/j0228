package t1_if;

import java.util.Scanner;

/*
 직급 코드를 입력받아 직급별 명칭을 출력하시오
 직급코드 1 : 부장, 본봉 : 5000000 
 직급코드 2 : 과장, 본봉 : 4000000 
 직급코드 3 : 대리, 본봉 : 3000000
 직급코드 4 : 사원, 본봉 : 2000000
 
 시간수당(sudang) : 시간을 입력받아서 1시간당 25000원으로 계산한다.
 공제액(gongje) : (본봉(bonbong) + 수당)의 10%로 한다.
 실수령액(netPay)을 구하시오.
 단 실수령액 = 본봉 + 수당 - 공제액
 
 */
public class Test5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int code;
		String jikkub;
		int bonbong = 0;
		
		System.out.print("직급 코드를 입력하세요(1:부장, 2:과장, 3:대리, 4:사원) : ");
		code = sc.nextInt();
		
		if(code == 1) {
			jikkub = "부장";
			bonbong = 5000000;
		}
		else if(code == 2) {
			jikkub = "과장";
			bonbong = 4000000;
		}
		else if(code == 3) {
			jikkub = "대리";
			bonbong = 3000000;
		}
		else if(code == 4) {
			jikkub = "사원";
			bonbong = 2000000;
		}
		else {
			jikkub = "비사원";
		}

		System.out.print("추가 근무 시간을 입력하세요 : ");
		int hour = sc.nextInt();
		
		int sudang = hour * 25000;
		int gongje = (bonbong + sudang) / 10;
		int netpay = bonbong + sudang - gongje;
			
		System.out.println("입력하신 코드 " + code + "는 " + jikkub + "입니다.");
		System.out.println(jikkub + "의 실수령액은 " + netpay + "원입니다.");
		
		sc.close();
	}
}
