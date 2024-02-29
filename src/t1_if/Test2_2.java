package t1_if;

/*
 논리 연산자(!, &&, ||)
 */
public class Test2_2 {
	public static void main(String[] args) {
		int su1 = 10, su2 = 20, su3 = 30;
		int max = -99;
		
		if((su1 > su2) && (su1 > su3)) {
			max = su1;
		}
		else if(su2 > su3) {
			max = su2;
		}
		else {
			max = su3;
		}
		System.out.println("su1 : " + su1 + ", su2 : " + su2 + ", su3 : " + su3 + ", max : " + max) ;
	}	
}
