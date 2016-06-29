package annotations;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitAnnotation {

	// execute before class when class is first loaded, its static
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class,static");
	}

	// execute before test
	@Before
	public void before() {
		System.out.println("Before test");
	}

	@Test
	public void test() {
		System.out.println("test");
	}

	@After
	public void afterTest() {
		System.out.println("After test");
	}

	@Ignore
	public void ignoreTest() {
		System.out.println("ignored");
	}

	// execute after class loaded
	@AfterClass
	public static void afterClass() {
		System.out.println("After class, static");
	}
}
