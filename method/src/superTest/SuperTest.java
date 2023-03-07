package superTest;

public class SuperTest {
	public static void main(String[] args) {
		Orc o = new Orc("오크",70);
		
		OrcWarrior w = new OrcWarrior("카라취", 90, 20);
		
//		System.out.printf("Orc { name : %s, hp : %d} \n ",o.name,o.hp);
//		System.out.printf("OrcWarrior { name : %s, hp : %d, amor : %d} \n ",w.name,w.hp,w.amor);
		System.out.println(o);
		System.out.println(w);
		System.out.println(o.toString());
		System.out.println(w.toString());
	}
}

class Orc{
	String name;
	int hp;
	
	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	@Override
	public String toString() {
		return String.format("Orc { name : %s, hp : %d} \n ",this.name,this.hp);
	}
}

class OrcWarrior extends Orc{
	
	int amor;
	
	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);
		this.amor = amor;
		}
	@Override
	public String toString() {
		return String.format("OrcWarrior { name : %s, hp : %d, amor : %d} \n ",this.name,this.hp,this.amor);
	}
	}

	
	
