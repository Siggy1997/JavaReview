package jun02;

public class Test02 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 11;
		System.out.println(Integer.toBinaryString(-10)); //1010
		System.out.println(Integer.toBinaryString(11)); //1011
		System.out.println(Integer.toBinaryString(a&b));
		System.out.println(Integer.toBinaryString(a|b));
		System.out.println(Integer.toBinaryString(a^b));
		
		System.out.println(10&11); //1010
		//& 둘다 1이여야 1
		System.out.println(10|11); //1011
		// | 둘중 하나만 1이여도 1
		System.out.println(10^11); //0001
		// ^ 둘중 하나만 1이여만 1 (겹치지 않는 것만 1)
		
	}
}
