package java20190828;

public class Chapter02 {
	public static void main(String[] args) {
		//���� ����
		// type name;
		
		// ������: $ _ ������ҹ��� ����(�ǾպҰ�)
		// lowerī�����̽��� �ۼ� ex) firstName, homeAddress
		
		int name;
		name = 345;
		System.out.println(name);
		
		
		
		// Ÿ�� 
		// 1. �⺻������ Ÿ��
		//    �� 8��
		//    ������ 6��
		//      ������ 4�� byte(1), short(2), int(4), long(8)
		//      �Ǽ��� 2�� float, double
		//    ������ 1�� char
		//    ���� 1�� boolean
		//
		// 2. ������������ Ÿ��
		
		
		// byte: 1byte�� ���� ǥ��
		// -128 ~ 127
		
		byte byteVar;
		byteVar = 120;
//		byteVar = 250;
		System.out.println(byteVar);
		
		// short: 2byte�� ǥ��
		// -32768 ~ 32767
		short shortVar;
		shortVar = 32767;
		System.out.println(shortVar);
		
		// int: 4byte�� ǥ��
		// -2147483648 ~ 2147483647
		int intVar;
		intVar = 2147483647;
		System.out.println(intVar);
		
		// long: 8byte�� ǥ��
		// -9223372036854775808 ~ 9223372036854775807
		long longVar;
		longVar = 9223372036854775807L;
		System.out.println(longVar);
		
		
		
		
		
		
		
		
	}
}
