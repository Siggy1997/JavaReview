package jun02;

import java.util.Iterator;

// 연산자 = - / *
/*계산할 때 사용한는 기호들
 * 지금 배울 연산자는 다름 프로그래밍에서도 비슷하게 씁니다.
 * 주의해서 보셔야 할 것은 연산자의 연산 순서입니다.
 * 1)최우선 연산자
 *  . 클래스 또는 객체 소유의 변수 , 메소드 등을 호출
 *  [] 배열
 *  () 
 *  
 * 2)단항 연산자
 * 		!(논리부정) ~ (비트반전) = - / * (부호 연산) ++/ -- (선행증감)
 * 3)산술 연산자 + - / * %(모듈러: 나머지 값)
 * 4)쉬프트 연산자 <<, >>  , >>> (자리 이동)
 * 5)관계 연산자 <, >, <=, >=, ==, !=
 * 6)비트 연산자 &,|, ! 
 * 7)논리 연산자 &&,!,||
 * 8)삼항 연산자 조건식 ? 참일때 : 거짓일때;
 * 9)배정 대입 : = , +=, -=, %+, 등등
 * 10) ++/ -- (후행증감)
 */
public class Operator {
	public static void main(String[] args) {

		int num = 1;
		int num2 = ++num; //
		// 9 2
		System.out.println(num); // 2
		System.out.println(num2); // 2

		int num3 = ++num + ++num2;
		// 9 2 3 2
		System.out.println(num); // 3
		System.out.println(num2);// 3
		System.out.println(num3); // 6

		num3 = --num + ++num2;
		System.out.println(num); // 2
		System.out.println(num2); // 4
		System.out.println(num3); // 6

		num3 = num-- - num2--;
		System.out.println(num); // 1
		System.out.println(num2); // 3
		System.out.println(num3); // -2

		num3 = num-- + --num2;
		System.out.println(num); // 0
		System.out.println(num2); // 2
		System.out.println(num3); // 3

		System.out.println(2 / 2);
		System.out.println(3 / 2);
		System.out.println(4 / 2);

		System.out.println(2 % 2);
		System.out.println(2 % 3);
		System.out.println(4 % 2);

		// 당신의 성별은? 1,3은 남자 , 2,4는 여자
		int ssnCode = 1;
		int result = ssnCode % 2;
		if (result == 0) {
			System.out.println("당신은 여자입니다");
		} else {
			System.out.println("당신은 남자입니다");
		}
		
		System.out.println(1%2);
		System.out.println(2%2);
		System.out.println(3%2);
		System.out.println(4%2);
		System.out.println("쉬프트 연산자");
		int sh=3;
		System.out.println(Integer.toBinaryString(sh));
		System.out.println(Integer.toBinaryString(sh>>1));
	
		
		
	}
}
