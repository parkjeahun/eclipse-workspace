package chapter04;

import java.util.Scanner;		//1. Scanner ����Ʈ

public class SvanerEx {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է� �ϼ��� ");
		Scanner scanner = new Scanner (System.in);  //2. Scanner ��ü����
		
		String name = scanner.next(); //���ڿ� �б�
		System.out.println("�̸��� " + name  + ", "); //3. Scanner ���� ���� ���� ������ �Ҵ�
		
		String city = scanner.next(); //���ڿ� �б�
		System.out.println("���ô� " + city + ", ");  //4. 
		
		int age = scanner.nextInt(); //�����б�
		System.out.println("���̴� " + age + "��, ");
		
		double weight = scanner.nextDouble(); //�Ǽ� �б�
		System.out.println("ü���� " + weight + "KG,");
		
		boolean single = scanner.nextBoolean(); //���� �б�
		System.out.println("���� ���δ� " + single + "�Դϴ� ");
		
		scanner.close(); //scanner �ݱ�
	}

}
