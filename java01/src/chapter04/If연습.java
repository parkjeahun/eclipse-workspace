package chapter04;

import java.util.Scanner;

public class If����{

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		int result =0;
		
		System.out.println("�����ڸ� �Է����ּ��� ��) +, -, *, /");
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char operator = S.charAt(0);

		switch (operator) {
		case '+' :
			result = num1 + num2;
			break;
			
		case '-' :
			result = num1 - num2;
			break;
			
		case '*' :
			result = num1 * num2;
			break;
			
		case '/' :
			result = num1 / num2;
			break;
			System.out.println("������ �����Դϴ�");
			sc.close();
			return;
		}
		System.out.println("��� ���� " + result + "�Դϴ�");
		sc.close();
		}
	}


