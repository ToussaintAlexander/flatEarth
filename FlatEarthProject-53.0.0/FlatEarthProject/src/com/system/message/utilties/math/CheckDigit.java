package com.system.message.utilties.math;

/*
 * https://wiki.openmrs.org/display/docs/Check+Digit+Algorithm
 * 
 * What is the Luhn algorithm?
 * 
 * We use a variation of the Luhn algorithm. 
 * This algorithm, also known as the "modulus 10" or "mod 10" algorithm, is very common. 
 * For example, it's the algorithm used by credit card companies to generate the final digit of a credit card.
 * 
 * Given an identifier, let's say "139", you travel right to left. 
 * Every other digit is doubled and the other digits are taken unchanged. 
 * All resulting digits are summed and the check digit is the amount necessary to take this sum up to a number 
 * divisible by ten.
 *
 * Got it? All right, lets try the example.
 *
 * Work right-to-left, using "139" and doubling every other digit.
 *
 * 9 x 2 = 18
 *
 * 3 = 3
 *
 * 1 x 2 = 2
 *
 * Now sum all of the digits (note '18' is two digits, '1' and '8'). 
 * So the answer is '1 + 8 + 3 + 2 = 14' and the check digit is the amount needed to reach a number divisible by ten. 
 * For a sum of '14', the check digit is '6' since '20' is the next number divisible by ten.
 * 
 */

public class CheckDigit {

	boolean isCheckDigitValid () {
		return false;
	}
	
	int getCheckDigit () {
		return 0;
	}
	
}
