package CatDailylife;

class Cat{
	String breed;
	String color;
	int age;
	//필드 선언후 아래에다 넣는 것이 일반적임. 
	Cat(String breed,String color, int age) {
		this.breed= breed;
		this.color=color;
		this.age= age;
	};
	Cat(String breed,String color) {
		this.breed= breed;
		this.color=color;
	};
	Cat(String color) {
		this.color=color;
		System.out.println("나의 고양이는 "+color+" 코숏입니다." );
	};
	void eat(String time) {
	System.out.printf("%s에 사료를 먹습니다.\n",time);
	}
	void meow() {
		System.out.println("야옹~~~~");
	}
	void scratch() {
		System.out.println("스크래치를 긁습니다.");
	}
}
	



public class CatTest {

	public static void main(String[] args) {
		Cat a = new Cat("노랑");
		a.eat("낮");
		a.meow();
		System.out.println();
		a.eat("점심");
		a.scratch();
		a.meow();

	}

}
