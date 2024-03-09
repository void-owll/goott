import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int sum = 0;
		
		
		while (count >= 1) {
			sum += count;
			count--;
		}
		
		sc.close();
		System.out.println(sum);
	}
}
