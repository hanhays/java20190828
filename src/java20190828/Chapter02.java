package java20190828;

public class Chapter02 {
	public static void main(String[] args) {
		// ���� ����
		// type name;

		// ������: $ _ ������ҹ��� ����(�ǾպҰ�)
		// lowerī�����̽��� �ۼ� ex) firstName, homeAddress

		int name;
		name = 345;
		int name2 = 678;
		int name3 = 678 + 789;

		System.out.println(name);

		// Ÿ��
		// 1. �⺻������ Ÿ��
		// �� 8��
		// ������ 6��
		// ������ 4�� byte(1), short(2), int(4), long(8)
		// �Ǽ��� 2�� float, double
		// ������ 1�� char(2)
		// ���� 1�� boolean
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

		// float: 4byte�� ǥ��
		float floatVar;
		floatVar = 3.14F;
		System.out.println(floatVar);

		// double: 8byte�� ǥ��
		double doubleVar;
		doubleVar = 3.14;
		System.out.println(doubleVar);

		// char: 2byte�� ǥ��
		char charVar;
		char charVar2;
		char charVar3;
		char charVar4;
		char charVar5;
		charVar = '��';
		charVar2 = '��';
		charVar3 = 'J';
		charVar4 = 65;
		charVar5 = '\uac00';
		System.out.print(charVar);
		System.out.println(charVar2);
		System.out.println(charVar3);
		System.out.println(charVar4);
		System.out.println(charVar5);

		// boolean
		boolean booleanVar;
		booleanVar = true;
		booleanVar = false;
		System.out.println(booleanVar);

		// * Ÿ�Ժ�ȯ
		int intVar1 = 129;
		byte byteVar1;
		byteVar1 = (byte) intVar1; // ���� ����ȯ (type conversion)
		System.out.println(byteVar1);

		int intVar2 = 125;
		byte byteVar2;
		byteVar2 = (byte) intVar2; // ���� ����ȯ (type conversion)
		System.out.println(byteVar2);

		byte byteVar3 = 125;
		int intVar3 = byteVar3;
		System.out.println(intVar3);
		
		
		// *������ ��� ���� (scope)
		int intVar9;
//		System.out.println(intVar9);

		intVar9 = 30;
		if (intVar9 > 10) {
			int intVar10 = 5;
			
			if (intVar10 > 3) {
				System.out.println(intVar10);
			}
			
			intVar9 = 9;
		}
		System.out.println(intVar9);
//		System.out.println(intVar10);

	}
}






