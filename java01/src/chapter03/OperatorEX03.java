package chapter03;

public class OperatorEX03 {

	public static void main(String[] args) {

		int gameScore1 = 150;
		
		/*
		*int lastScore1 = ++gameScore1;  // ; 贸府傈俊 利侩
		*System.out.println(lastScore1);
		*/
		
		
		int lastScore1 = gameScore1++;  // ; 饶俊 贸府
		System.out.println(lastScore1); //150	
		System.out.println(gameScore1);	//151
		
		int lastScore2 = gameScore1--;
		
	    System.out.println(lastScore2);  //151
	    
	    System.out.println(gameScore1);  //150
			
	}

}
