package arraylist;
import java.util.Scanner;
public class Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int [10];
		System.out.println("���� ���� 10���� �Է��Ͻÿ�");
		
		for(int i = 0; i< 10; i++) {
			num[i] = sc.nextInt();
			}
		for(int i = 0; i < 10; i++) {
			if(num[i] % 3 ==0) {
				if(num[i]==0)continue;
				System.out.print(num[i] + " ");
			}
		}
		}
	}

