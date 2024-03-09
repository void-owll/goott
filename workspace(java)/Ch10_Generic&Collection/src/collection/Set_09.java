package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 2. Set 계열의 컬렉션 프레임워크 특징
 *    - 자료의 순서가 없음(index 가 없음 - 정렬 기능이 없음)
 *    - 중복 데이터를 허용하지 않음.
 *    - Set 인터페이스의 자식 클래스를 이용하여 구현.
 *      ==> HashSet(O), TreeSet(X)
 */
public class Set_09 {
	public static void main(String[] args) {
		// Set 인터페이스의 자식 클래스로 객체 생성;
		Set<Integer> set = new HashSet<Integer>();
		
		// 1. add(value) : 데이터를 추가하는 메서드.
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		set.add(300);
		
		// 2. size() : set 의 크기를 정수값으로 반환해 주는 메서드.
		System.out.println(set.size());
		
		/*
		 * List 와 달리 인덱스 정보를 가지고 있지 않기 때문에
		 * 일반적으로 for문을 이용하여 데이터를 꺼낼 수 없음.
		 * 이런 Set의 모든 데이터를 한개씩 꺼내기 위해서는 
		 * Iterator<E> 객체가 필요함. 
		 */
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println("set 데이터 >> " + it.next());
		}
	}
}