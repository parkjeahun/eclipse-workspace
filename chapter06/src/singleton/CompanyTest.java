package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		//Company instance2 = new Company();
		//외부 에서 접근 차단
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
	}

}
