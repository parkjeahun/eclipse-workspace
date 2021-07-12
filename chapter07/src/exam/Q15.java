package exam;

public class Q15 {

	public static void main(String[] args) {
		int a, b;
		for (int i = 0; i < 100; i++) {
	a = i / 10;	//a=0(i:1~9) a=1(i:10~19) a=2(i:20~29) a=3(i:30~39)
	b = i % 10; //b=1(i:1,11,21,31,41,51,61,71,81,91) b=2(i:2,12,22,32,42,52,62,72,82,92)
	if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b == 9)) {//10의 자리와 1의자리 모두(3,6,9)
				System.out.println(i+"박수 짝짝");
	} else if ((a == 3 || a == 6 || a == 9) && (b != 3 || b != 6 || b != 9)) {//10의자리에는3,6,9 1의자리 3,6,9안들어가 있을때
				System.out.println(i+"박수 짝");
	} else if ((a != 3 || a != 6 || a != 9) && (b == 3 || b == 6 || b == 9)) {//10의자리에는3,6,9안들어가있고 1의자리에는3,6,9가 들어가있을때
			System.out.println(i+"박수 짝");
			}
		}
	}
}