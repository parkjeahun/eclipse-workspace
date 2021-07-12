package abstractex;

public abstract class Computer {	//추상 메소드를 포함. 템플릿,프레임워크구현,인터페이스구현.
	public abstract void display();	//추상 메소드 : 선언부만 존재 하고, 실행부가 없는 메소드{}
	abstract public void typing();	//추상 메소드
	//public void add(int a, int b) { }	//일반 메소드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끔니다.");
	}
}
