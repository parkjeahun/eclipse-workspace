package inheritance2;

public class InheritanceEx {

	public static void main(String[] args) {
		Student s = new Student();
		s.set();

		System.out.println("나이 : " + s.age);
		System.out.println("이름 : " + s.name);
		System.out.println("키  : " + s.height);
		System.out.println("몸무게: " + s.getWeight());// private
										// getter를 통해서 변수에 값을 출력
		}

		}
