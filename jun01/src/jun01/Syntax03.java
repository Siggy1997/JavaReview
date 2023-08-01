package jun01;

class Apple{
	public static void main(String[] args) {
		System.out.println("애플 클래스 속 메인 메소드");
	}
}
// 파일이름이 Syntax03이라서 Apple 클래스는 시작 안함

public class Syntax03 {
	public static void main(String[] args) {
		System.out.println("출력문");
		add(10,20);
	}

	static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
}
 // 한줄 주석
 /*
 * 단락 주석 : 여러 줄 주석
 * 여러줄을 쓸 수 있습니다
*/

/** 이건 문서 주석입니다 */


/*
1. 이클립스 설치해보기
2. 이클립스 설치해보기
3. 외우기
4. 책 읽기
*/