package arraylist;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;//ArrayList����(�ش� ������ �̸��� ������
								   //��� ��ü�� �迭����
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();//ArrayList����
	}

	public void addSubject(String name, int score) {
		Subject subject = new Subject();	//Subject����
		subject.setName(name);				//���� �̸� �߰�
		subject.setScorePoint(score);		//���� �߰�
		subjectList.add(subject);			//�迭�� ����
	}

	public void showStudentinfo() {
		int total = 0;
		for (Subject s : subjectList) {
			total += s.getScorePoint();		//���� ���ϱ�
			System.out.println(studentID + " �л� " + studentName + "�� "
			+ s.getName() + "���� ������ " + s.getScorePoint() + "�Դϴ�.");
			
		}
		System.out.println(studentID + " �л� " + studentName + "�� ������ "
				+ total + " �Դϴ�.");
	}
}
