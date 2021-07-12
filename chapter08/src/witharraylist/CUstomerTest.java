package witharraylist;
import java.util.ArrayList;
public class CUstomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();//선언
		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");	//업캐스팅
		Customer customerYoul = new GoldCustomer(10040, "이율곡");	//업캐스팅
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);//업캐스팅
		
		customerList.add(customerLee);	//0
		customerList.add(customerShin);	//1
		customerList.add(customerHong);	//2
		customerList.add(customerYoul);	//3
		customerList.add(customerKim);	//4
		
		System.out.println("====== 고객 정보 출력 ======");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("====== 할인율과 보너스 포인트 계산 ======");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + 
					"님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + 
					"님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
		}
}
}
