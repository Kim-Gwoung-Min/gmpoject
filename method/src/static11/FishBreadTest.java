package static11;

//[팥]  		붕어빵
//[고구마]  	붕어빵 
//==============
//붕어빵 객체수 : ?
class FishBread{
	static int count =0;
	
	String contents;
	
	public FishBread(int n ){
		//내용물 선택 - 0: 팥 , 1 :고구마 , 2: 치즈 , 3: 슈크림 
		String[] arr = {"팥"," 고구마","치즈","슈크림 "};
		contents = arr[n];
		
		FishBread.count++;
	}
	void print() {
		System.out.printf("[%s] 붕어빵 \n",contents );
	}
	
	
//	String name;
//	int price;
	
//	public FishBread(String name,int price) {	
//		FishBread.count++;
//	this.name = name;
//	this.price = price;
//	}
//	@Override
//	public String toString() {
//		return "["+name+"]" + "붕어빵\n 가격 : " +price +"원 \n" ;
//	}
//	
}

public class FishBreadTest {
	public static void main(String[] args) {
		//객체 배열 4개 선언 
//		FishBread[] breads = {
//				new FishBread("팥", 1000),
//				new FishBread("고구마", 2000),
//				new FishBread("치즈", 2500),
//				new FishBread("슈크림", 1500)
//		};
//		int idx =0;
//		for(int i=0; i<breads.length; i++) {
//			idx++;
//			System.out.println(FishBread.count);
//			System.out.println(breads[i]);
//			System.out.println("객체 수 : " +idx);
//			
//		}
//		System.out.println("================");
//		System.out.printf("붕어빵 객체 수 : %d", FishBread.count);
		
		//객체 배열 생성 
		FishBread[] breads = new FishBread[4];
//		1. 붕어빵 객체 팥/고구마/치즈/슈크림 순으로 만드시오 
		breads[0] = new FishBread(0);  //팥 
		breads[1] = new FishBread(1);// 고구마 
		breads[2] = new FishBread(2);// 치즈 
		breads[3] = new FishBread(3); //슈크림
		
		//모든 붕어빵 객체 정보 출력
		for(int i=0; i<breads.length;i++) {
			breads[i].print();
		}
		System.out.println("===================");
		System.out.printf("붕어빵 객체 수 : "+ FishBread.count);
				
				
				
		
	}
}
