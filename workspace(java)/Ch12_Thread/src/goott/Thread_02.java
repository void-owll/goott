package goott;
/*
 * 스레드(Thread)?
 * - process 를 작은 단위로 쪼개어 놓은 작업 단위.
 *   ==> 실제 프로그램이 수행이 되는 작업의 최소 단위.
 * - 스레드는 병행 처리를 지원함(멀티태스킹)
 * - 응용분야 : 게임, 채팅 등등
 */

/*
 * [스레드 클래스 작성 방법 - 2가지]
 * 1. Thread 클래스를 상속(extends)받아서 사용
 * 2. Runnable 인터페이스를 구현(implements)하여 사용
 */

/*
 * 1. Thread 클래스를 상속(extends)받아서 사용
 *    1) Thread 라는 클래스를 상속을 받음.
 *    2) run() 메서드를 재정의 - 스레드 구현
 *    3-1) Thread 클래스 객체 생성.
 *    3-2) 참조변수.start() 메서드 호출
 *         ==> start() 메서드를 호출하면 run() 메서드 실행함.
 */

class Thread1 extends Thread {
	@Override
	public void run() {
		int i = 1;
		while(true) {
			System.out.println("Thread1.i >> " + i++);
		}
	}
}
	
class Thread2 extends Thread {
	public void run() {
		int j = 1;
		while(true) {
			System.out.println("Thread2.j >> " + j++);	
		}
	}
}
public class Thread_02{
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		
		thread1.start(); 
		thread2.start();
	}

	
}
