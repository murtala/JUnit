package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionsTest {

	@Test
	public void testAssertions() {
		// test data
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		int val1 = 5;
		int val2 = 6;
		String[] expectedArray = { "one", "two", "three" };
		String[] resultArray = { "one", "two", "three" };

		// test that 2 objects are equal
		assertEquals(str1, str2);
		// check that a condition is true
		assertTrue(val1 < val2);
		// check that a condition is false
		assertFalse(val1 > val2);
		// check an object is not null
		assertNotNull(str1);
		// check an object is null
		assertNull(str3);
		// check if 2 objects reference the same object
		assertSame(str4, str5);
		// check 2 object references do not point to the same object
		assertNotSame(str1, str3);
		// test 2 arrays are equal to each other
		assertArrayEquals(expectedArray, resultArray);
		
		//verify a color
		//Verify color is Blue
		/*
		assertEquals("rgb(0, 0, 255)", message.getCssValue("background-color").toString());
		*/
	}

}
