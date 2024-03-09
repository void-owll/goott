package inheritance;

import java.util.Scanner;

public class Volume_05 {
	public static void main(String[] args) {
		TV tv = new TV();
		Audio audio = new Audio();
		Computer computer = new Computer();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. TV / 2. Audio / 3. Computer / 4. 종료");
			System.out.print("위 메뉴 중 하나를 선택하세요. : ");
			int menu = sc.nextInt();
			
			if(menu == 4) break;
			
			System.out.print("1. 볼륨 Up / 2. 볼륨 Down : ");
			int volume = sc.nextInt();
			
			switch(menu) {
			case 1:		// TV 메뉴 선택
				if(volume == 1) tv.volumeUp();
				else tv.volumeDown();
				break;
			case 2:		// Audio메뉴 선택
				if(volume == 1) audio.volumeUp();
				else audio.volumeDown();
				break;
			case 3:		// Computer 메뉴 선택
				if(volume == 1) computer.volumeUp();
				else computer.volumeDown();
				break;
			}
			System.out.println();
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("TV Volume : " + tv.getVolume() + " / " + "Audio Volume : " + audio.getVolume() + " / " 
					+ "Computer Volume : " + computer.getVolume());
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println();
		}
		System.out.println();
		System.out.println("수고 많이 하셨습니다!!!");
		sc.close();
	}
}
