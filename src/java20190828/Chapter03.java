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
		int intvar1 = 3;
		String str4 = str1 + intvar1;
		System.out.println(str4);
		str4 = str1 + 'A';
		System.out.println(str4);
		
		String str5 = "55";
		String str6 = "11";
//		String str7 = str5 * str6;
		
		// .. �� ������
		// ... == != > >= < <= 
		System.out.println(3 == 3);
		System.out.println(3 != 3);
		System.out.println(3 > 3);
		System.out.println(3 >= 3);
		
		// ... == �� ������ ������ Ÿ�Կ� ����� ��
		String strVar1 = "���缮";
		String strVar2 = "���缮";
		System.out.println(strVar1 == strVar2);
		
		String strVar3 = new String("���缮");
		String strVar4 = new String("���缮");
		System.out.println(strVar1);
		System.out.println(strVar3);
		System.out.println(strVar1 == strVar3);
		System.out.println(strVar3 == strVar4);
		System.out.println(strVar3.equals(strVar4));
		
		// .. �� ������
		// ... && ||
		System.out.println();
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println();
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		
		// .. ���Կ�����
		// ... = += -= *= /= %= 
		
		// . ���׿�����
		// .. ? :
		int intvalue10 = 3;
		int intvalue11 = true ? 10 : 0;
		System.out.println(intvalue11);
		int intvalue12 = (intvalue10 > 10) ? 10 : 0;
		System.out.println(intvalue12);
		
		
		int l = 3;
		int m = 5;
		int n = (l > m) ? l : m;
		
		

	}
}
