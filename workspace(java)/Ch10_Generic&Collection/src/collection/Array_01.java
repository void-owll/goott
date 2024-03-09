package collection;

public class Array_01 {
	
	public static void main(String[] args) {
		// 크기가 7인 문자열 배열을 생성하여 초기값을 할당해 보자.
		String[] str = {"가", "나", "다", "라", "마", "바", "사"};
		
		// 만약에 배열 생성 후에 "다", "바"의 데이터가 필요가 없어졌다고 가정을 해 보자.
		// 배열은 한 번 크기가 정해지면 추가나 삭제가 안 된다.
		// 따라서 아래와 같이 해당 인덱스에는 null 값을 입력하는 것 말고는 대안이 없다.
		str[2] = null;
		str[5] = null;
		
		for(String element : str) {
			System.out.println("요소 >> " + element);
			
		}
		
		
	}	
}
