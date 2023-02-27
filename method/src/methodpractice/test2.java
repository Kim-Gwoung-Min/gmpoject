package methodpractice;

public class test2 {
//문제 
	//한걸음을 걸을때마다 0.02kcal가 소모된다고 한다 . 하루동안 5000걸음 
//	을 걸었다고 할때. 이를 통해 소모된 칼로리량을 메소드로 계산해주세요
	
	public static void getKcal() {
		System.out.println("소모된 칼로리 : " + 0.02 * 5000); 
	}
	public static void main(String[] args) {
		getKcal();
	}
}
