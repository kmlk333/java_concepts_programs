
public class Test {

	public static void main(String[] args) {
		
		call(null);
	}

	private static void call(String str) {
		System.out.println("String");
	}

	private static void call(Object object) {
		System.out.println("Object");
	}

}
