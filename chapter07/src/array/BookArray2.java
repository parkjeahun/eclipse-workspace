package array;

public class BookArray2 {

	public static void main(String[] args) {
		Book[] library = new Book[5];//new ��ü�� ���� ����,
									//Book ��ü �迭�� ���� 5�� ����
		
		library[0] = new Book("�¹���" , "������");//new ������ ȣ��
		library[1] = new Book("���̾�" , "�츣�� �켼");
		library[2] = new Book("��� �� ���ΰ�" , "���ù�");
		library[3] = new Book("����" , "�ڰ渮");
		library[4] = new Book("�����" , "�������丮");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookinfo();
		}
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
}