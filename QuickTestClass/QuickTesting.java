public class QuickTesting {	
	public static int totalTests = 0;
	public static int totalPass = 0;
	public static int totalFail = 0;
	private static boolean detailed = false;
	
	public static void begin() {
		totalTests = 0;
		totalPass = 0;
		totalFail = 0;			
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
		// Use like this if on Windows		   
		// "Passed(?): " + result + "\n");
				   
		// Use like this if o Mac or unix like systems
		"Passed(?): " + (result ? (char)27 + "[32m" : (char)27 + "[31m") + result + "\n" + (char)27 + "[39m");				   
	}
	
	public static void end() {
		testingComplete();
		System.out.println("Simple Testing Ends");
	}
	
	private static void testingComplete() {
		// Use like this if on Windows
		// System.out.println("Total tests: " + totalTests);
		// System.out.println("Total Passed: " + totalPass);
		// System.out.println("Total Failed: " + totalFail);
		
		//Use like this if on Mac or unix like systems
		System.out.println((char)27 + "[36m" + "----------------------");
		System.out.println((char)27 + "[33m" + "Total tests: " + totalTests);
		System.out.println((char)27 + "[32m" + "Total Passed: " + totalPass);
		System.out.println((char)27 + "[31m" + "Total Failed: " + totalFail);
		System.out.print((char)27 + "[36m" + "----------------------");
		System.out.println((char)27 + "[39m");
	}
}
