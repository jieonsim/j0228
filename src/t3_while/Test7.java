package t3_while;

// 1-2+3-4+5-6+7-8+9-10 = ?
/*
 - * - = +
 - * + - -
 sign 변수를 이용 및 곱셈의 성질을 이용해 풀어라
 */
public class Test7 {
	public static void main(String[] args) {
		int i = 0;
		int total = 0;
		int sign = -1;
		
		while (i < 10) {
			i++;
			sign *= -1;
			total += i * sign;
		}
		System.out.println("1-2+3-4+5-6+7-8+9-10 = " + total);
	}
}
