package hiding;

public class AccessEx {

	public static void main(String[] args) {
		Sample aClass = new Sample();
		
		aClass.a = 10;
		//aClass.b = 10;
		aClass.setB(10);
		aClass.c = 10;
		
		
		System.out.println("a �����ǰ� : " + aClass.a);
		//System.out.println("b �����ǰ� : " + aClass.b);
		System.out.println("b �����ǰ� : " + aClass.getB());
		System.out.println("c �����ǰ� : " + aClass.c);
		
	}

}
