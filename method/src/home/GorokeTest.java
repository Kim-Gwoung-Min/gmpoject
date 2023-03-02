package home;


class Goroke{
	String name;
	int price;
	
	public Goroke(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	String str() {
		return String.format("Goroke { name : %s, price : %d원 }", name,price);
	}
}


public class GorokeTest {
	public static void main(String[] args) {
		Goroke[] ardata =  {
				new Goroke("피자", 1000),
				new Goroke("야채", 800),
				new Goroke("팥", 500)
		};
		
		for (Goroke goroke : ardata) {
			System.out.println(goroke.str());
		}


		
		
	}
}
