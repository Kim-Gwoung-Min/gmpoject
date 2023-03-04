package methodScope;

public class MethodScope {
	public static void main(String[] args) {
		//main 메소드의 지역변수 score
		int score = 0;
		int point = 0;
		System.out.printf("score = %d in main() \n", score);
		
		//Record 클래스의 메소드 실행 
		for(int i=0; i<10; i++) {
			int sum = 0;
			Record.foo(score);
			score-= 10;
//			sum = score;
//			System.out.println(sum);
			
		}
		System.out.println("score그냥 출력 -> 전역변수이기때문에 "+score);
		Record.foo(score);	// -110
		System.out.println("====메소드 돌면서 리턴값이 있는게 아니기때문에 안에서만 돌고 끝");
		Record.foo(score); //-110
		
		//score 마지막 출력이 -100 에 score+=10을 해서 출력해보면 -90
		score +=10;
		// main 메소드의 지역변수 score 실행 
		System.out.printf("score = %d in main() \n", score);
	}
}

class Record{
	//클래스 메소드 
	public static void foo(int score) {
		//printMinus10 메소드의 파라미터 score의 값을 10 감소 
		
		score -= 10;
		
		//printMinus10 메소드의 파라미터 score의 값을 출력 
		System.out.printf("score = %d in foo() \n" ,score);
	}
}
