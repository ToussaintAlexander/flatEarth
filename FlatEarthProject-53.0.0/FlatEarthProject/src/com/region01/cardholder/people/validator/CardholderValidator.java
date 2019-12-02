package com.region01.cardholder.people.validator;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.region01.cardholder.people.model.Colour;

public class CardholderValidator implements Validator {

	private static final Log log = LogFactory.getLog(CardholderValidator.class);
	
		public boolean supports(Class<?> paramClass) {
			String now = (new Date()).toString();
			log.info("Logging Return from supports " + now);
			return Colour.class.equals(paramClass);
		}

		public void validate(Object obj, Errors errors) {
			String now = (new Date()).toString();
			log.info("Logging Return from validate " + now);
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "colourName", "valid.colour");
		}
}