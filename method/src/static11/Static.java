package static11;

class Galaxy{
	//필드(인스턴스 변수)
	String serialNum; // 일련번호
	
	//클래스 변수 
	static int count = 0;
	
	//생성자 
	public Galaxy() {
		count++;
		char c = randomAlphabet();  //A~Z 중 택1 
		serialNum = String.format("%c -	%d", c, count);
	}
	
	char randomAlphabet() {
		return (char)('A'+ Math.random() *26); // A to Z
	}

	public void print() {
		System.out.println("Galaxy { serialNum : " + serialNum);
	}
}

public class Static {
	public static void main(String[] args) {
		//5칸 크기의 객체 배열 생성 
		Galaxy[] phones = new Galaxy[5];
		
		//5칸 짜리 배열에 객체 할당 
		for(int i=0; i<phones.length; i++) {
			phones[i] = new Galaxy();
		}
		for(int i=0; i<phones.length;i++) {
			phones[i].print();
		}
		System.out.println("===========");
		System.out.println(Galaxy.count+"총 갯수");
		
	}
}
