package com.example.email_validator_ui.email_validator_ui;

public class Validator {

	public boolean validate ( String email) {
		if (email.matches("[^@]*@[^@]*") && email.matches(".*[.].*") && email.matches(".*[A-Za-z0-9]-*[A-Za-z0-9].*") && email.matches(".*[.]+((com)|(ca))"))
			return true;
		else
			return false;
	}

}
