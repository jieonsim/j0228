package t3_while;

// 1~100까지의 10항씩의 합을 출력하시오
/*
1 ~ 10까지의 합 : 55
1 ~ 20까지의 합 : 210
1 ~ 30까지의 합 : 465
1 ~ 40까지의 합 : 820
...
 */
public class Test4 {
	public static void main(String[] args) {
		int i = 0, tot = 0;
		
		while(i < 100) {
			i++;
			tot += i;
			if((i % 10) == 0) {
				System.out.println("1 ~ " + i + " 까지의 합 : " + tot);
			}
		}
	}
}
