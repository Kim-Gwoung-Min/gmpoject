package home1;



class Hero{
	String name;
	int hp;
	
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	void punch(Hero enemy) {
		//때린 주체 객체
		System.out.printf("[%s]의 펀치 !!", name );
		
		
		//타노스의 HP : 160 -> 150 
		System.out.printf("%s의 HP: %d -> ", enemy.name ,enemy.hp);
		enemy.hp -= 10;
		System.out.printf("%d\n ", enemy.hp);
	}
}
public class HeroTest {
	public static void main(String[] args) {
		int attack = 0;
		Hero thor = new Hero("토르", 150); // thor -> {"토르 " ,150}
		Hero thanos = new Hero("타노스", 160); //thanos -{"타노스",  160}
		int idx =0;
		//토르의 펀치 -> 타노스 
		System.out.println("====토르가 타노스를 한번 공격했다.");
		thor.punch(thanos);
		
		System.out.println("====타노스가 토를 한번 공격했다.");
		thanos.punch(thor);
		while(thanos.hp != 0) {
			idx++;
			attack++;
			System.out.printf(idx+"번 공격");
			thor.punch(thanos);
			System.out.println("\n\n");
			if(thanos.hp==0) {
				System.out.println("타노스 죽음 ");
			}
		}
	
	}
	
}
