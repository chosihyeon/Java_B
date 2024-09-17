package Circle;

import java.util.Scanner;



	class Circle_1{

		//class Circle 선언 
		//정적 상수: 원주율
		
		public static final double PI = 3.14;
		
		//변수: 반지름 
		private double radius;
		
		//생성자: 반지름 초기화
		public Circle_1(double radius){
			this.radius = radius;
		}
		
		//메서드 넓이 구하기
		public double calculateArea() {
			return PI*radius*radius;
			
		}
		public double getRadius() {
			return radius;
		}
		
	}

		
		
	public class CircleTest_1 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("원의 반지름:");
			double radius = sc.nextDouble();
			Circle_1 a = new Circle_1(radius);
			//Circle_1 a = new Circle_1(a.getRadius());->호출하고 나서 생성이 가능해서 이렇게는 못함ㅎ
			System.out.printf("반지름이 %.1f인 원의 넓이는 %.2f입니다.\n",a.getRadius(),a.calculateArea());
		}

	}