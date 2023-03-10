package accessmodifier;

public class Test1 {
	public static void main(String[] args) {
		
	//객체 생성 
	Basketball b = new Basketball();
	Soccer s = new Soccer();
	PingPong p = new PingPong();
	
	//객체 필드 초기화
	b.setName("농구");
	s.setName("축구");
	p.setName("탁구");
	// 부모 타입(업 캐스팅) 으로 배열 생성
	Sports[] sportsList = {b, s, p};
	
	//모든 운동 설명 출력 
		for(int i=0;i<sportsList.length; i++) {
			Sports temp = sportsList[i];
			temp.description();
		}
	}
}


class Sports{
	private  String  name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public void description() {
		System.out.printf("[%s] 는 여가/경기/체력 단련 등을 위한 신체 운동입니다.\n ", name);
	}
}
class Basketball extends Sports{
	@Override
	public void description() {
		System.out.printf("[%s]는 손으로 공을 던져 골을 넣는 운동이다\n", this.getName());
		}
}
class Soccer extends Sports{
	@Override
	public void description() {
		System.out.printf("[%s]는 주로 발로 공을  차 넣는 운동이다\n",this.getName());
	}
}
class PingPong extends Sports{
	@Override
	public void description() {
		System.out.printf("[%s]는 공을 번갈아가며 주고 받는 운동이다\n",this.getName());
	}
	
}

