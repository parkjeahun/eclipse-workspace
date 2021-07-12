package inheritance6;

public class VIPCustomerOLD {
	private int customerID; // �� ���̵�
	private String customerName; // �� �̸�
	private String customerGrade; // �� ���
	int bonusPoint; // ���ʽ� ����Ʈ
	double bonusRatio; // ���� ����

	private int agentID; // VIP �� ��� ���� ���̵�
	double saleRatio; // ������

	public VIPCustomerOLD() {
		customerGrade = "VIP"; // �� ��� VIP
		bonusRatio = 0.05; // ���ʽ� ����Ʈ ���� 5%
		saleRatio = 0.1; // ������ 10%
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // ���ʽ� ����Ʈ ���
		return price - (int) (price * saleRatio);// 10% �� ���ε� ����
	}

	public int getAgentID() { // VIP ���� ���� Agent ID(���� ���̵�)
		return agentID;
	}

	public String showCustomerInfo() {
		return customerName + " ���� ����� " + customerGrade + "�̸�," 
							+ " ���ʽ� ����Ʈ��" + bonusPoint + "�Դϴ�.";
	}
}