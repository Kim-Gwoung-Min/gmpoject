package home;

class Dog{
	String name;
	int age;
	
	void bark() {
		//필드 name을 사용 
		System.out.println(name+"의 으르르르릉ㄹㅇㅇㅇ오왈왕ㄹ오랑ㅇㅇㄹ");
	}
}


public class ClassScope {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		
		dog1.name = "츄";
		dog1.bark();
	}
}
