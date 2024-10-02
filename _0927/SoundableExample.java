package _0927;

public class SoundableExample {
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

		//printSound(new Dog())의 의미
		//new Dog()는 Dog 클래스의 인스턴스를 생성
		//이 인스턴스는 printSound() 메서드로 전달 
		//new Dog()는 Dog 클래스의 새로운 객체를 생성하고, 그 객체를 printSound() 메서드에 인자로 전달
	}

}
