package exam;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]; // 배열을 선언
		int num;
		int ran;   //랜덤값을 저장하는 변수	
		ran = (int) (Math.random() * 10 + 1);
		
		System.out.println((double)Math.random());//0.0xx~0.9xx까지
		System.out.println((double)Math.random()*10);//0.xx~9.xx까지
		System.out.println((double)Math.random()*10+1);//1.xx~10.xx까지
		System.out.println((double)Math.random()*100);//0.xx~99.xx까지
		System.out.println((double)Math.random()*100+1);//1.xx~100.xx까지

		/*System.out.println("정수 몇개의 방을 생성할 것입니까? >>");
		num = sc.nextInt();

		arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			for (int j = 0; j < i; j++)
				if (arr[i] == arr[j])
					i--;
		}
		for (int i = 0; i < arr.length; i++) {
			if (i % 10 == 0 && i != 0)
				System.out.println();
			System.out.print(arr[i] + " ");
		}
		sc.close();*/
		}
		}
