package Circle;

import java.util.Scanner;

class Circle{

	//class Circle 선언 
	//정적 상수: 원주율
	
	public static final double PI = 3.14;
	
	//변수: 반지름 
	private double radius;
	
	//생성자: 반지름 초기화
	public Circle(double radius){
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

	
	
public class CircleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름 입력");
		double radius = sc.nextDouble();
		Circle a = new Circle(radius);
		System.out.printf("원의 반지름:%.1f\n",a.getRadius());
		//Circle.getRadius()->정적메서드 a.getRadius 인스턴스메서드
		//객체마다 개별적으로 존재 객체를 생성한 후 그객체를 통해서만 호출 가능 
		System.out.printf("반지름이 %.1f인 원의 넓이는 %.2f입니다.\n",a.getRadius(),a.calculateArea());
	}

}
