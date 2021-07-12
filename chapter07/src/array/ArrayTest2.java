package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] date = new double [5]; //배열의 방을 5개 생성
		//double date[] = new double[5]
		date[0] = 10.0;//첫 번쨰 요소에 값 10.0 대입
		date[1] = 20.0;//두 번쨰 요소에 값 20.0 대입
		date[2] = 30.0;//세 번쨰 요소에 값 30.0 대입
		
		for (int i = 0; i < date.length; i++) {
			System.out.println(date[i]);
		}
		
		int[] date2 = {1,2,3,4,5};		//배열 선언과 동시에 값 할당
		for (int i = 0; i < date2.length ; i++ ) {
			System.out.println(date2[i]);
		}
		
		
	}
	

}
