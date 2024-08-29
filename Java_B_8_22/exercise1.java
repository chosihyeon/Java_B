package Java_B;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {

			//직사각형의 가로와 세로를 키보드로 하나씩 입력받아 넓이를 구하는 프로그램 
			 Scanner sc = new Scanner(System.in);
			 double a;
			 double b;
			 
			 
			 System.out.print("직사각형의 가로길이 :");
			 a= sc.nextDouble();
			 System.out.print("직사각형의 세로길이 :");
			 b= sc.nextDouble();
			
			 System.out.println("직사각형의 가로길이 :"+a);
			 System.out.println("직사각형의 세로길이 :"+b);
			 
			 double result = a * b;
			 
//			 double temp= Math.round(result/100);
			 
			 System.out.printf("직사각형의 넓이는 %.1fcm입니다.", result);
			 
		
		
	}

}
