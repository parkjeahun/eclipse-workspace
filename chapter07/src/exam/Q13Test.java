package exam;
import java.util.Scanner;
public class Q13Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000,10000,5000,1000,500,100,50,10,1};
		int num[] = new int[9];
		int money;
		
		System.out.println("�ݾ��� �Է� �Ͻÿ�>>");
		money = sc.nextInt();
		
		for(int i=0; i<9; i++) {
			num[i] = money/unit[i];
			money = money%unit[i];
		}
		for(int i=0; i<9; i++) {
			System.out.println(unit[i] + "��¥��: " + num[i] + "�� �Դϴ�.");
		}
		sc.close();
	}

}
