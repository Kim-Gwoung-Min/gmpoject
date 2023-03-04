package home1;


class Marine{
	String name;
	int hp;
	int mp;
	public Marine(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	void stimPack() {
		System.out.printf("[%s]의 스팀팩!  HP : (%d -> ", name, hp);
		hp -= 10;
		System.out.printf("%d) \n", hp);
}
	
}
class Medic{
	String name;
	int hp;
	int mp;
	
	public Medic(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	void heal(Marine target) {
		System.out.printf("[%s]의 치유! = > [%s] HP ( %d - > ", name, target.name, target.hp);
		target.hp += 10;
		mp -= 10;
		System.out.printf("%d)\n", target.hp);
		System.out.println("=========================");
		System.out.printf("%s의 남은 MP : %d",name ,mp);
	}
	
}


public class StarCraft {
	public static void main(String[] args) {
		//객체 생성 
		 Marine ma =new Marine("레이너",80);
		 Marine ma1 =new Marine("삐리리리리릴",80);
		 Medic me = new Medic("모랄레스",60,60);
		//마린의 스팀팩 
		ma.stimPack();
		
		//메딕의 힐
		me.heal(ma);
		
		for(int i=0; i<20; i++) {
			ma1.stimPack();
			ma.stimPack();
			if(ma.hp >0 & me.mp >0) {
				me.heal(ma);
				me.heal(ma1);
			}else if(ma.hp<0 || ma.hp==0 ){
				System.out.println("죽음 ");
				break;
			}
		}
	}
}
