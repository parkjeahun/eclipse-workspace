package chapter04;

public class Loop_While_Example {

	public static void main(String[] args) {

		int num = 1;		//num : 1 ~ 10 ����
		int sum = 0;		//sum : ���� ����� ���� ���� 
		
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1���� 10 ������ ����" + sum + "�Դϴ�.");
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
	}

}
