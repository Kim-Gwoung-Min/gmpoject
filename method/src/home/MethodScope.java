package home;


class DrinkMachine{
	
	//필드
	String output;
	
	//메소드
	void pushButton(int num) {
		String[] drinks= {"소주","맥주", "콜라","사이다"};
		output = drinks[num];
	}
	
	void printOutput() {
		System.out.println(output);
	}
}


public class MethodScope {
	public static void main(String[] args) {
		// 객체 생성 
		DrinkMachine d1 = new DrinkMachine();
		DrinkMachine d2 = new DrinkMachine();
		
		// 음료 뽑기
		d1.pushButton(2);
		d1.pushButton(3);
		d2.pushButton(1);
		System.out.println("pushButton에 num 넣기 성공");
		

		// 음료 확인 
		d1.printOutput();
		d2.printOutput();
	
	}
}
