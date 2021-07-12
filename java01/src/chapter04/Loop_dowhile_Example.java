package chapter04;

public class Loop_dowhile_Example {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		do {
			sum += num;		//sum = sum + num
			num++; 	
			
		}   while(num <=10);
		
		System.out.println("1부터 10까지 합은" + sum + "입니다.");
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
	}

}
