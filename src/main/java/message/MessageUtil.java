package message;

public class MessageUtil {

	private String message;

	public MessageUtil(String message) {
		this.message = message;
	}

	public String getMessage() {
		System.out.println(message);
		return message;
	}

	// @param message to be printed
	public String setMessage(String message) {
		this.message = message;
		return message;
	}

	// add "Hi!" to the message
	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}

	// prints the message containing exception

	public static void printExceptionMessage(String message) {
		System.out.println(message);
		int a = 0;
		int b = 1 / a;
	}

}
