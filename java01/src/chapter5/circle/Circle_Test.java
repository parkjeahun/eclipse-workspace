package chapter5.circle;

import chapter5.circle.Circle;

public class Circle_Test {

	public static void main(String[] args) {

		Circle pizza;
		pizza = new Circle();		//Circle ��ü����, ���۷��� �̸� pizza
		pizza.radius = 10;          //������ �������� 10���� ������
		pizza.name = "�ڹ� ����";     //������ �̸��� ����
		double area = pizza.getArea(); //������ ���� (getArea () �� ȣ���ؼ� area ������ �Ҵ�
		System.out.println(pizza.name + "�� ������ : " + area);
		
		
		Circle donut = new Circle(); //Circle ��ü����, ���۷��� �̸� donut
		donut.radius = 2;
		donut.name = "�ڹ� ����";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ : " + area);
		
		
		
	}

}
