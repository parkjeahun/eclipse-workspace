package arraylist;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;//ArrayList선언(해당 과목의 이름과 점수를
								   //담는 객체형 배열선언
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();//ArrayList생성
	}

	public void addSubject(String name, int score) {
		Subject subject = new Subject();	//Subject생성
		subject.setName(name);				//과목 이름 추가
		subject.setScorePoint(score);		//점수 추가
		subjectList.add(subject);			//배열에 저장
	}

	public void showStudentinfo() {
		int total = 0;
		for (Subject s : subjectList) {
			total += s.getScorePoint();		//총점 더하기
			System.out.println(studentID + " 학생 " + studentName + "의 "
			+ s.getName() + "과목 성적은 " + s.getScorePoint() + "입니다.");
			
		}
		System.out.println(studentID + " 학생 " + studentName + "의 총점은 "
				+ total + " 입니다.");
	}
}
