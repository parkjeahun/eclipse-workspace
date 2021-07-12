package witharraylist;
import java.util.ArrayList;
public class CUstomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();//����
		
		Customer customerLee = new Customer(10010, "�̼���");
		Customer customerShin = new Customer(10020, "�Ż��Ӵ�");
		Customer customerHong = new GoldCustomer(10030, "ȫ�浿");	//��ĳ����
		Customer customerYoul = new GoldCustomer(10040, "������");	//��ĳ����
		Customer customerKim = new VIPCustomer(10050, "������", 12345);//��ĳ����
		
		customerList.add(customerLee);	//0
		customerList.add(customerShin);	//1
		customerList.add(customerHong);	//2
		customerList.add(customerYoul);	//3
		customerList.add(customerKim);	//4
		
		System.out.println("====== �� ���� ��� ======");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� ======");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + 
					"���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + 
					"���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "���Դϴ�.");
		}
}
}
