package classes;

public class TV_02 {

	public static void main(String[] args) {
		
		/*TV tv = new TV();
		tv.display();
		tv.color = "검정색";
		tv.channel = 7;
		tv.channelUp();
		tv.display();
		
		System.out.println();
		
		tv.power();
		tv.channelUp();
		tv.display();
		*/
		
		
		/*
		 * [문제1] TV 객체를 만들되 tv1 이라는 참조변수를 이용하여 
		 * 		   객체를 만들고아래와 같이 조건에 맞게 실행해 보세요.
		 * 		   조건1) 색상:흰색, 전원:off, 채널:15
		 * 		   조건2) tv1 정보를 화면에 출력해 보세요.
		 * 				  ==> display() 메서드를 이용하면 됨.
		 * 		   조건3) tv 정보를 다음과 같이 변경하여 화면에 보여주세요.
		 * 				  색상:흰색, 전원:on, 채널:28
		 * [문제2] TV 객체를 만들되 tv2 이라는 참조변수를 이용하여 
		 * 		   객체를 만들고아래와 같이 조건에 맞게 실행해 보세요.
		 * 		   조건1) 색상:흰색, 전원:off, 채널:32
		 * 		   조건2) tv2 정보를 화면에 출력해 보세요.
		 * 				  ==> display() 메서드를 이용하면 됨.
		 * 		   조건3) tv 정보를 다음과 같이 변경하여 화면에 보여주세요.
		 * 				  색상:검정색, 전원:on, 채널:11
		 */
		
		TV tv1 = new TV();
		tv1.color = "흰색";
		tv1.power();
		for(int i=tv1.channel; i<15; i++) tv1.channelUp();
		tv1.power();
		System.out.println("tv1 정보 (1)");
		tv1.display();
		
		tv1.power();
		for(int i=15; i<28; i++) tv1.channelUp();
		System.out.println("tv1 정보 (2)");
		tv1.display();
		
		TV tv2 = new TV();
		tv2.color = "흰색";
		tv2.power();
		for(int i=0; i<32; i++)	tv2.channelUp();

		tv2.power();
		System.out.println("tv2 정보 (1)");
		tv2.display();
		
		tv2.color = "검정색";
		tv2.power();
		for(int i=tv2.channel; i>11; i--) tv2.channelDown();
		System.out.println("tv2 정보 (2)");
		tv2.display();
	}
}
