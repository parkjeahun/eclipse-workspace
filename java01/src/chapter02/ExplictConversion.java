package chapter02;

public class ExplictConversion {

	public static void main(String[] args) {
		
		double dNum1 = 1.2;   //8byte
		float fNum2 = 0.9f;   //4byte
		
		
		int iNum3 =(int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2);
			
		System.out.println(iNum3);
		System.out.println(iNum4);
		

	}

}
