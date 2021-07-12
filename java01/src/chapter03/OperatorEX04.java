package chapter03;

public class OperatorEX04 {

	public static void main(String[] args) {
        int gameScore1 = 150;
		
		int lastScore1 = ++gameScore1;  // ; 처리전에 적용
		System.out.println(lastScore1);  //151
		System.out.println(gameScore1);	//151
		
		int lastScore2 = gameScore1--;
	    System.out.println(lastScore2);  //151
	    System.out.println(gameScore1);  //150
			
	}

}
