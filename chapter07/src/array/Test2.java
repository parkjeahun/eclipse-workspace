package array;

public class Test2 {

	public static void main(String[] args) {
		int [][] abc = new int[4][5];
		abc[0][0] = 1;
		abc[0][1] = 2;
		abc[0][2] = 3;
		abc[0][3] = 4;
		abc[0][4] = 5;
		abc[1][0] = 6;
		abc[1][1] = 7;
		abc[1][2] = 8;
		abc[1][3] = 9;
		abc[1][4] = 10;
		abc[2][0] = 11;
		abc[2][1] = 12;
		abc[2][2] = 13;
		abc[2][3] = 14;
		abc[2][4] = 15;
		abc[3][0] = 16;
		abc[3][1] = 17;
		abc[3][2] = 18;
		abc[3][3] = 19;
		abc[3][4] = 20;
		
		int nana = 1;
		long total = 1;
		
		for(int i = 0; i < abc.length; i++) {
			for(int j = 0; j < abc[i].length; j++) {
		total *= abc[i][j];
				System.out.print(abc[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println(total);
		}
	}
