package t3_while;

//-1/2 + 2/3 - 3/4 + 4/5 -5/6 +6/7 -7/8 +8/9 -9/10 = ?
/*
- * - = +
- * + - -
sign 변수를 이용 및 곱셈의 성질을 이용해 풀어라
*/

public class Test8_repeat {
	public static void main(String[] args) {
		double i = 0.0;
		double total = 0.0;
		int sign = 1;
		
		while (i < 9) {
			i++;
			sign *= -1;
			total += i / (i+1) * sign;
		}
		System.out.println(total);
	}
}
