package com.example.email_validator_ui.email_validator_ui;

public class Validator {

	/*method that checks four separate rules for correct email format
	 * 1. only one '@' symbol
	 * 2. at least one '.'
	 * 3. hyphens can only be enclosed around alphanumeric characters
	 * 4. the domain needs to end in '.com' or '.ca'
	 */
	
	public boolean validate ( String email) {
		if (email.matches("[^@]*@[^@]*") && email.matches(".*[.].*") && email.matches(".*[A-Za-z0-9]-*[A-Za-z0-9].*") && email.matches(".*[.]+((com)|(ca))"))
			return true;
		else
			return false;
	}

}
