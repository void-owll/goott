package collection;

import java.util.Stack;

/*
 * Stack 클래스(자료구조)
 * - 후입선출(LIFO : Last In First Out) 또는
 *   선입후출(FILO : First In Last Out) 구조임
 *   
 */
public class Stack_07 {
	public static void main(String[] args) {
		// Stack 컬렉션 객체 생성
		Stack<Coin> coins= new Stack<>();
		
		// 1. push() : stack 에 데이터를 넣는 메서드.
		coins.push(new Coin(1000));
		coins.push(new Coin(500));
		coins.push(new Coin(100));
		coins.push(new Coin(10000));
		coins.push(new Coin(5000));
		
		/*
		 * peek() : - stack 에 저장된 데이터를 가져오는 메서드.
		 *          - stack 의 맨 위(마지막에 저장된 데이터)에 저장된 데이터를 가져오는 메서드.
		 *          - 가져온 후 데이터를 stack 에서 제거하지 "않는" 메서드.
		 * pop() :  - stack 에 저장된 데이터를 가져오는 메서드.
		 *          - stack 의 맨 위(마지막에 저장된 데이터)에 저장된 데이터를 가져오는 메서드.  
		 * 			- peek()과 달리, stack 에서 제거하는 메서드.
		 */
		
		System.out.println("stack peek() >>> " + coins.peek().getCoin());
		System.out.println();
		
		while(!coins.isEmpty()) {
			System.out.println("stack pop() >>> " + coins.pop().getCoin());
		}
		
//		System.out.println("stack peek() >>> " + coins.peek().getCoin());
//		System.out.println("stack peek() >>> " + coins.peek().getCoin());
//		System.out.println("stack peek() >>> " + coins.peek().getCoin());
//		System.out.println("stack pop() >>> " + coins.pop().getCoin());
//		System.out.println("stack pop() >>> " + coins.pop().getCoin());
//		System.out.println("stack pop() >>> " + coins.pop().getCoin());
//		System.out.println("stack pop() >>> " + coins.pop().getCoin());
		
	}
}
