package template;

public abstract class Car {
	public abstract void start();
	public abstract void drive();	//�߻� �޼���, ���� Ŭ�������� ������ �ؼ� ���
	public abstract void stop();
	public abstract void turnOff();//�߻� �޼���

	public void washCar() {
		System.out.println("������ �մϴ�");
	}
	public void run() {	//���ø� �޼���
		start();				//1. �õ��� �մϴ�.
		drive();				//2. ������ �մϴ�.	(�ڵ�, ����)
		stop();					//3. ���� ���� (�ڵ�, ����)
		turnOff();				//4. �õ��� ���ϴ�.
		washCar();
	}

}