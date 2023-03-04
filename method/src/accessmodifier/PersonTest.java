package accessmodifier;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("광민", "010-0000-0000");
		
		//1. 게터를 호출하여 필드 값을 얻으시오
		System.out.printf("이름 : %s \n", p1.getName());
		System.out.printf("연락처 : %s \n", p1.getPhoneNumber());
		
	}
}



class Person{
	//필드 
	private String name;
	private String phoneNumber;
	
	// 생성자 
	public Person(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	//getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name  = name;  
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhonNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
//	@Override
//	public String toString() {
//		return String.format("이름 : %s \n 연락처 : %s ",  name,phoneNumber);
//	}
	
}