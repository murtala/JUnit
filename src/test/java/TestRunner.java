
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import annotations.JUnitExecutionProcedure;

public class TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	//	Result re = JUnitCore.runClasses(TestJunit.class); // to run j unit
	//Result re = JUnitCore.runClasses(TestJunit1.class);
	//Result result = JUnitCore.runClasses(UsingTestCase.class);
	//	Result result = JUnitCore.runClasses(UsingTestResult.class);
		//Result result = JUnitCore.runClasses(EmpBusinessLogicTest.class);
		Result result = JUnitCore.runClasses(JUnitExecutionProcedure.class);

		for (Failure fail : result.getFailures()) {
			System.out.println(fail.toString());
		}
		System.out.println(result.wasSuccessful());

	}

}
