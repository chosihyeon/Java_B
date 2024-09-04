package G830;

import java.util.Scanner;

public class Star4 {
	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      
	      for(int i = 0; i < a; i++) {
	         for(int space = 0; space < i ; space++ ) {
	            System.out.print(" ");
	         }
	         
	         for(int star = a; i < star; star--) {
	            System.out.print("*");
	         }System.out.println();
	      }

}
}
