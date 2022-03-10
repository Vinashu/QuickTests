public class QuickTesting {	
	public static int totalTests = 0;
	public static int totalPass = 0;
	public static int totalFail = 0;
	private static boolean detailed = false;
	
	public static void begin() {
		System.out.println("Simple Testing Begins...");
	}
	
	public static void detailedOutputOn() { detailed = true; }
	
	public static void isTrue(boolean x, String message) {
		validate(message, x, true);
	}

	public static void isFalse(boolean x, String message) {
		validate(message, x, false);
	}
			
	public static void equals(Object x, Object y, String message) {
		boolean result = (x.equals(y));
		validate(message,result, true);
	}
	
	public static void notEquals(Object x, Object y, String message) {
		boolean result = !(x.equals(y));
		validate(message,result, false);
	}
	
	private static void validate(String message, boolean result, boolean expected) {
		totalTests++;
		if(result == expected) { totalPass++; } else { totalFail++; }
		if(detailed) { testPrintOut(message, (result == expected)); }
	}
	
	private static void testPrintOut(String message, boolean result) {
		System.out.println("Test Performed: " + message + "\n" +
		"Passed(?): " + result + "\n");
	}
	
	public static void end() {
		testingComplete();
		System.out.println("Simple Testing Ends");
	}
	
	private static void testingComplete() {
		System.out.println("Total tests: " + totalTests +
		"\nTotal Passed: " + totalPass +
		"\nTotal Failed: " + totalFail);
	}
}
