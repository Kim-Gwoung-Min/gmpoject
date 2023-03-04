package accessmodifier;

public class LockTest {
	public static void main(String[] args) {
		//객체 생성 
		Lock lock = new Lock("!@#%4!@");
		System.out.println("바뀌기전 비밀번호");
		System.out.println(lock.toString());
		
		//객체 비밀번호 변경 
		lock.setPassword("1234");
		
		//객체의 정보 출력 
		System.out.println("변경된 후 비밀번호");
		System.out.println(lock.toString());
	}
}

class Lock{
	//필드 
	private String password;
	
	//생성자 
	public Lock(String password) {
		this.password = password;
	}
	//메소드 
	@Override
	public String toString() {
		return String.format("Lock { password: %s } ", password);
	}
	//비밀번호 변경을 위해 , 세터 메소드를 추가하시오 
	public void setPassword(String password) {
		this.password = password;
	}
}
