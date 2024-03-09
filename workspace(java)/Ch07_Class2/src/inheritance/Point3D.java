package inheritance;

/*
 * 1. super() 키워드
 *    - 자식클래스에서 부모클래스의 생성자를 호출하는 명령어.
 *      형식)  super(인자);		// 인자는 생략 가능
 * 2. this() 키워드
 *    - 자식클래스에서 현재 클래스 안에 있는 다른 생성자를 호출하는 명령어.
 *      형식)  this(인자);		// 인자는 생략 가능
 *      
 * 주의) this() 키워드를 사용 시에는 반드시 생성자 첫 문장에 와야 함.
 * 
 */
public class Point3D extends Point {
	int z;
	public Point3D() {	} 		// 부모 클래스의 기본 생성자 호출
	public Point3D(int x, int y) { 
		super(x, y);					// 부모 클래스의 인자 생성자 호출
		//this.x = x ;
		//this.y = y;
	} 		
	public Point3D(int x, int y, int z) { // 생성자 오버로딩
		this(x, y); 					// 현재 클래스의 인자 2개짜리 생성자 호출
		this.z = z;
	} 		
	
	void output() {
		System.out.println("x 좌표 >>> " + x);
		System.out.println("y 좌표 >>> " + y);
		System.out.println("z 좌표 >>> " + z);
	}
	
}
