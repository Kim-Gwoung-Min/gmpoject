package bank1;

public class Theif {
// 메인 메소드
	public static void main(String[] args) {
		// 지갑 객체 생성
		Wallet wallet = new Wallet(30000);
		System.out.println(wallet.toString());
		
		
		//지갑에서 돈을 모두 꺼냄 
		Theif.steal(wallet);

		// 지갑 확인
		System.out.println("- >" +wallet.toString());
	}
		
	
		// 클래스 메소드 
		public static void steal(Wallet target) {
//			target.money = 0;
		}
}

class Wallet{
	private int money = 0;
	
	public Wallet(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return String.format("지갑의 잔액 %d", money);
	}
}
