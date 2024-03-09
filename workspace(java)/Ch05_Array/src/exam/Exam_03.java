package exam;

import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요 : ");
		int i = sc.nextInt(); 	// 이렇게 선언하지 않고, name에 nextInt를 받은 뒤에
								// 나머지 배열 길이에 name.length를 사용해도 됨
								// 근데 이 방식이 그렇게 좋은지는 잘 모르겠음.. 
								// 좀 아닌듯함(너무 번거롭고, 
								// 꼬꼬무 의존성이 생겨버림)
		String[] name = new String[i];
		int[] kor = new int[i];
		int[] eng = new int[i];
		int[] math = new int[i];
		int[] sum = new int[i];
		double[] average = new double[i];
		String[] rating = new String[i];
		int[] rank = new int[i];
		
		for( int x=0 ; x < i ; x++) {
			//데이터 입력받기
			System.out.print("이름 입력 : ");
			name[x] = sc.next();
			System.out.print("국어점수 입력 : ");
			kor[x] = sc.nextInt();
			System.out.print("영어점수 입력 : ");
			eng[x] = sc.nextInt();
			System.out.print("수학점수 입력 : ");
			math[x] = sc.nextInt();
			//합계 구하기
			sum[x] = kor[x] + eng[x] + math[x];
			//평균 구하기
			average[x] = sum[x]/3.0;
			
			//학점 구하기
			if ( average[x] >= 90) {
				rating[x] = "A학점";
			}else if ( average[x] >= 80) {
				rating[x] = "B학점";
			}else if ( average[x] >= 70) {
				rating[x] = "C학점";
			}else if ( average[x] >= 60) {
				rating[x] = "D학점";
			}else{
				rating[x] = "F학점";
			}

		}
		//순위 구하기
		for (int x=0 ; x<i ; x++) {
			rank[x] += 1;
			for (int y=0; y<i ; y++) {
				if(average[x] < average[y]) {
					rank[x] += 1;
				}
			}
		}
		/*
		//이하 방법은 "배열을 하나 복사해서(값까지) 정렬한 다음
		//정렬한 값이 몇 번째에 있는지 찾는 로직(순위 구하기)
		//너무 복잡해서 위의 알고리즘으로 대체
		double[] averageCopy = new double[i];
		
		for(int x=0 ; x<i ; x++) {
			averageCopy[x] = average[x];
		}
		
		for(int x=0 ; x<i ; x++) {
			for(int y=x+1 ; y<i ; y++) {
				if(averageCopy[x] < averageCopy[y]) {
					double temp = averageCopy[x];
					averageCopy[x] = averageCopy[y];
					averageCopy[y] = temp;
				}
			}
		}
		for(double element : averageCopy) {
			System.out.println("averageCopy >>> "+ element);
		}
		
		for(int x=0 ; x < i ; x++) {
			for(int y=0; y < i ; y++ ) {
				if(average[x] == averageCopy[y]) {
					rank[x] = y+1;
				}
			}
		}
		for(int x= 0 ; x < 3 ; x++) {
			System.out.println(" for문 바깥 rank[x]>>" + rank[x]);
		}
			
		*/
		for(int x=0 ; x<i ; x++) {
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.printf("이름 : %s\t총점 : %d\t평균 : %.2f\t학점 : %s\t순위 : %d\n",
					name[x],sum[x],average[x],rating[x],rank[x]);
		}
		sc.close();
	}
}
