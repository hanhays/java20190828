package chapter04;

public class Chapter04 {
	public static void main(String[] args) {
		// if��
		
		//if (/*���ǽ�*/) {
		//}
		
		if (true) {
			System.out.println("������ true");
		}
		
		if (false) {
			System.out.println("������ false");
		}
		
		int var1 = 3;
		
		if (var1 >= 3) {
			System.out.println("var1�� 3���� ũ�ų� ����.");
		}
		
		
		var1 = 2;
		if (var1 >= 3) {
			System.out.println("var1�� 3���� ũ�ų� ����.");
		} else {
			System.out.println("var1�� 3���� �۴�.");
		}
		
		
		if (var1 >= 3) {
			System.out.println("var1�� 3���� ũ�ų� ����.");
		} else if (var1 >= 0 ){
			System.out.println("var1�� 3���� �۰�");
			System.out.println("0���� ũ�ų� ����.");
		} else if (var1 >= -3 ){
			System.out.println("var1�� 0���� �۰�");
			System.out.println("-3���� ũ�ų� ����.");
		} else {
			System.out.println("-3���� �۴�.");
		}
		
		
		// switch case
		switch ("����") {
		case "����":
			System.out.println("������ �Դ�.");
			break;
		
		case "���":
			System.out.println("����� �Դ�.");
//			break;
			
		case "����":
			System.out.println("���⸦ �Դ�.");
			break;

		default:
			System.out.println("�ƹ��͵� ���Դ�.");
			break;
		}
		
		
		// for 
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i:" + i + " j:" +j);
			}
		}
		
		char[] array = {'��', '��', '��'};
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for (char i : array) {
			System.out.println(i);
		}
		
		// while 
		
		int i = 0;
		while(i < 5) {
			System.out.println(i);
			i++;
		}
		
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
		
		
		
		
		
		
		
		
		
	}
}
