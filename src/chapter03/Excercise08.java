package chapter03;

public class Excercise08 {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
//		System.out.println(z);
		
		if (z == Double.NaN) {
			System.out.println("0.0���� ���� �� �����ϴ�.");
		} else {
			double result = z + 10;
			System.out.println("���: " + result);
		}
	}
}
