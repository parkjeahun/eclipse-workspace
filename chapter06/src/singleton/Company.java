package singleton;

public class Company {
	private static Company instance = new Company();
	private Company () {}	//Company객체를 New키워드를 통해서 생성하지 못하도록 설정
	
	public static Company getInstance() {
		if(instance == null) {		//null : 비어있다,값을 가지고 있지 않는 상태
			instance = new Company();
		}
		return instance;
	}

}
