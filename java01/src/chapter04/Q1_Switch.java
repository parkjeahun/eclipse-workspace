package chapter04;

import java.util.Scanner;

public class Q1_Switch {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		int result =0;
		System.out.println("�����ڸ� �Է� �ϼ���. ��) +, -, *, /");
		Scanner sc = new Scanner (System.in); // ��ü ����
		String S = sc.next();   //���ڿ��� �޾Ƽ� S ������ �Ҵ�
		char operator = S.charAt(0);//ù��° ���ڸ� char ���� operator �� ����
		
		if (operator == '+') {
			result = num1 + num2;
		}
		else if (operator == '-') {
			result = num1 - num2;
		}
		else if (operator == '*') {
			result = num1 * num2;
		}
		else if (operator == '/') {
			result = num1 / num2;
		}
		else {

			System.out.println("������ �����Դϴ�");
			sc.close();
			return;
		}
		System.out.println("��� ���� " + result + "�Դϴ�");
		sc.close();
		}
	}


	


