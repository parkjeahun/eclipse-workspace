package chapter02;

public class CharacterEX02 {

	public static void main(String[] args) {
		
		char ch1 = '한';
		char ch2 = '\uD55C';  //유니코드 값 (한)
		char ch3 = '가';
		char ch4 = '\uD56B';
		char ch5 = '\uAC38';
		
		//char ch6 = -65;
		char ch7 = 65;
		System.out.println(ch1);
	    System.out.println(ch2);
	    System.out.println(ch3);
	    System.out.println(ch4);
	    System.out.println(ch5);
	    System.out.println(ch7);
	}

}
