package chapter5;

public class Student_Test {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	
	public void showStudentInfo() {
		System.out.println(studentName + "," +address);
	}
	
	public static int add(int k1, int k2) { //return <= �������� int �Լ�������
		int result = k1 + k2;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 20;
		
		int sum = add (num1,num2);
		System.out.println(num1 + "+" + num2 + "=" + sum + "�Դϴ�");
		
	}

}
