package chapter5.circle;

import chapter5.circle.Order;

public class Orser_Test {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderId = 201803120001L;
		order.customerId = "abc123";
		order.orderDate = "2018�� 3�� 12��";
		order.customerName = "ȫ���";
		order.productId = "PD0345-12";
		order.shippingAssress = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ :" + order.orderId);
		System.out.println("�ֹ��� ���̵� :" + order.customerId);
		System.out.println("�ֹ� ��¥ :" + order.orderDate);
		System.out.println("�ֹ��� �̸� :" + order.customerName);
		System.out.println("�ֹ� ��ǰ ��ȣ :" + order.productId);
		System.out.println("��� �ּ� :" + order.shippingAssress);
				
	}

}