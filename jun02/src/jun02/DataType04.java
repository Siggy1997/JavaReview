package jun02;
//문자형, 논리형
/*
 * 문자형 : 한글자만 저장합니다.
 * 문자 하나를 저장하기 위한 타입
 * 반드시 값으로는 문자 하나만 존재해야 하며
 * 하나 이상일 경우엔 String(문자열)에 저장합니다.
 * char 타입은 정수 타입입니다
 * 크기는 음수가 없는 2byte의 범위를 가집니다 (0~65,535)
 * 문자값을 표현할 때에는 반드시 홀따움표를 이용
 * 정수 타입이기 때문에 int에 프로모션 됩니다
 * int값 또한 문자로 변경될 수 있습니다. (cast)
 */
public class DataType04 {
	public static void main(String[] args) {
		char ch = '가'; //문자열 " " , 캐릭터' '
		ch = 'A';
		ch = ' ';
		ch = '\ub095'; //유니코드 표기, 아시키코드
		String str = ch + "";
		System.out.println(str);
		str = "안녕하세요";
		ch = str.charAt(4);
		System.out.println(ch);
		
		ch = '9';
		System.out.println(ch);
		int num = 33;
		ch = (char) num;
		System.out.println((char)num);
		System.out.println(ch);
		ch= 57;
		
		System.out.println(ch);
		System.out.println(ch+13);
		
		for (int i =65; i<91; i++) {
			System.out.println(ch);
		}
	}
}
