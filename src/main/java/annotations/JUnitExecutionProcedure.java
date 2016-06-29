package annotations;

import static org.junit.Assert.*;

import org.junit.*;

public class JUnitExecutionProcedure {

	@BeforeClass
	// execute once, in the starting
	public static void beforeClass() {
		System.out.println("Before class");
	}

	@Before
	// execute for each test, before executing test
	public void before() {
		System.out.println("Before ");
	}

	@Test
	// test case 1
	public void testCase1() {
		System.out.println("in test case 1");
	}

	// test case 2
	@Test
	public void testCase2() {
		System.out.println("in test case 2");
	}

	@After
	// Excecute for each test, after exucuting test
	public void after() {
		System.out.println("After");
	}

	@AfterClass
	// execute once, after
	public static void afterClass() {
		System.out.println("After Class");
	}

}
