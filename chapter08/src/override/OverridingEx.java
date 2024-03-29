package override;

class Shape{			//슈퍼 클래스
	public Shape next;
	public Shape () {next = null;}
	
	public void drow () {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void drow() {		//메소드 재정의 (메소드 오버 라이딩)객체의 다형성
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void drow() {		//메소드 오버라이딩
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void drow() {		//메소드 오버라이딩
		System.out.println("Circle");
	}
}
public class OverridingEx {
	static void print(Shape p) {
		p.drow();
	}
	public static void main(String[] args) {
		Line line = new Line ();
		print(line);
		print(new Shape());
		print(new Line());
		print(new Rect());
		print(new Circle());
	}
}