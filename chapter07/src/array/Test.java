package array;

public class Test {

	public static void main(String[] args) {
		int[][] abc = new int[4][5];
		
		int nana = 1;
		long total = 1;
		
		for(int i = 0; i < abc.length; i++) {
			for(int j = 0; j < abc[i].length; j++) {
		abc[i][j] = nana++;	
		total *= abc[i][j];
				System.out.print(abc[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		
		}
		System.out.println(total);
	}

}
