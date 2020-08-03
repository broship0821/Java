package poly.player;


public class Warrior extends Player{

	
	int rage;


	Warrior(String name){
		super(name);
		rage = 60;
		job = "전사";
	}
	
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}
	
	/*
	 1. rush라는 기술을 사용하는 사람의 이름을 적절한 키워드를 사용하여 출력
	 2. 이 기술을 맞는 사람의 피해량을 출력해주세요
	 	전사:10, 법사:20, 사냥꾼:15
	 3. 직업별로 다른 피해량을 instanceof 키워드를 사용하여 각각 출력하기
	 4. 남은 체력 출력
	 */
	
	public void rush(Player player) {
		int damage = 0;
		
		System.out.printf("%s님이 %s님에게 돌진을 시전하였습니다.\n", name, player.name);
		
		if(player instanceof Warrior) {
			damage = 10;
			System.out.printf("%s(%s)님이 %d의 피해를 입었습니다.\n", player.name, player.job, damage);
		}
		else if(player instanceof Mage) {
			damage = 20;
			System.out.printf("%s(%s)님이 %d의 피해를 입었습니다.\n", player.name, player.job, damage);
		}
		else if(player instanceof Hunter) {
			damage = 15;
			System.out.printf("%s(%s)님이 %d의 피해를 입었습니다.\n", player.name, player.job, damage);
		}
		
		player.hp -= damage;
		System.out.printf("%s님의 남은 체력: %d\n", player.name, player.hp);
		System.out.println("------------------------");
		
		
	}
	
	
}
