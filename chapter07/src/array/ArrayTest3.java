package array;

public class ArrayTest3 {
	
	public static void main(String[] args) {
		double[] date = new double [5];
		date[0] = 10.0;
		date[1] = 20.0;
		date[2] = 30.0;
		
		double total =1;
		for (int i = 0; i < date.length ; i++ ) {
			System.out.println(date[i]);
		total *= date[i];		//total = total * date[i]
		}
	System.out.println("total : " + total); //배열의 저장된 값을 곱하는 경우
											//문제가 발생, 
}
}