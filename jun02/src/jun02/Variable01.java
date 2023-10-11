package jun02;

public class Variable01 {
	int num = 100; // 인스턴스 변수 = 클래스 아래 작성

	public static void main(String[] args) {

		int num = 100; // 지역변수 = 메소드 속에서 생성
		int num2, num3, num4, num5; // 선언만
		int num6 = 10, num7 = 11, num8 = 12; // 선언 + 값대입 (초기화)
		num = 10; // 활용할때는 병수명만 사용(int를 다시 쓰지 않음)
		num2 = 1;
		System.out.println(num2); // 초기화 x
		System.out.println(num6); // 초기화 ㅇ
		// 지역변수는 초기화 후 사용할 수 있습니다.
	}

}
