package interfaces;

interface Camera {
	
	// 사진을 찍는 기능
	void photo();
}

interface Search {
	
	// TV를 보는 기능
	void search();
}

interface MP3 {
	
	// 음악을 듣는 기능
	void playMusic();
}

class MyPhone implements Camera, Search, MP3 {

	@Override
	public void playMusic() {
		
		System.out.println("핸드폰으로 음악을 들어요~~");
		
	}

	@Override
	public void search() {
		
		System.out.println("핸드폰으로 검색을 해요~~~");
		
	}

	@Override
	public void photo() {
		
		System.out.println("핸드폰으로 사진을 찍어요~~~");
		
	}
	
}


public class Main_03 {

	public static void main(String[] args) {
		
		MyPhone myPhone = new MyPhone();
		
		myPhone.photo();
		myPhone.search(); myPhone.playMusic();

	}

}
