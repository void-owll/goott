package inheritance;

public class Volume {
	int volume = 1;
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
	
	// 볼륨을 올리는 메서드
	
	void volumeUp() {
		volume ++;	
		if(volume > 15)	volume = 15;
	}
	void volumeDown() {
		volume --;	
		if(volume < 1)	volume = 1;
	}
	
}
