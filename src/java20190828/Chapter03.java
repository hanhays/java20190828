package java20190828;

public class Chapter03 {
	public static void main(String[] args) {

		// . ���׿�����
		// .. ��ȣ������
		// ... +, -
		
		int i = 3;
		int j = +3;
		int k = -3;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

		// .. ����������
		// ... ++, --
		
		int intvalue1 = 5;
		intvalue1++;
		System.out.println(intvalue1);
		
		int intvalue2 = intvalue1++;
		System.out.println(intvalue2);
		System.out.println(intvalue1);
		
		int intvalue3 = ++intvalue1;
		System.out.println(intvalue3);
		System.out.println(intvalue1);
		

		// .. �� ������
		// ... ! & |
		// ... !
		boolean bool1 = true;
		System.out.println(!bool1);
		System.out.println(bool1);

		// .. ��Ʈ ������
		// ... ~ & |
		
		// . ���� ������
		// .. ��� ������
		// ... + - * / %
		
		int intvalue4 = 15;
		int intvalue5 = 0;
		int intvalue6 = intvalue4 + intvalue5;
		System.out.println(intvalue6);
		
		int intvalue7 = intvalue4 - intvalue5;
		System.out.println(intvalue7);
		
		int intvalue8 = intvalue4 * intvalue5;
		System.out.println(intvalue8);
		
		if (intvalue5 != 0) {
			
			// 0���� ������ ���� ��Ÿ�ӿ���.
			int intvalue9 = intvalue4 / intvalue5;
			System.out.println(intvalue9);
			
		}
		
		short s = 3;
		short t = 4;
//		short u = s + t; //int�� ��ȯ �Ŀ� ����.
		
		double doublevar1 = 0.1;
		double doublevar2 = 0.2;
		double doublevar3 = (doublevar1 * 10 + doublevar2 * 10) / 10;
		System.out.println(doublevar3);
		
		double doublevar4 = 3.0;
		double doublevar5 = 0.0;
		
		double doublevar6 = doublevar4 / doublevar5;
		System.out.println(doublevar6);
		double doublevar7 = doublevar6 - 999999999999l;
		System.out.println(doublevar7);
		
		
		// .. ���ڿ�
		// ... +
		String str1 = "�̰���";
		String str2 = "�ڹٴ�";
		String str3 = str1 + str2;
		
		
		
		
		
		
	}
}




























