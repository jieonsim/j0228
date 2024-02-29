package ex;

/*
 1번 : 1~100까지의 숫자중 2의 배수의 개수와 3의 배수의 개수와 5의 배수의 개수를 구하시오.
 단, 중복되는 배수인 경우는 작은 숫자에 한번만 누적처리하시오.
이때 2의 배수의 합과 3의 배수의 합을 더해서 5의 배수의 합을 뺀 결과도 마지막에 출력하시오.
 */
public class Ex1_Ref {
	public static void main(String[] args) {
		int i = 0; // 카운트를 위한 변수, 누적할 때는 무조건 초기값 줘야함
		int cnt2 = 0, cnt3 = 0, cnt5 = 0; // 2,3,5배수의 계수를 위한 변수
		int tot2 = 0, tot3 = 0, tot5 = 0; // 합계 누적을 위한 변수
		
		while(i < 100) {
			i++;
			if(i % 2 == 0) {
				cnt2++;
				tot2 += i;
			}
			else if(i % 3 == 0) {
				cnt3++;
				tot3 += i;
			}
			else if(i % 5 == 0) {
				cnt5++;
				tot5 += i;
			}
		}
		System.out.println("2의 배수의 개수 : " + cnt2);
		System.out.println("3의 배수의 개수 : " + cnt3);
		System.out.println("5의 배수의 개수 : " + cnt5);
		System.out.println("2의 배수 + 3의 배수 - 5의 배수 : " + (tot2 + tot3 - tot5));
	}
}
