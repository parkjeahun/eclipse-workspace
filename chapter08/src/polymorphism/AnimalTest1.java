package polymorphism;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}
class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}
class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}
public class AnimalTest1{
	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
			aTest.moveAnimal(new Human());
			aTest.moveAnimal(new Tiger());      
			aTest.moveAnimal(new Eagle());
		}									
	public void moveAnimal(Animal animal) {	//Animal animal = new Human();//업캐스팅
		animal.move();						//Animal animal = new Tiger();//업캐스팅
	}										//Animal animal = new Eagle();//업캐스팅
}