
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import message.MessageUtil;

public class TestJunit1 {

	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, messageUtil.getMessage());
	}

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}

	@Test
	public void testAdd() {
		// test data
		int num = 5;
		String temp = null;
		String str = "Junit is working fine";
		// check for equality
		assertEquals("Junit is working fine", str);
		// check for false condition
		assertFalse(num > 6);
		// check for not null value
		assertNotNull(str);
	}

}
