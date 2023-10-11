package jun05;

public class Test01 {

	public static void main(String[] args) {

		// 컴파일 <-> 스크립트
		// 소스코드 (.java) -> 컴파일-> .class

		byte member = 25; // -128 ~ 0 ~ 127
		member = 100;
		
		int num = 1000;
		num = member;
		num += 1;    //num = num+1; num = num++; num = ++num;
		num -= 1;
		num %= 2; //모듈러 : 나머지값
		
		System.out.println(num);
		int num2;
		num2 = 0X15; // 16진법 0X

		System.out.println(num2);
		System.out.println(Integer.toBinaryString(~1));
		System.out.println(1 + 2 == 4 || 1 + 3 == 4);

	}
}
