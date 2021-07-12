package template;

public abstract class Car {
	public abstract void start();
	public abstract void drive();	//추상 메서드, 서브 클래스에서 재정의 해서 사용
	public abstract void stop();
	public abstract void turnOff();//추상 메서드

	public void washCar() {
		System.out.println("세차를 합니다");
	}
	public void run() {	//템플릿 메서드
		start();				//1. 시동을 켭니다.
		drive();				//2. 운행을 합니다.	(자동, 수동)
		stop();					//3. 차가 멈춤 (자동, 수동)
		turnOff();				//4. 시동을 끕니다.
		washCar();
	}

}
