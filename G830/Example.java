package G830;

import java.util.Arrays;

public class Example {
//이제 틀을 만들어볼까나~
	public Example() {
		//생성자 내부의 초기코드 
		//그대유지 필요시 생성자 내부에 초기화 코드나 다른 작업을 추가가능
		//클래스의 인스턴스를 만들때 특별한 초기화 작업을 하지 않고 객체를 생성하는 생성자 
		//기본 생성자는 매개변수가 없음 클래스에 다른 생성자가 정의되어 있지 않으면 컴파일러 자동 생성 
	}
	//배열 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
	
			//정수형 배열 저장된 모든 더하여 반환
			//Parameter:정수형 배열,매서드 getSum
			
			//정수형 배열에 저장된 숫자 중 가장 큰 숫자 출력 
			//Parameter:정수형 배열,메서드 getMax
			
			//배열에 저장된 숫자중 입력된 숫자보다 큰수가 몇개 있는지 구하기
			//Parameter:정수형 배열,기준 숫자 
			//메서드 getSum
			
			//배열에 저장된 숫자를 역순으로 저장하여 출력 
			//Parameter:정수형 배열,기준 숫자 
			//매서드 getSum
	
	public int getSum(int[] numbers) {
		int sum =0;
		for(int number :numbers) {
			sum += number;
		}
		
		return sum;
	}
	
	public int getMax(int[] numbers) {
		int max = 0;
		for(int i = 0; i<numbers.length;i++) {
			if(numbers[i] > max) {
				max= numbers[i];
			}
		}
		
		return max;
	}
	
	public int[] getSum(int[] numbers,int a,int b) {
		while(a<b) {
		int temp = numbers[a];
		numbers[a] =numbers[b];
		numbers[b]=temp;
		
		a++;//이거 안되서 애먹음 ^^ ㅠㅠㅠㅠㅠ
		b--;
		//역순 
	}return numbers;
	}
	
	public int getSum(int[] numbers,int b) {
		int count = 0;//기준 숫자보다 큰 수의 개수를 저장할 변수 
		for(int number:numbers) {
			if(number>b) {
				count++;
			}
		}return count;
	}
	public static void main(String[] args) {
        Example example = new Example();
        int[] numbers = {3, 5, 7, 2, 8}; // 예시 배열

        // 1. 배열의 합을 출력
        int sum = example.getSum(numbers);
        System.out.println("배열의 합: " + sum);

        // 2. 배열의 최댓값을 출력
        int max = example.getMax(numbers);
        System.out.println("배열의 최댓값: " + max);

        // 3. 역순 출력 
        int[] reverseNumbers = example.getSum(numbers, 0, numbers.length-1);
        System.out.println("요소 교환 후 배열: " + Arrays.toString(reverseNumbers));
        //후 이거는 너무^^ 아닌것같네요^^ 뭔가 끼어맞춘 느낌 ㅋㅋ
        // 4. 기준 숫자보다 큰 수의 개수를 출력
        int countGreater = example.getSum(numbers, 5);
        System.out.println("기준 숫자보다 큰 수의 개수: " + countGreater);
    }
}	
