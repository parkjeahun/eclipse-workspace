package chapter04;

import java.util.Scanner;
public class SuccessOrFail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ�:");
		int score = scanner.nextInt();
		if (score >= 80)
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		
		scanner.close();
		
	}

}
