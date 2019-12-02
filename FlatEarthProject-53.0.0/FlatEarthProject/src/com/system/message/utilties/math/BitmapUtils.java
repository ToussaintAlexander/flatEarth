package com.system.message.utilties.math;

import static com.system.message.element.DE001.PRIMARY_BITMAP_001_LENGTH;

import java.util.BitSet;
import java.util.Scanner;

import com.system.message.element.impl.DE001Impl;

public class BitmapUtils {

	/**************************************************************************
	 **************************************************************************/
	public String getFullBitMapString() {
		
		String bitmapPrimaryString 		= new DE001Impl().getPrimaryBitMapString();
		String bitmapSecondaryString 	= new DE001Impl().getSecondaryBitMapString();
		String bitmapTertiaryString 	= new DE001Impl().getTertiaryBitMapString();

		String targetBitmapString 		= bitmapPrimaryString + bitmapSecondaryString + bitmapTertiaryString;
		
		return targetBitmapString;
	}
	/**************************************************************************
	 **************************************************************************/
	public BitSet convertBitMapString(String bitmapString) {

		BitSet bitmap = new BitSet();
		 
		@SuppressWarnings("resource")
		Scanner s = new Scanner(bitmapString).useDelimiter("\\s");

		for (int i = 0; i < PRIMARY_BITMAP_001_LENGTH * 3 + 1; i++) {

			if (s.next().equals("00")) {
				bitmap.set(i, false);
			} else {
				bitmap.set(i, true);
			}
		}
		s.close();
		
		return bitmap;
	}
	/**************************************************************************
	 **************************************************************************/
	public BitSet toggleAllBitsToOn() {

		BitSet bitmap = new BitSet();
		 
		for (int i = 0; i < PRIMARY_BITMAP_001_LENGTH * 3 + 1; i++) {
			bitmap.set(i, true);
		}
		
		return bitmap;
	}
	/**************************************************************************
	 **************************************************************************/
	public void display (String banner, BitSet bitSet) {
		
		System.out.println();
		System.out.println(banner);
		System.out.println();
		
		for (int i = 0; i < PRIMARY_BITMAP_001_LENGTH * 3 + 1; i++) {
			
			System.out.println("Bit " + i + " " + bitSet.get(i) + " ");
		}
		System.out.println();
	}
	/**************************************************************************
	 **************************************************************************/
	public void display2 (String banner, BitSet bitSet) {
		
		System.out.println();
		System.out.println(banner);
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Bit " + i + " " + bitSet.get(i) + " ");
		}
		 
	}
	/*********************************************************************
	 *********************************************************************
	 */
	public String convertHexadecimalToBinary ( String hexadecimalValue ) {
		
		String[] stringArray  = new String[24];
		
		String fullByte = "";
		
		for (int i = 0; i < hexadecimalValue.length() / 2; i++) {
			
			stringArray[i] =  hexadecimalValue.substring(i * 2, i * 2 + 2);
			
		}
		
		for (int i = 0; i < hexadecimalValue.length() / 2; i++) {
			
			String decimalNibble1 = stringArray[i].substring(0,1);
			String decimalNibble2 = stringArray[i].substring(1);
			
			if (decimalNibble1.toUpperCase().equals("A")) decimalNibble1 = "10";	
			if (decimalNibble2.toUpperCase().equals("A")) decimalNibble2 = "10";
			
			if (decimalNibble1.toUpperCase().equals("B")) decimalNibble1 = "11";
			if (decimalNibble2.toUpperCase().equals("B")) decimalNibble2 = "11";
			
			if (decimalNibble1.toUpperCase().equals("C")) decimalNibble1 = "12";
			if (decimalNibble2.toUpperCase().equals("C")) decimalNibble2 = "12";
			
			if (decimalNibble1.toUpperCase().equals("D")) decimalNibble1 = "13";
			if (decimalNibble2.toUpperCase().equals("D")) decimalNibble2 = "13";
			
			if (decimalNibble1.toUpperCase().equals("E")) decimalNibble1 = "14";
			if (decimalNibble2.toUpperCase().equals("E")) decimalNibble2 = "14";
			
			if (decimalNibble1.toUpperCase().equals("F")) decimalNibble1 = "15";
			if (decimalNibble2.toUpperCase().equals("F")) decimalNibble2 = "15";
			
			String binaryNibble1 = Integer.toBinaryString(Integer.parseInt(decimalNibble1));
			String binaryNibble2 = Integer.toBinaryString(Integer.parseInt(decimalNibble2));
			
			if (binaryNibble1.length() == 1) binaryNibble1 = "000" 	+ binaryNibble1;
			if (binaryNibble1.length() == 2) binaryNibble1 = "00" 	+ binaryNibble1;
			if (binaryNibble1.length() == 3) binaryNibble1 = "0" 	+ binaryNibble1 ;
			
			if (binaryNibble2.length() == 1) binaryNibble2 = "000" 	+ binaryNibble2;
			if (binaryNibble2.length() == 2) binaryNibble2 = "00" 	+ binaryNibble2;
			if (binaryNibble2.length() == 3) binaryNibble2 = "0" 	+ binaryNibble2 ;

			fullByte = fullByte + binaryNibble1 + binaryNibble2;
			
		}
		 
		return fullByte;
		 
	}
	/*********************************************************************
	 *********************************************************************
	 */
	public String convertBinaryToAscii ( String binaryValue ) {
		
		StringBuffer result = new StringBuffer("");
		
		int amountOfBits = 8;
		
		for (int i = 0; i < binaryValue.length(); i += amountOfBits ) {
			
		     result.append((char) Integer.parseInt(binaryValue.substring(i, i + amountOfBits ), 2));
		     
		}
		
		return result.toString();
		 
	}
	/*********************************************************************
	 *********************************************************************
	 */
	public String convertAsciiTextToHexadecimal ( String asciiTextValue ) {
		
		char[] chars = asciiTextValue.toCharArray();
		
	      StringBuffer hex = new StringBuffer();
	      
	      for (int i = 0; i < chars.length; i++)
	      {
	         hex.append(Integer.toHexString((int) chars[i]));
	      }
	      
	      return hex.toString();
	      
	}
	/*********************************************************************
	 *********************************************************************
	 */
	public String convertHexadecimalToAsciiText ( String hexadecimalValue ) {
		
		 StringBuilder output = new StringBuilder("");
		 
	      for (int i = 0; i < hexadecimalValue.length(); i += 2)
	      {
	         String str = hexadecimalValue.substring(i, i + 2);
	         output.append((char) Integer.parseInt(str, 16));
	      }
	      
	      return output.toString();
	      
	 }
	/*********************************************************************
	 * ASCII ---> hex ---> binary
	 *
	 * binary ---> ASCII ---> hex
	 **************************************************************************/
	public static void main(String[] args) {
		
		String banner = "Full Bitmap";
		
		String bitmapPrimaryString 		= new DE001Impl().getPrimaryBitMapString();
		String bitmapSecondaryString 	= new DE001Impl().getSecondaryBitMapString();
		String bitmapTertiaryString 	= new DE001Impl().getTertiaryBitMapString();
		
		String targetBitmapString 		= bitmapPrimaryString + bitmapSecondaryString + bitmapTertiaryString;
		
		BitSet bitMap = new BitmapUtils().convertBitMapString(targetBitmapString);
		
		new BitmapUtils().display (banner,bitMap);
		
		String hexValue = new BitmapUtils().convertAsciiTextToHexadecimal("Toussaint Alexander");	// ASCII ---> hex
		System.out.println(hexValue);
		
		String asciiValue1 = new BitmapUtils().convertHexadecimalToAsciiText(hexValue);				// hex ---> ASCII
		System.out.println(asciiValue1);
		
		String binaryValue = new BitmapUtils().convertHexadecimalToBinary(hexValue);				// hex ---> binary
		System.out.println(binaryValue);
		
		String asciiValue2 = new BitmapUtils().convertBinaryToAscii(binaryValue);					// binary ---> ASCII
		System.out.println(asciiValue2);
		
	}

}
