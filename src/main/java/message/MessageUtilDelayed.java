package message;

public class MessageUtilDelayed {

	private String message;

	public MessageUtilDelayed(String message) {
		this.message = message;
	}

	public String getMessage() {
		System.out.println(message);
		return message;
	}

	// prints the message
	public static void printMessage(String message) {
		System.out.println(message);
		while (true)  // add infinite loop
			;
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
}
