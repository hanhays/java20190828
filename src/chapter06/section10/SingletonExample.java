package chapter06.section10;

public class SingletonExample {
	public static void main(String[] args) {
//		Singleton c = new Singleton();
				
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj1 == obj2);
	}
}
