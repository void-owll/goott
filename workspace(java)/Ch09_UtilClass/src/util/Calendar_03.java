package util;

import java.util.Calendar;

/*
 * 3. Calendar 클래스
 *    - 날짜 / 시간과 관련된 정보를 제공해 주는 클래스.
 *    - Calendar 클래스는 추상클래스임.
 *    - 추상클래스로 작성한 이유 : 날짜와 시간을 계산하는 방법이 나라, 지역마다 다르기 때문.
 *    - Calendar 클래스는 날짜와 시간을 계산하는데 꼭 필요한 메서드나 상수로 구성됨.
 *    - Calendar 클래스를 객체 생성을 하려면 Calendar 클래스가 가지고 있는 클래스(정적) 메서드인
 *      getInstance() 메서드를 사용해야 함.
 *    - getInstance() 메서드를 호출하면 내부적으로 java.util.GregorianCalendar 클래스의 객체를
 *      생성하여 반환을 함.
 *    - GregorianCalendar 클래스는 Calendar 클래스의 자식 클래스임.
 *    - getInstance() : 싱글턴 방식. 하나의 인스턴스만을 가지고 공유해서 사용하고자 할 때 사용하는 방식.
 */	  
public class Calendar_03 {

	public static void main(String[] args) {
		// Calendar 클래스 객체 생성하는 방법
		Calendar cal = Calendar.getInstance();
		
		// 날짜와 관련된 정보를 확인
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 0 == JANUARY 이기 때문에 1로 더해야 함. 
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.WEEK_OF_YEAR);
		System.out.println("현재 년도 >> " + year + "년");
		System.out.println("현재 월 >> " + month + "월");
		System.out.println("현재 일 >> " + day + "일");

		// 1년 52주 중에 오늘은 몇 번째 주인지 확인하기
		System.out.println("현재 주는 52주 중에 >> " + week + "번째 주");
		System.out.println();
		
		// 시간과 관련된 정보 확인하기
		// 1. 12시간제를 이용하는 방법 ==> 오전(0), 오후(1)
		int am_pm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.print(am_pm == 0 ? "오전 " : "오후 ");
		System.out.print(
			hour + "시 "+ 
			minute + "분 "+ 
			second + "초 \n");
		System.out.println();
		
		// 2. 24시간제를 이용하는 방법
		int hours = cal.get(Calendar.HOUR_OF_DAY);
		
		System.out.print(hours + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 \n");
		System.out.println();
		
	}

}
