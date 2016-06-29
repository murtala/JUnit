import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import message.MessageUtil;
import message.MessageUtilDelayed;

public class TestJunit {

	String message = "Hello World";
	MessageUtil mu = new MessageUtil(message);
	MessageUtilDelayed mud = new MessageUtilDelayed(message);
@Ignore
	@Test(timeout = 1000)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		
		MessageUtilDelayed.printMessage(message);
	}

	@Test(expected = ArithmeticException.class)
	public void printExceptionMessage() {
		System.out.println("Inside testPrintMessage()");
		MessageUtil.printExceptionMessage(message);
	}

	@Ignore
	@Test
	public void TestSetMessage() {
		message = "New message";
		assertEquals(message, mu.setMessage(message));
		assertEquals(message, mu.getMessage());

	}

}
