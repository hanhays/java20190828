package chapter18;

import java.io.InputStream;

public class SystemInExample1 {
	public static void main(String[] args) throws Exception {
		
		InputStream is = System.in;
		
		int inputChar =  is.read();
		
		System.out.println(inputChar);
	}
}
