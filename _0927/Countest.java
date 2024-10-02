package _0927;

//추상 클래스(Abstract Class)
//추상 클래스는 abstract 키워드를 사용하여 선언되며,
//추상 메서드를 가질 수 있
//추상메서드는 인터페이스처럼 구현이 없는 메서드임
//추상메서드를 상속받는 클래스가 구현해야됨
//추상 클래스는 일반 메서드와 속성도 가질 수 있음

//public abstract class Animal{
//abstract void sound(); //추상메서드
//public void sleep(){
//System.out.println("Sleeping...");
//}

//추상 클래스 구현
//추상 클래스를 상속받는 클래스는 extends 키워드를 사용하며
//추상클래스의 추상메서드를 구현
//public class Dog extends Animal{
//@Override
//public void sound(){
//System.out.println("Bark");
//}
//}
//
abstract class Countable {
	abstract void count();
}

class Bird extends Countable {
	private String name;
	private int num;

	public Bird(String name, int num) {
		this.name = name;
		this.num = num;
	}

	@Override
	void count() {
		System.out.println(name + "가 " + num + "마리 있다.");
	}

	void fly() {
		System.out.println(name + "가 날아간다.");
	}

}

class Tree extends Countable {
	private String name;
	private int num;

	public Tree(String name, int num) {
		this.name = name;
		this.num = num;
	}

	@Override
	void count() {
		System.out.println(name + "가 " + num + "마리 있다.");
	}

	public void ripen() {
		System.out.println(name + "가 잘 익었다.");
	}
}

public class Countest {

	public static void main(String[] args) {
		Countable[] items= {
				 	new Bird("백구", 5),
		            new Bird("독수리", 2),
		            new Tree("사과나무", 10),
		            new Tree("밤나무", 7)
		
	};
	for(Countable item:items) {
		item.count();
		if(item instanceof Bird) {
			((Bird)item).fly();
		}else if (item instanceof Tree) {
			((Tree)item).ripen();
		}
	}

}
}
