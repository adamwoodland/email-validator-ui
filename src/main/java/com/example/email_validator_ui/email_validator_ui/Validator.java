package com.example.email_validator_ui.email_validator_ui;

public class Validator {
	
	//checks to see if a String follows four formatting rules
	public int validate (String email) {
		int x = 0;
		if (email.matches("[^@]*@[^@]*")) //only 1 '@'
			x++;
		if (email.matches(".*[.].*")) //at least 1 '.'
			x++;
		if (email.matches(".*[A-Za-z0-9]-*[A-Za-z0-9].*")) //hyphens can only be enclosed within alphanumeric characters
			x++;
		if (email.matches(".*[.]+((com)|(ca))")) //domain ends in '.com' or '.ca'
			x++;
		return x;
	}
			
}

