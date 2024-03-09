package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 3. Map 컬렉션 프레임워크 특징
 *    - key, value 를 한 쌍으로 해서 데이터를 저장하고
 *      검색하는 기능을 제공함.
 *    - key 는 중복 불가, value 는 중복 가능.
 *    - Map 인터페이스 자식 클래스를 이용하여 구현.
 *      ==> HashMap(O), HashTable(O),
 *          Properties(가끔), TreeMap(X)
 */
public class Map_10 {
	public static void main(String[] args) {
		// Map 인터페이스의 자식 클래스를 이용하여 객체 생성.
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 1. put(key, value) : map 에 데이터를 저장하는 메서드.
		//	 	 ==> 이름을 key, 점수를 value 로 저장.
		
		map.put("홍길동", 92);
		map.put("세종대왕", 100);
		map.put("유관순", 95);
		map.put("이순신", 88);
		map.put("신사임당", 91);

		// 2. get(key) : map 에 저장된 데이터를 가져오는 메서드.
		//    	 ==> get(key) 메서드를 호출하면 인자에 해당하는 value 값을 반환.
		
		System.out.println("세종대왕 점수 >> " + map.get("세종대왕"));
		System.out.println();
		
		// keySet() : map 데이터 중에서 key 들만 뽑아서 Set 객체로 반환시키는 메서드.
		for(String element : map.keySet()) {
			System.out.println(element + " 님의 점수 >> " + map.get(element) + "점");
		}
		System.out.println(map.toString());
		System.out.println();
		
		// 검색을 해 보자.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 위인의 이름을 입력하세요 : ");
		String searchName = sc.next();
		
		if(map.containsKey(searchName)) 
			System.out.println(searchName + " 님의 점수 >> " + map.get(searchName));
		else 
			System.out.println("검색할 위인이 없습니다.");
		
		sc.close();
	}
}
