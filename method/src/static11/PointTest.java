package static11;

public class PointTest {
	public static void main(String[] args) {
		
		//객체 생성
		Point p1 = new Point(0,0);
		Point p2 = new Point(3,4);
		
		//거리 계산 
		double dist = Point.distance(p1, p2);
		
		//결과 출력 
		System.out.printf("두 점 A%s, B%s 사이의 거리 : %.2f", p1.toString(), p2.toString(), dist);
			
	}
}
class Point{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x= x;
		this.y= y;
	}
	static double distance(Point p1, Point p2) {
		double dx = p1.x - p2.x;
		double dy = p1.y - p2.y;
		return Math.sqrt((dx * dx) + (dy*dy));
	}
	@Override
	public String toString() {
		return String.format("(%d, %d)" , x,y);
	}
}
// 두 점 A(0,0) B(3,4) 사이의 거리 5.00