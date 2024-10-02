package _0927;

public class _1 {

	// 인터페이스 정의
	// public interface Animal{
	// void sound(); // 추상 메서드 (구현 없음)
	// }

	// 인터페이스 정의
	public interface Countable {
		// void count();
		void count();
	}

	public static class Bird implements Countable {

		private String name;
		private int num;

		public Bird(String name, int num) {
			this.name = name;
			this.num = num;
		}

		@Override
		public void count() {
			System.out.println(name + "가" + num + "마리 있다.");
		}

		public void fly() {
			System.out.println(num + "마리" + name + "가 날아간다.");
		}
	}

	public static class Tree implements Countable {

		private String name;
		private int num;

		public Tree(String name, int num) {
			this.name = name;
			this.num = num;
		}

		@Override
		public void count() {
			System.out.println(name + "가" + num + "마리 있다.");
		}

		public void ripen() {
			System.out.println(num + "그루" + name + "나무에 열매가 잘 익었다.");
		}
	}




public static class Countest {

	public static void main(String[] args) {
		Countable[] items = {
				new Bird("뻐꾸기",5),
				new Bird("독수리",2),
				new Tree("사과나무",10),
				new Tree("밤나무",5),
		};
		
		for(Countable item : items) {
			
			item.count(); //item은 countable 인터페이스를 구현 객체 bird 또는 tree
			//각각의 item(Bird 또는 Tree)의 count() 메서드가 호출
			if (item instanceof Bird) {
				((Bird)item).fly();
			}else if (item instanceof Tree) {
				((Tree)item).ripen();
			}
			
		}
		
	//인터페이스(interface) 
	//인터페이스는 메서드의 선언만 포함, 메서드의 구현은 인터페이스를 구현하는 클래스에서
	//해야한다. 
	//interface 키워드를 사용하여 인터페이스를 정의함 
	//인터페이스를 구현하는 클래스는 implements 키워드를 사용합니다. 
	//구현하는 클래스는 인터페이스에서 선언된 모든 메서드를 반드시 구현해야 합니다.
		
	//public class Dog implements Animal{
	//@Override
	//public void sound(){
	//	System.out.println("BARK");
	//}
	//}
		
	
	}
}

}
//No enclosing instance of type _1 is accessible. Must qualify the allocation with an enclosing instance of type _1 (e.g. x.new 
//A() where x is an instance of _1).
//비정적 내부 클래스(Non-static inner class)**는 자바에서 외부 클래스의 인스턴스와 연관된 내부 클래스를 말합니다.
//독립적이지 않음 

//instanceof는 자바에서 객체가 특정 클래스나 인터페이스의 인스턴스인지 확인하는 연산자입니다. 
//자바 프로그램이 실행되는 동안(런타임 시) 객체가 어떤 클래스
//또는 인터페이스에 속하는지를 확인할 수 있도록 도와줍니다. 이를 통해 안전한 타입 검사 및 다운캐스팅을 할 수 있습니다.

//if (object instanceof ClassName) {
    // object는 ClassName 타입 또는 그 자식 클래스의 인스턴스일 때만 true
//}



//Multiple markers at this line syntax 에러 
//
//- Syntax error, insert "Identifier (" to complete 
//MethodHeaderName
//	
//- Syntax error, insert ")" to complete MethodDeclaration
//	
//- Syntax error, insert ";" to complete MethodDeclaration




