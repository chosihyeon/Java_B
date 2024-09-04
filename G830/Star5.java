package G830;

import java.util.Scanner;

public class Star5 {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      
	      for(int i = 0; i <= a; i++) {
	         for(int space = a; i <= space ; space-- ) {
	            System.out.print(" ");
	         }
	         
	         for(int star = 0; star<(2*i)+1; star++) {
	            System.out.print("*");
	         }System.out.println();
	      }   
	   }

}
