package inheritance6;

public class VIPCustomer extends Customer{
	private int agentID; // VIP 고객 담당 상담원 아이디
	double saleRatio; // 할인율

	public VIPCustomer() {
		//super();		//상위 클래스의 생성자를 호출, super(); : 상위 클래스의 기본 생성자를 호출
		customerGrade = "VIP"; // 고객 등급 VIP
		bonusRatio = 0.05; // 보너스 포인트 적립 5%
		saleRatio = 0.1; // 할인율 10%
	}
	public int getAgentID() { // VIP 고객을 위한 Agent ID(상담원 아이디)
		return agentID;
	}
}
