package arraylist;
public class Q14 {

	public static void main(String[] args) {
		int[] nana = new int[10];
		int num = 0;
		System.out.print("정수를 입력하세요");
	
		for(int i = 0; i<10; i++) {
			nana[i] = (int)(Math.random()*10+1);
			num +=nana[i];
		System.out.print(nana[i] + " ");
		}
		System.out.println();
		System.out.println("평균값은:" + num / 10 + "입니다.");
	}
}
