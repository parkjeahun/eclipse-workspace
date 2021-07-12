package chapter5.circle;


public class Person_Test01 {

	public static void main(String[] args) {
		
		Person01 person = new Person01();
		person.age = 40;
		person.name = "James";
		person.isMarried = true ;
		person.numberOfchildren = 3;
		
		System.out.println("나이 :" + person.age);
		System.out.println("이름 :" + person.name );
		System.out.println("결혼여부 :" + person.isMarried);
		System.out.println("자녀수 :" + person.numberOfchildren);
		
	}

}
