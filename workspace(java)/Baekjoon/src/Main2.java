import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.Scanner;
/*체스판*/
public class Main2  {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int paperX = sc.nextInt();
		int paperY = sc.nextInt();
		char[][] chessBoard = new char[paperX][paperY];
		for(int i=0; i<paperY;i++) {
			String inputString = sc.next();
			chessBoard[i] = inputString.toCharArray();
			System.out.println(chessBoard[i]);
		}
		// 여기까지 입력부
		int minChanged = 1048576;
		// 여기부터 검색부
		boolean tick = false; // false면 w
		for(int i=0; i<paperX-8;i++) {
			for(int j=0; j<paperY-8;j++) {
				
				int count = 0;
				
				for(int k=i; k<i+8; k++) {
					for(int l=j; l<j+8; l=l+2) {
						//첫글자를 W로
						if(tick == false) {
							if(chessBoard[k][l] == 'w') {
								continue;
							} else {
								count++;
							}
						}
					}
					
					for(int l=j+1; l<j+8; l=l+2) {
						//첫글자를 B로
					}
				}
			}
		}
		
		
		
	}
}
