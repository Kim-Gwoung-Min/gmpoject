package home;

//자전거 클래스
class Bicycle1{
	
	//필드
	String name;
	double weight;
	int price;
	
	public Bicycle1(String name, double weight,int price) {
		this.name = name;
		this.weight= weight;
		this.price = price;
	}
	//메소드
	void move() {
		System.out.println("자전거를 타고 이동합니다");
	}
	void horn() {
		System.out.println("따르릉! 지나갈게요. ");
	}
}
public class BicycleTestRefactory {
		public static void main(String[] args) {
			
			//자전거 객체 생성 
			Bicycle1 b1 = new Bicycle1("로드형자전거",7.25,326000);
			Bicycle1 b2 = new Bicycle1("산악형자전거",10.68,429000);
			Bicycle1 a1=new Bicycle1("씽씽2 ",12.57, 495000);
			Bicycle1 a2=new Bicycle1("브룽2",32.21, 215000);
			
			System.out.println(a2.name);
			
			// 객체 정보 출력 
			System.out.printf("b1 ->{%s, %.2f, %d} \n", b1.name , b1.weight, b1.price);
			System.out.printf("b1 -> {%s, %.2f, %d} \n", b2.name , b2.weight, b2.price);
		}
	}	
