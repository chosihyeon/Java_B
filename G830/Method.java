package G830;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		
		//메소드 선언 
		//선언부 접근제어자 리턴타입 메소드명(매개변수선언){
		//
		//return 반환값
		//}
		
		//protected:같은 패키지또는 자식 클래스에서 사용
		//private:외부에서 사용할 수 없음 클래스 내부에서만 사용가
		//default:같은 패키지에 소속된 클래스에서만 사용가능 
		
		
		//배열이란 선형 자료구조(Data Structure)중 하나로 동일한 타입의 연관된 데이터를 
		//메모리에 연속적으로 저장하여 하나의 변수에 묶어서 관리하기 위한 자료구조 
		
		//Array 클래스 (java.util.Arrays)
		//1차원 배열의 출력 Arrays.toString(int[]arr)
		//Arrays.sort(int[]arr)
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] numbers = new int[a];
		
		//배열의 요소 입력
		for(int i =0;i<a;i++) {
			numbers[i]=sc.nextInt();
		}
		
		Example example = new Example();
		example.getSum(numbers);
		example.getSum(numbers);
		example.getSum(numbers);
		example.getMax(numbers);
		
	}
	
		//static을 왜 붙여야됑.........진짜...ㅎ 같은거는 같은거끼리 짝짝
		//까마귀 고기먹어서 다시하는중... 
		//이유 main 메서드에서 인스턴스 없이 직접 호출
		
		//인스턴스 메서드-> 해당 객체의 상태(필드 값)를 참조하거나 수정가능 
		//인스턴스 메서드는 특정 객체에 속해 있으므로 해당 클래스의 인스턴스를 생성해야 호출 가
		//클래스 인스턴스 생성 
		//생성한 인스턴스를 사용하여 getSum메서드 호출 
	}

