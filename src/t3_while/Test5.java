package t3_while;

// 1~100까지의 합을 아래와 같이 출력하시오
/*
 1 ~ 10 : 
 11 ~ 20 : 
 21 ~ 30 : 
 ....
 */
public class Test5 {
	public static void main(String[] args) {
		int i = 0, tot = 0;
		
		while(i < 100) {
			i++;
			tot += i;
			if((i % 10) == 0) {
				System.out.println((i - 9) + " ~ " + i + "까지의 합 : " + tot);		
				tot = 0; // 값 초기화 필요
			}
		}
	}
}
