package home;

class Square{
	int length;
	
	int area() {
		return length * length;
	}
}
public class SquareTest {
	public static void main(String[] args) {
		Square s1 = new Square();
		
		s1.length =4;
		
		System.out.printf("한변의 길이가 %d인 정사각형의 넓이 : %d", s1.length, s1.area());
	}
}	
