package home1;


class Song{
	//필드 
	String name;
	String singer;
	
	public Song(String name, String singer) {
		this.name = name;
		this.singer = singer;
	}

	public String toStr() {
		return String.format("Song { name : %s, singer : %s}", name, singer);
	}
	
}
public class test1 {
	public static void main(String[] args) {
		//별헤는 밤 - 유재하
		// 비상 - 임재범 
		// 비밀 - 박완규 
		//이들을 객체 배열로 만들어, 반복문을 통해 출력 예와 같은 결과를 얻으시오
//		Song[] arSong = { 
//				new Song("별헤는 밤 ", "유재하"),
//				new Song("비상 ", "임재범"),
//				new Song("비밀", "박완규")
//		};
//		for(int i=0; i<arSong.length; i++) {
//			System.out.println(arSong[i].toStr());
//		}
//		System.out.println("========foreach");
//		for (Song song : arSong) {
//			System.out.println(song.toStr());
//		}
		Song s0 = new Song("벨헤는 밤 ", "유재하");
		Song s1= new Song("비상 ", "임재범");
		Song s2 = new Song("비밀", "박완규");
		
		Song[] songs = {s0,s1,s2};
		
		for(int i=0; i<songs.length; i++) {
			System.out.println(songs[i].toStr());
		}
		for (Song song : songs) {
			System.out.println(song.toStr());
		}
		
		
	}
}
