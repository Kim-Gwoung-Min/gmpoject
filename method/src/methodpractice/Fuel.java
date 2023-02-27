package methodpractice;

public class Fuel {

	
//	가솔린 8.68L를 충전한 A자동차는 총 182.736Km를 운행할 수 있었다고 합니다. 이차의 연비를 메소드를 사용해서 계산해주세요
//	
	public static double Fuelefficiency(double km,double fuel) {
	return km/fuel;
	}
//		return 주행거리 / 리터 
//	}
	
	public static void main(String[] args) {
		double fuel = 8.86;
		double km = 182.736;
		
		System.out.printf("연비 : %.2f km/L", Fuelefficiency(km, fuel));
	}
}
