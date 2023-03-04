package bank1;

public class Main {
	public static void main(String[] args) {
		// 계좌 생성 
		Account myAccount = new Account(1000000);
		System.out.println(myAccount.toString());
	
		//계좌 해킹 
		Hacker.malcious(myAccount);
		
		System.out.println(myAccount.toString());
	}
}	



class Account{
  // 필드
  private int balance;
  // 생성자
  public Account(int balance) {
    this.balance = balance;
  }
  @Override
	public String toString() {
		return String.format("계좌의 잔액 :  %d ", balance);
	}
}
	class Hacker{
		//클래스 메소드 - 계좌의 잔액을 0원으로 변경
		public static void malcious(Account account) {
//			 account.balance =0;
		}
	}
	
