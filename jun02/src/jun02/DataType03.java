package jun02;

public class DataType03 {
	public static void main(String[] args) {
		int apple, pear, orange, total;
		float avg;
		apple = 5;
		pear = 7;
		orange = 5;
		total = apple + pear + orange;
		avg = (float)(total/24.0);
		System.out.println((float)(total / 24.0)); //int
		System.out.println("총생산 객수 : " + total);
		System.out.println("시간당 생산 갯수 : "+ avg);
	}
}
