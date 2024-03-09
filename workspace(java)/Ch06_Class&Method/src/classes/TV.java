package classes;

public class TV {
	// 멤버변수
	String color;		// TV 색상
	boolean power;		// TV 전원
	int channel;		// TV 채널
	
	// 멤버메서드
	void power() {		// TV 전원 메서드
		power = !power;
	}	// power() 메서드 end
	
	void channelUp() {
		if(power) {
			channel++;
		}
	}	// channelUp() 메서드 end

	void channelDown() {
		if(power) {
			channel--;
		}
	}	// channelDown() 메서드 end
	
	void display() {	// TV 상태를 표시하는 메서드
		String status = "";
		if(power) {
			status = "전원 On";
		}else {
			status = "전원 Off";
		}
		System.out.println("TV 색상 >>> " + color);
		System.out.println("TV 전원 >>> " + status);
		System.out.println("TV 채널 >>> " + channel);
	}	// display() 메서드 end
}
