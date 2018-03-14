package com.jwt.login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class isCorrectEmail{
		private Pattern pattern;
		private Matcher matcher;

		private static final String EMAIL_PATTERN =
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		public isCorrectEmail() {
			pattern = Pattern.compile(EMAIL_PATTERN);
		}

		/**
		 * Validate hex with regular expression
		 *
		 * @param hex
		 *            hex for validation
		 * @return true valid hex, false invalid hex
		 */
		public boolean validate(final String hex) {

			matcher = pattern.matcher(hex);
			return matcher.matches();

		}

public static void main(String [] args)
{
	isCorrectEmail ob=new isCorrectEmail();
	System.out.println(ob.validate("dakshay@gm"));
}

}