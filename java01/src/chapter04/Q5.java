package chapter04;

public class Q5 {

	public static void main(String[] args) {

		int lineCount = 4;  //출력할 라인수
		int starCount = 1;  //별을 출력 하는 변수, 초기값으로 1
		int spaceCount = 3; //공백을 처리하는 변수, 초기값으로 3
		
		for (int i=0; i < lineCount; i++) {			// 라인을 처리 하는 FOR
			for (int j=0; j < spaceCount; j++) {	//별표 왼쪽의 공백 처리
				System.out.print(' ');
			}
			for (int j = 0; j < starCount; j++) {	//별표를 처리
				System.out.print('*');
			}
			for (int j = 0; j < spaceCount; j++) {	//별표의 오른쪽 공백 처리
				System.out.print(' ');
			}
			spaceCount -=1;
			starCount +=2;
			System.out.println();
		}
	}

}
