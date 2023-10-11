package jun05;

//연산자 : 계산에 사용되는 기호
/*
 1.최우선    .(점) [](배열)  ()(괄호)
 2.단항     !(반전)  ~(비트 반전) ex)0101 -> 1010  =/-(부호 연산)  ++/--(선행증감)
 3.산술     +     -    /    *    %(모듈러)
 4.쉬프트    <<    >>   >>> (2진법)
 5.관계     >    <    >=    <=    ==    !=
 6.비트     &(and)   |(or)   ^(xor)
 7.논리     &&(and)     ||(or)
 8.삼항     조건식 ?    참일때 :    거짓일떄 ; 
 			//check = number == 1? true : false;
 9.대입     =   +=   -=   /=   %= ...etc.
 10.후행증감  ++/-- ex) i++
 */
public class Operator {
	public static void main(String[] args) {
		// number 에다가 1이라고 저장해주세요 int type
		int number = 1;
		int num2 = --number + 10;
		// 9 2 3
		int num3 = ++number + --num2;
		System.out.println(number); // 1
		System.out.println(num2); // 9
		System.out.println(num3); // 10

		number = num2 = num3 = 0;
		number = num2-- + num3++;

		System.out.println(number); // 0
		System.out.println(num2); // -1
		System.out.println(num3); // 1

		boolean check = false;
		check = 1 + 2 == 4;
		System.out.println(check);

		check = number == num2;

		number = 40;
		number = number >> 2;
		System.out.println(number);
		// 2 8 16 진법 입력하기
		// 10 0~10
		// 2 0~1
		// 16진법 0~9 10=A 11=B 12=C 13=D 14=E 15=F 16=10 .... 32=20
		System.out.println(Integer.toBinaryString(7));// 2진번
		System.out.println(Integer.toOctalString(8)); // 8진법
		System.out.println(Integer.toHexString(11)); // 16진법
		// 입력
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		num2 = 0B1010; // 2진법 0B 바이너리 입력
		System.out.println(num2);
		num2 = 020; // 0을입력하면 8진법 입력
		System.out.println(num2);
		num2 = 0X15; // 16진법 0X
		System.out.println(num2);


		// 비트 반전
		System.out.println(Integer.toBinaryString(~1));
		System.out.println(Integer.toBinaryString(~-1));

		number = num2 = num3 = 0;
		number = 8; // 1000
		num2 = 7; // 0111
		int num4 = 3;// 0011
		num3 = number & num2 & num4; // 둘다 1 일때 1
		System.out.println(num3);
		//

		num3 = number | num2; // 하나라도 1이 있으면 1
		System.out.println(num3);
		// 1111
		num3 = number ^ num2 ^ num4;
		// 1111
		// 1100
		// 10

		// 3개 이상일 경우 앞에서 부터 2개씩

		System.out.println(num3); // 하나만 1이여야 1
		System.out.println(num4);

		// 논리 연산자 (true or false)
		// 왼쪽 && 오른쪽 = 둘다 참일떄 참
		System.out.println(1 + 2 == 4 && 1 + 3 == 4);

		// 왼쪽 || 오른쪽 = 둘 중 하나만 참이면 참입니다
		System.out.println(1 + 2 == 4 || 1 + 3 == 4);
		/*
		 * if (조건식) { 참일때 실행할 명령어;
		 * 
		 * } else { 조건이 거짓일때 실행할 명령어; } 조건식? 참일때 : 거짓;
		 */

		number = 1;
		System.out.println(number == 1 ? "1입니다" : "2입니다");

		check = number == 1 ? true : false;
		System.out.println(check);
		if (number == 1) {
			System.out.println("1입니다");
		} else {
			System.out.println("2입니다");
		}
		
		check = false;
		number = 1;
		check = number >1 || true ? true : false;
		System.out.println(check);
		

	}
}
