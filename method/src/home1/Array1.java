package home1;

class Book{
	String name;
	public Book(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}

public class Array1 {
	public static void main(String[] args) {
		Book[] comics = { 
				new Book("나루토"),
				new Book("원피스"),
				new Book("슬램덩크")
		};
		System.out.println(comics[0].name);
		System.out.println(comics[0]);
	}
}
