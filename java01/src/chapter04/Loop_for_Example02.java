package chapter04;

public class Loop_for_Example02 {

	public static void main(String[] args) {

		int i;
		int sum;
		
		for (i = 1,sum = 0; i <=10 ; i++) {
			sum += (i);         //sum = sum + (i+1)
		}
		
		System.out.println("1부터 10까지 합" + sum + "입니다.");
		
	}

}
