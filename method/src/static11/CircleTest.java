package static11;



class Circle{
	int x; // 원의 중심 -X좌표 
	int y; // 원의 중심 -Y좌표 
	int r; // 반지름 
	public Circle(int x,int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	static double  getAreaCircle(Circle c) {
		return Math.PI * c.r * c.r;
	}
	@Override
	public String toString() {
		return String.format("Circle { 중심 : (%d, %d),  반지름 : %d } ",x,y,r);
	}
}

public class CircleTest {
	public static void main(String[] args) {
		
		//객체 생성 
		Circle c1 = new Circle(0,0,3);  //중심(0,0) - 반지름 3 
		Circle c2 = new Circle(2,3,4);  //중심(2,3) - 반지름 4 
		
		//1. 클래스 메소드를 호출하여 원의 넓이를 구하세요.
		double area1 = Circle.getAreaCircle(c1);
		double area2= Circle.getAreaCircle(c2);
		
		System.out.printf("%s  - > 넓이 : %.2f\n", c1.toString(),area1);
		System.out.printf("%s  - > 넓이 : %.2f\n", c2.toString(),area2);
	}
}
