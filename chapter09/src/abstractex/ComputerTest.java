package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c1 = new Computer();		//추상 클래스는 객체를 생성 할 수 없다.
		Computer c2 = new DeskTop();
		Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
	}
}
