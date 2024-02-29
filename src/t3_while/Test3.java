package t3_while;

// 1~100까지의 홀수 합
public class Test3 {
	public static void main(String[] args) {
		int i = -1, tot = 0;
		// 토탈은 건들이지 않는 것이 좋음. 이에 tot 값은 0으로 유지하되, 변수를 마이너스로 초기화한다
		// 홀수인 경우 구하고자 하는 수에서 가장 가까운 홀수를 넣어야 한다
		// (100까지의 홀수값 구하고싶으면 가까운 99로 넣어야함)
		while(i < 99) {
			i += 2;
			tot += i;
		}
		System.out.println("1 ~ 100까지의 홀수 합 : " + tot);
	}
}
