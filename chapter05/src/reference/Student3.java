package reference;

public class Student3 {
	int studentID;			//�й�
	String studentName;		//�̸�
	Subject korean;			//������ �ڷ��� (Subject Ŭ����)�������/����
	Subject math;			//������ �ڷ��� (Subject Ŭ����)���а���/����
	
	public Student3() {
		korean = new Subject();
		math = new Subject();
	}
	public void setKorea(String name, int score) {
		korean.subjectName = name;
		korean.scorePoint = score;
	}
	public void setmath(String name, int score) {
		math.subjectName = name;
		math.scorePoint = score;
	}
	
}
