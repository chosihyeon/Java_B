package G830;

import java.util.Scanner;

public class breakorMethod {

	public static void main(String[] args) {
		// 숫자를 입력 받아 짝수인지 홀수인지 판단하고 계속할 것인지 묻는다.
		// 0을 입력하면 멈추고 1이면 계속한다.

		/*int b = 0; // 반복을 제어할 숫자
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("숫자를 입력하세요");

			int a = sc.nextInt();
			if (a % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
			System.out.println("계속하시겠습니까?(계속하려면 1, 중지하려면 0을 입력하세요):");
			b = sc.nextInt();
		} while (b == 1);
		System.out.println("프로그램이 종료되었습니다.");
		sc.close();*/
		

	// 학생 수와 각 학생의 점수를 입력 받아서 배열에 저장하고 합계와 평균을 출력
	int numStudent = getNumberkeyboard("학생수:");
	int[]scores = getScoresLine(numStudent);
	printSumAverage(scores);
	
	
	
	
	
	}

	private static void printSumAverage(int[] scores) {
		int sum = 0;
		/*while(scores > 0) {
			int average= getScoresLine(numStudent)/numStudent나중에 해보자^^*/
		for(int score: scores) {
			sum += score;
		}//부할 ^^ 배열의 부활 
		double average = (double)sum/scores.length;
		System.out.println("합계:"+sum);
		System.out.println("평균:"+average);
		}
		

	private static int[] getScoresLine(int numStudent) {

		/*while(numStudent >= 0) {배열은 정수와 비교 불가능ㅎ*/
			Scanner sc = new Scanner(System.in);
			int [] Scores = new int[numStudent];
			for(int i = 0;i<numStudent;i++) {
				Scores[i]=sc.nextInt();
			}
			return Scores;
		}

	private static int getNumberkeyboard(String message) {
		System.out.println(message);//요거를 생각못했네  ^^ㅎ
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		return score;
	}
	
	private static int getNumberkeyboard() {
		/*private static int getNumberkeyboard(int studentnumber)
		 * 매우 하나게 이렇게 해서 안된거였음.... ^^^^^*/
		System.out.println("성적을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		return score;
	}
}
