package G830;

import java.util.Scanner;

public class Star3 {
	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      
	      for(int i = 0; i <= a; i++) {
	         for(int space = a; i <= space ; space-- ) {
	            System.out.print(" ");
	         }
	         
	         for(int star = 0; star<i; star++) {
	            System.out.print("*");
	         }System.out.println();
}
}
}