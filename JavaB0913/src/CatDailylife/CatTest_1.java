package CatDailylife;

class Cat_1{
	private String breed;
	private String color;
	private int age;
	
	public String getBreed(){
		return breed;
		
	}
	public String getColor(){
		return color;
		
	}
	public int getAge(){
		return age;
		
	}
	//필드 선언후 아래에다 넣는 것이 일반적임. 
	Cat_1(String breed,String color, int age) {
		this.breed= breed;
		this.color=color;
		this.age= age;
	};
	Cat_1(String breed,String color) {
		this.breed= breed;
		this.color=color;
	};
	Cat_1(String color) {
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







public class CatTest_1 {

	public static void main(String[] args) {
		Cat_1 a = new Cat_1("노랑");
		a.eat("낮");
		a.meow();
		System.out.println();
		a.eat("점심");
		a.scratch();
		a.meow();

	}

}
