package methodScope;

public class Task2 {
	public static void main(String[] args) {
		Knight n1 = new Knight("돈키호테", 30);
		
		System.out.println(n1.toString());
		System.out.println("==============");
		n1.setHp(30);
		System.out.printf("[체력 증가 + 30] \n");
		System.out.println(n1);
		
	}
}
class Knight{
	private String name;
	private int  hp;
	
	
	public Knight(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void setHp(int hp) {
		this.hp  += hp;
	}
	public int getHp() {
		return hp; 
	}
	@Override
	public String toString() {
		return String.format("name : \" %s \" \n hp : %d",this.name, this.hp);
	}
}
