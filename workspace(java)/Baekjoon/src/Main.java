import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int number = Integer.parseInt(br.readLine());
		
		Integer[] numberArr = new Integer[number];
		
		for(int i=0; i<numberArr.length; i++){
			numberArr[i] = Integer.parseInt(br.readLine());			
		}
		
		Arrays.sort(numberArr);
		
		for(Integer element: numberArr) {
		
			bw.write(String.valueOf(element));
			bw.newLine();

		}
		bw.flush();
		bw.close();
		
		br.close();
		
	}
}
