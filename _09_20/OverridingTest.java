package _09_20;

//protected 맴버변수 private 

//자식의 상속이 안됨  상속만 되게 

class Circle {

	protected static final double PI = 3.14;
	protected double radius = 0;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return PI * radius * radius;

	}

	public Circle() {
		// 상속받기위한 틀
	}

}

class Ball extends Circle {

	public Ball(double radius) {
		super(radius);
	}

	public Ball(int radius) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return 4 * PI * radius * radius;

	}
}

	class Cylinder extends Circle {

		private double height;

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {

			this.height = height;
		}

		public Cylinder(double radius, double height) {
			this.radius = radius;//부모 생성자 호출 없이 직접 필드 설정 
			this.height = height;
		}

		@Override
		public double getArea() {
			return (2 * PI * radius) * (radius + height);
		}

	}

	/*
	 * public Ball(double radius) { super(radius); //super(radius)-> 부모 클래스 호출
	 * 
	 * }
	 */


public class OverridingTest {
	public static void main(String[] args) {

		Circle circle = new Circle(5.0);
		System.out.println(">>> 원:");
		System.out.println("반지름:" + circle.getRadius());
		System.out.println("면적 :" + circle.getArea());

		Ball ball = new Ball(5.0);
		System.out.println("\n>>> 공 :");
		System.out.println("반지름:" + ball.getRadius());
		System.out.println("면적 :" + ball.getArea());

		Cylinder cyl = new Cylinder(5.0, 7.0);
		System.out.println("\n>>> 공 :");
		System.out.println("반지름:" + cyl.getRadius());
		System.out.println("높이:" + cyl.getRadius());
		System.out.println("면적 :" + cyl.getArea());
	}

}
