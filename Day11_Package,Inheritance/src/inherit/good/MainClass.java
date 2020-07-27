package inherit.good;

public class MainClass {

	public static void main(String[] args) {

		Warrior w1 = new Warrior();
		w1.name = "전사";
		w1.level = 1;
		w1.atk = 3;
		w1.hp = 50;
		w1.rage = 100;
		w1.characterInfo();

	}

}
