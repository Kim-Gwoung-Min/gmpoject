package accessmodifier;

public class UpCasting {
	public static void main(String[] args) {
	//객체 생성
		Square s = new Square();
		Triangle t = new Triangle();
		Circle c = new Circle();
		
		//초기화 
		s.name = "사각형";
		s.length = 5;
		
		t.name= "삼각형";
		t.base = 2;
		t.height=4;
		
		c.name="원";
		c.radius =4;
		
		Shape[] shapeList = {s,t,c};
		
		for(int i=0; i<shapeList.length;i++) {
			Shape temp = shapeList[i];
			System.out.printf("%s의 넓이 - > %.2f \n", temp.name , temp.area());
		}

	}
}
class Shape{
	String name;
	
	public double area() {
		return 0;
	}
}

class Square extends Shape{
	int length;
	@Override
	public double area() {
		return length * length;
	}
	
}

class Triangle extends Shape{
	int base;
	int height;
	
	@Override
	public double area() {
		return base * height / 2.0;
	}
	
}
class Circle extends Shape{
	int radius;
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
