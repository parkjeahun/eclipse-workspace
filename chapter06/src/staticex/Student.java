package staticex;

public class Student {
	public static int serialNum = 1000;//Ŭ���� ����(������ ������ ����)
							//(��� �ν��Ͻ����� ���� ����),���α׷��� �ε� �ɶ� ����
							//���α׷��� ���� �ɋ� ����
	int studentID;		//��� ����(�ν��Ͻ� ����)<==�� ������ ����
	String studentName;	//new Ű���带 ���ؼ� �ν��Ͻ� �����ÿ� �������� ����
	int grade;			//������ �÷��Ϳ� ���ؼ� ����
	String address;		//�� �ν��Ͻ� �������� ���,�ٸ� �ν��Ͻ����� ���Ұ�
	/*
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}*/
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	public static int getSerialNum() {
		int i = 10;
		//studentName = "aaa";
		return serialNum;
	}
}
