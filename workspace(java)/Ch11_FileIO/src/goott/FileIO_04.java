package goott;

public class FileIO_04 {
	public static void main(String[] args) {
		System.out.println("한 줄을 입력하세요.....");
			try {
				while(true) {
					int num = System.in.read();
					if(num == '\n') break;			// Enter 키
					System.out.print((char)(num));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
