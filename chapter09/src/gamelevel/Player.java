package gamelevel;

public class Player {
	private PlayerLevel level; // PlayerLevel(�ڷ���), level(�ν��Ͻ���)
								// level �ν��Ͻ� ������ ��ü�� ��� ��� ����ȯ(��ĳ����)

	public Player() { // Player �⺻ ������
		level = new BeginnerLevel();// PlayerLevel �ڷ������� ��ĳ����
		level.showLevelMessage(); // PlayerLevel level = new BeginnerLevel();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void upgeadeLevel(PlayerLevel level) {// ��ü�� ��ǲ������ �ް�, ����ȯ(��ĳ����)
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count);
	}

}