package exam;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];

		System.out.println("���� ���� 10���� �Է� �Ͻÿ� >> ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("3�� �����");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) {
				System.out.println(arr[i] + " ");
			}
		}
		sc.close();
	}
}
