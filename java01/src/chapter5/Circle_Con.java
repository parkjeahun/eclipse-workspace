package chapter5;

public class Circle_Con {
	 
	int radius;
	String name;
	public Circle_Con() {		// <<=== ������ (�Ű������� ���� ������)
		radius = 1 ; name = "";  //radius�� �ʱ� ����1
	}
	public Circle_Con(int r, String n) {  //<==������ : (�Ű� ������ ���� ������)
		radius = r; name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Circle_Con pizza = new Circle_Con(10,"�ڹ�����");		//<== �Ű������� ���� �����ڸ� ȣ��
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������" + area);
		
		Circle_Con donut = new Circle_Con();		//<=== �Ű������� ���� �����ڸ� ȣ��
		donut.name = "�ڹٵ���";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������" + area);
		
	}

}