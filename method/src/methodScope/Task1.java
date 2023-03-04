package methodScope;

public class Task1 {
	public static void main(String[] args) {
	
		Coffe americano = new Coffe("아이스 아메리카노",2500);
		System.out.println(americano);
		
		//가격 변경
		System.out.println("======가격 변경");
		americano.setPrice(1000);
		System.out.println(americano);
	}
}

class Coffe{
	//필드 (인스턴스 변수)
	private String name;
	private int price;
	
	// 생성자 
	public Coffe(String name,int price) {
		//1. this 키워드를 사용하여 필드 초기화 
		this.name = name;  //매개변수 값 대입. 
		this.price = price;
	}
	//세터 
	public void setPrice(int price) {
		//this 키워드를 사용하여 필드 변경 
		//이 객체의 인스턴스에 매개변수값으로 변경.
		this.price = price;
	}
//	메소드
	@Override
	public String toString() {
		return String.format("Coffe {name : %s price: %d}", name,price);
	}


}
