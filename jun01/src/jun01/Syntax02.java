package jun01;

public class Syntax02 {
	

	public static void print() {
		System.out.println("프린트 메소드 입니다.");
	}

	public static void main(String[] args) {
		// 명령어 : 메소드 속에 들어가있어야 합니다.
		// 선언, 대입, 초기화, 명령
		String str = "메소드 속에서"; // 변수 str 지정
		str = "변경합니다."; // 변수 변경
		
		print(); //main으로 시작되서 끝난다.
		System.out.println(str); // 변수 출력
		
	}

}
