package t1_if;

import java.util.Scanner;

/*
 세 과목의 점수를 입력받는다.
 이때 세과목의 평균 점수가 60점 이상이고
 각 과목당 40점 이상이면 '합격', 그렇지 않으면 '불합격' 
 */
public class Test3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jum1, jum2, jum3, avg;
		String str = "";
		
		System.out.print("첫번째 과목의 점수 : ");
		jum1 = sc.nextInt();
		
		System.out.print("두번째 과목의 점수 : ");
		jum2 = sc.nextInt();
		
		System.out.print("세번째 과목의 점수 : ");
		jum3 = sc.nextInt();
		
		avg = (jum1 + jum2 + jum3) / 3;
		
		// 시간복잡도를 개선하려면 avg < 60을 가장 뒤로 보내야 함
		if(avg < 60 || jum1 < 40 || jum2 < 40 || jum3 < 40) {
			str = "불합격";
		}
		else {
			str = "합격";
		}
		
		System.out.println("당신은 " + str + "입니다.");
		
		sc.close();
	}
}