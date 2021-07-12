package exam;
import java.util.Scanner;
public class Q13Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000,10000,5000,1000,500,100,50,10,1};
		int num[] = new int[9];
		int money;
		
		System.out.println("금액을 입력 하시오>>");
		money = sc.nextInt();
		
		for(int i=0; i<9; i++) {
			num[i] = money/unit[i];
			money = money%unit[i];
		}
		for(int i=0; i<9; i++) {
			System.out.println(unit[i] + "원짜리: " + num[i] + "개 입니다.");
		}
		sc.close();
	}

}
