package exam;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];

		System.out.println("양의 점수 10개를 입력 하시오 >> ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("3의 배수는");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) {
				System.out.println(arr[i] + " ");
			}
		}
		sc.close();
	}
}
