package chapter5.circle;

public class Circle {
	
	int radius ;    //���� ������
	String name;	//���� �̸�
	
	public Circle() {} //Circle Ŭ������ �⺻ ������(Ŭ������� ������ �̸��� �޼ҵ�)
					   //��ǲ �Ű������� ����,����ΰ� ���� ������ : �⺻ ������, �⺻ �����ڴ� ������ ����	
	
	public double getArea() {
		return 3.14 * radius * radius ;
	}

}
