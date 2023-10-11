package jun02;

public class Hello {
	public static void main(String[] args) {
		int number; // 변수 선언
		number = 100; // 변수에 값 대입
		// = 대입한다. == 같다
		int num = 101; // 변수 선언 + 값대입 == 변수 초기화
		// 리터럴 = 고정된값

		double num1 = 1.009;
		int num3 = num;
		num1 = 3.333;
		num3 = (int) 3.333; // 현변환 = 데이터 타입 변환
		//cast
		System.out.println(num3); //3.333이 int타입으로 바뀌어서 3이 출력
		
		double iNumber = 14;
		double dNumber = iNumber; //자동 대입 = 프로모션
		//왼쪽변이 더 큰 타입이라 int가 자동 대입됩니다
		System.out.println(dNumber);

	}

}
