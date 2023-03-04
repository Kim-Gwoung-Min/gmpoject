package home1;


// 팀 객체 
class Team{
	String nation; // 국가
	Player[] players; // 선수들
	
	public Team(String str, Player[] players) {
	this.nation = str;
	this.players = players;
	}
	
	void printTeamPoints() {
		int sum = 0;
		for(int i=0; i<players.length;i++) {
			sum += players[i].getPoint();
		}
		System.out.printf("%s -> %d points 입니다 \n", nation, sum);
	}
	
	
	
}
// 선수 클래스 
class Player{
	String name;
	int[] points;
	String teamname;
	
	public Player(String str, int[] scores) {
		this.name=str;
		this.points = scores;
	}
	void printTotalPoint() {
		System.out.printf("%s님의 획득 점수 : %d ", name, points);
	}
	
	int getPoint() {
		int sum=0;
		for(int i=0; i<points.length; i++) {
			sum += points[i];
		}
		return sum;
	}
	
}
public class Olympic {
	public static void main(String[] args) {
		
		//선수 객체 생성 
		Player kim = new Player("Kim",new int[] {10,9,8});
		Player lee= new Player("Lee",new int[] {10,9,10});
		Player park = new Player("Park",new int[] {10,10,10});
		
		//객체 배열 만들기 
		Player[] koreaPlayer = { kim,lee,park};
		
		//팀 객체 생성
		Team korea = new Team("Korea",koreaPlayer);
		
		// 중국 선수 객체 생성 
		Player xiao = new Player("Xiao", new int[] {10,9,10});
		Player yu = new Player("Yu", new int[] {8,9,10});
		Player xui = new Player("Xui", new int[] {8,9,9});

		// 중국 선수 객체 배열 만들기 
		Player[] chinaPlayer = {xiao,xui,yu};
		
		// 팀 객체 생성 
		Team china = new Team("china", chinaPlayer);

		//팀 점수 출력
		korea.printTeamPoints();
		china.printTeamPoints();
		
//		팀 배열 생성 
//		Team[] teams ={ korea, china};
//		for(int i=0; i<teams.length; i++) {
//			teams[i].printTeamPoints();
//		}
	}
}
