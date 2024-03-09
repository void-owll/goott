package collection;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue 자료 구조
 * - queue 는 인터페이스라서 자식클래스로 객체를 생성하여 사용함.
 * - 대표적인 자식 클래스는 LinkedList 객체임.
 * - 특징 : 선입선출(FIFO : First In First Out)
 */
public class Queue_08 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		// 1. add() : queue 에 저장하는 메서드.
		//  		  queue 에서 예외처리가 포함되지 않은 메서드.
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		// 2. element() : queue 에 가장 먼저 입력된 데이터를 출력하는 메서드.
		System.out.println(queue.element());
		
		// remove() : queue 에 가장 먼저 입력된 데이터를 출력하고 삭제하는 메서드.
		System.out.println(queue.remove()); // 3
		System.out.println(queue.remove()); // 4
		System.out.println(queue.remove()); // 5
//		System.out.println(queue.remove()); // add()로 추가했을 경우 : 데이터가 없음 ==> 예외 발생!
		System.out.println(queue.isEmpty());
		
		Queue<Integer> queue2 = new LinkedList<Integer>();
		// 1. offer() : queue 에 저장하는 메서드.(보통 이걸 씀)
		//              queue 에서 예외처리가 포함된 메서드.
		queue2.offer(3);
		queue2.offer(4);
		queue2.offer(5);
		
		// 2. element() : queue 에 가장 먼저 입력된 데이터를 출력하는 메서드.
		System.out.println(queue2.element());
		
		// poll() : queue 에 가장 먼저 입력된 데이터를 출력하고 삭제하는 메서드.
		System.out.println(queue2.poll()); // 3
		System.out.println(queue2.poll()); // 4
		System.out.println(queue2.poll()); // 5
		System.out.println(queue2.poll()); // add()로 추가했을 경우 : 데이터가 없음 ==> 예외 발생!
		System.out.println(queue2.isEmpty());
	}
}
