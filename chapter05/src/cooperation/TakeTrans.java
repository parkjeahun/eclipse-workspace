package cooperation;

public class TakeTrans {

	public static void main(String[] args) {

		Student studentJames = new Student("James" , 5000);
		Student studentTomas = new Student("Tomas" , 10000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showinfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2ȣ��");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showinfo();
		subwayGreen.showInfo();
	}

}
