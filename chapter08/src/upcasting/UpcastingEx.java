package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("������");
		
		p = s;			//��ĳ���� , p = (Person) s; <==��ĳ���� �Ҷ��� Person
						//�ڷ����� ��� �����ʾƵ� ���������� ����
		//Person p = new Student ("������");	//��ĳ����
		System.out.println(p.name);
		
		//p.grade = "A";		//������ ����
		//p.departmernt = "HR"; //������ ����
		//p.name = "ȫ�浿";
		//p.id = "ID";
		
		//s.grade = "A";
		//s.department = "HR";
		//s.id = "ID";
		//s.name = "��ʶ�";
	}
}
