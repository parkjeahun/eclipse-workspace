package chapter5.circle;


public class Person_Test01 {

	public static void main(String[] args) {
		
		Person01 person = new Person01();
		person.age = 40;
		person.name = "James";
		person.isMarried = true ;
		person.numberOfchildren = 3;
		
		System.out.println("���� :" + person.age);
		System.out.println("�̸� :" + person.name );
		System.out.println("��ȥ���� :" + person.isMarried);
		System.out.println("�ڳ�� :" + person.numberOfchildren);
		
	}

}
