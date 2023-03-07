package superTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {

	Elf e = new Elf("티란데",100);
	Elf e1 = new HighElf("말푸리온",160, 100);
	Elf e2= new ElfLord("마이에브",230,140,100);
	
ArrayList<Elf> list = new ArrayList<Elf>(Arrays.asList(e,e1,e2));
	
		for(int i=0; i<list.size(); i++) {
				if(list.get(i) != null) {
					if(list.get(i) instanceof ElfLord) {
						ElfLord e3 =(ElfLord)list.get(i); 
						System.out.println(e3);
					}
				}
		}
	}
}
class Elf{
	 String name;
	int hp;

public Elf(String name, int hp) {
	this.name = name;
	this.hp = hp;
}
	@Override
	public String toString() {
		return String.format("[엘프] Name : %s,  HP: %d ", this.name, this.hp);
	}
}
class HighElf extends Elf{

	 int mp;
	
	public HighElf(String name, int hp,int mp) {
		super(name, hp);
		this.mp = mp;
	}
@Override
public String toString() {
	return String.format("[하이엘프] Name : %s,  HP: %d ,  MP : %d", super.name, this.hp,this.mp);
	}	
}
class ElfLord extends HighElf{
	
	 int shield;
	public ElfLord(String name, int hp, int mp, int shield) {
		super(name, hp, mp);
		this.shield = shield;
	}
	@Override
	public String toString() {
		return String.format("[엘프로드] Name : %s,  HP: %d ,  MP : %d , SH: %d", this.name, this.hp,this.mp,this.shield);
	}
	
}