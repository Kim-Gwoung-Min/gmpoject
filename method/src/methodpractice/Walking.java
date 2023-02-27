package methodpractice;

public class Walking {
	public static void main(String[] args) {
		double kcal = calculateWalkingKcal(5000);
		System.out.println("소모된 칼로리량 :"+ kcal+"kcal");
	}
	
	public static double calculateWalkingKcal(int walkingCount) {
		
		return 0.02 * walkingCount;
	}
}
