package hiding;

public class AccessEx {

	public static void main(String[] args) {
		Sample aClass = new Sample();
		
		aClass.a = 10;
		//aClass.b = 10;
		aClass.setB(10);
		aClass.c = 10;
		
		
		System.out.println("a 변수의값 : " + aClass.a);
		//System.out.println("b 변수의값 : " + aClass.b);
		System.out.println("b 변수의값 : " + aClass.getB());
		System.out.println("c 변수의값 : " + aClass.c);
		
	}

}
