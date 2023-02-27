package methodpractice;

public class Square {
	
	public static void printSquare(int x) {
		System.out.println(x * x);
	}
	
	public static int getNumber(int x) {
		return x*x;
	}
	public static void main(String[] args) {
		int value =2;
		printSquare(value);  // 2*2
		printSquare(3);  		// 33  
		printSquare(value * 2);  // 4 
	
		System.out.println(getNumber(value));
		System.out.println(value);
	}
}
