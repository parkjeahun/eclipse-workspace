package chapter03;

public class OperatorEX02 {

	public static void main(String[] args) {

		int mathScore = 95;
		int engScore = 70;
		
		int totalScore = mathScore + engScore ;
		
		System.out.println("��Ż ���" +totalScore);
		
		int avgScore = (mathScore + engScore) / 2;
		
		System.out.println("��� ����" + avgScore);
		
		
		
		int mod = mathScore % engScore;
		String ch1 = "���� ��������";
		System.out.println(ch1 + mod);
		
		
	}

}
