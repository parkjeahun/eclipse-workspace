package exam;
import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000,10000,5000,1000,500,100,50,10,1};
		int money;
		System.out.println("�ݾ��� �Է� �Ͻÿ� >> ");
		money = sc.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			System.out.printf("%d ��¥��: %d�� \n", unit[i], money/unit[i]);
			//ù��° : %d = unit[i],�ι�°: %d = money/unit[i] ,\n = enter
			money = money - (money / unit[i])* unit[i];
		}
		sc.close();
	}

}
