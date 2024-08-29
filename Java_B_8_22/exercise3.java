package Java_B;

import java.util.Scanner;

//원의 반지름을 입력하세요(cm):5.0
//원의 넓이는 78.50cm입니다.

public class exercise3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("원의 반지름을 읿력하세요(cm):");
	
	double PI =3.14;
	double a= sc.nextDouble();
	double result = PI*a*a;
	
	System.out.printf("원의 넓이는 %.2fcm입니다.",result);
}
	
}
