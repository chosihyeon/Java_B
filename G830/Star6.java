package G830;

import java.util.Scanner;

public class Star6 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
		
		for(int j = 0; j < i; j++) {
		System.out.print(" ");
		}
		for(int j = 0; j < 2*(a-i)-1; j++) {
		System.out.print("*");
		}
		System.out.println();
	}*/
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
		
		for(int j = 0; j < i; j++) {
		System.out.print(" ");
		}
		for(int j = 2*i ; j < 2*(a-1)+1; j++) {
		System.out.print("*");
		}
		System.out.println();
	}

}
}
