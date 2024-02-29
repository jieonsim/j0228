package t3_while;

// 1~100까지의 짝수 합
public class Test2 {
	public static void main(String[] args) {
		int i = 0, tot = 0;
		
		while(i < 100) {
			i += 2;
			tot += i;
		}
		System.out.println("1 ~ 100까지의 짝수 합 : " + tot);
	}
}
