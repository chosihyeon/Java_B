package Java_B;

import java.util.Scanner;

public class exercise2 {
	public static void main(String[] args) {
		int a = 0;
		while (a > 0) {
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			if (a % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}

		}
	}
}
