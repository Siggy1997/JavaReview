package jun02;

public class DataType02 {
	// 파일명과 동일한 클래스 앞에 public을 붙여줍니다.
	// 접근제어자
	public static void main(String[] args) {
		byte bNumber = (byte) 128;
		System.out.println(bNumber);
		short sNum = (short) (32767 + 1);
		int iNum;
		iNum = Integer.MAX_VALUE;
		System.out.println(iNum);
		
		iNum = Integer.MIN_VALUE;
		System.out.println(iNum);
		
		long lNum = 9223372036854775800L; //질문
		long loNum = 9223372036854775800L;
		System.out.println(lNum);
		long a = (long)124;
		long b = 124L;
		
		
		
		long Num = Long.MIN_VALUE;
		System.out.println(iNum);
		
		float fNum = 3.14F; //표식자
		double dNum = fNum;
		
		iNum = (int)fNum; //정수보다 실수를 더 큰수로 인지 합니다
		lNum = (long) fNum;
		//크기 순서 : byte < short < int < long < float < double

		float apple = 5;
		float pear = 7;
		float orange = 5;
		System.out.println((apple + pear + orange)/24);
	}
}
