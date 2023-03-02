package home;

//인스턴스 메소드 호출 연습


class Cat{
	String name;	//이름 
	String breeds; //품종 
	int age;			//나이
	
	//메소드 ( 동작) 영역 
	void meow(){
		System.out.printf("[%s]의 야옹 ~\n 나이는[%d] 살\n", name,age);
	}
	// 1. claw 메소드를 완성하시오. 
	void claw() {
		System.out.printf( "[%s]의 할퀴기 샥샥 ! \n",name);
	}
}
public class Tests {
	public static void main(String[] args) {
		Cat cat1= new Cat();
		Cat cat2= new Cat();
		
		cat1.age = 10;
		cat2.age = 5;
		
		cat1.name="네로";
		cat2.name="나비";
		
		cat1.meow();
		cat2.meow();
		System.out.println("====================");
		cat1.claw();
		cat2.claw();
	}
}
