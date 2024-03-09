package exam;

public class Exam_02_05 {
	public static void main(String[] args) {
		int i = 1;
		int hap = 0;
		while (i <= 100) {
			if(i % 2 == 0)	hap -= i;
			else hap+= i;
			i++;
		}
		System.out.println("hap ==> " + hap);
	}
}
