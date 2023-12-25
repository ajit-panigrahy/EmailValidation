package lenovo.emailvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {

		String[] emails = { "ajit@gmail.com", "ajit.kumar@nit.org", "xyz.email", "lenovo @.com" };

		System.out.println("Email Validation Example:");

		for (String email : emails) {
			System.out.println(email + " is valid: " + isValidEmail(email));
		}
	}

	// Method to check if a string represents a valid email address
	private static boolean isValidEmail(String email) {
		// Define a regular expression for a simple email validation
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

		// Compile the regular expression
		Pattern pattern = Pattern.compile(emailRegex);

		// Create a matcher object
		Matcher matcher = pattern.matcher(email);

		// Check if the input email matches the pattern
		return matcher.matches();
	}
}
