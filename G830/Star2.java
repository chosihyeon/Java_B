package G830;

import java.util.Scanner;

public class Star2 {
	 public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         
         for (int i = 0; i <= a; i++) {
            for (int j = a; i < j; j--) {
               System.out.print("*");
            }
            System.out.println();
         }

      }

}
