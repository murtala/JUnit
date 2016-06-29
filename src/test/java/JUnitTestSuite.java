import junit.framework.TestResult;
import junit.framework.TestSuite;

public class JUnitTestSuite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// adds the test in the suite

		TestSuite suite = new TestSuite(TestJunit.class, TestJunit1.class, UsingTestResult.class, UsingTestCase.class);
		TestResult result = new TestResult();
		suite.run(result);
		suite.countTestCases();
		suite.warning("Message display");
		System.out.println("Number of test cases = " + result.runCount());
		System.out.println("Number of count = " + suite.countTestCases());
	}

}
