package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] date = new double [5]; //�迭�� ���� 5�� ����
		//double date[] = new double[5]
		date[0] = 10.0;//ù ���� ��ҿ� �� 10.0 ����
		date[1] = 20.0;//�� ���� ��ҿ� �� 20.0 ����
		date[2] = 30.0;//�� ���� ��ҿ� �� 30.0 ����
		
		for (int i = 0; i < date.length; i++) {
			System.out.println(date[i]);
		}
		
		int[] date2 = {1,2,3,4,5};		//�迭 ����� ���ÿ� �� �Ҵ�
		for (int i = 0; i < date2.length ; i++ ) {
			System.out.println(date2[i]);
		}
		
		
	}
	

}
