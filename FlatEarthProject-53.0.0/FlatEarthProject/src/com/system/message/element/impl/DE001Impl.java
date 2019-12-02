package com.system.message.element.impl;

import java.util.BitSet;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.base.element.DataElementImpl;
import com.system.message.element.DE001;

public class DE001Impl extends DataElementImpl implements DE001 {

	public DE001Impl(int id, List<DataElementField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE001Impl() {}
	
	/***************************************************************
	 ***************************************************************
	 */
	public BitSet getBitMap() {

		BitSet bitmap = new BitSet();

		bitmap.set(0, true); 	// Reserved 
		bitmap.set(1, true); 	// Bitmap
		bitmap.set(2, true); 	// Primary account number (PAN)
		bitmap.set(3, true); 	// Processing code
		bitmap.set(4, true); 	// Amount, transaction
		bitmap.set(5, false); 	// Amount, settlement
		bitmap.set(6, false); 	// Amount, cardholder billing
		bitmap.set(7, true); 	// Transmission date & time
		bitmap.set(8, false); 	// Amount, cardholder billing fee
		bitmap.set(9, false); 	// Conversion rate, settlement
		
		bitmap.set(10, true); 	// Conversion rate, cardholder billing
		bitmap.set(11, true); 	// System trace audit number (STAN)
		bitmap.set(12, true); 	// Time, local transaction (hhmmss)
		bitmap.set(13, true); 	// Date, local transaction (MMDD)
		bitmap.set(14, true); 	// Date, expiration	(YYMM)
		bitmap.set(15, false); 	// Date, settlement
		bitmap.set(16, false); 	// Date, conversion
		bitmap.set(17, false); 	// Date, capture
		bitmap.set(18, true); 	// Merchant type
		bitmap.set(19, true); 	// Acquiring institution country code
		
		bitmap.set(20, true); 	// PAN extended, country code
		bitmap.set(21, true); 	// Forwarding institution, country code
		bitmap.set(22, true); 	// Point of service entry mode
		bitmap.set(23, false); 	// Application PAN sequence number
		bitmap.set(24, false); 	// Network International identifier (NII)
		bitmap.set(25, true); 	// Point of service condition code
		bitmap.set(26, true); 	// Point of service PIN capture code
		bitmap.set(27, false); 	// Authorizing identification response length
		bitmap.set(28, true); 	// Amount, transaction fee
		bitmap.set(29, false); 	// Amount, settlement fee
		
		bitmap.set(30, true); 	// Amount, transaction processing fee
		bitmap.set(31, false); 	// Amount, settlement processing fee
		bitmap.set(32, true); 	// Acquiring institution identification code
		bitmap.set(33, true); 	// Forwarding institution identification code
		bitmap.set(34, false); 	// Primary account number, extended
		bitmap.set(35, true); 	// Track 2 data
		bitmap.set(36, false); 	// Track 3 data
		bitmap.set(37, true); 	// Retrieval reference number
		bitmap.set(38, false); 	// Authorization identification response
		bitmap.set(39, true); 	// Response code
		
		bitmap.set(40, false); 	// Service restriction code
		bitmap.set(41, true); 	// Card acceptor terminal identification
		bitmap.set(42, true); 	// Card acceptor identification code
		bitmap.set(43, true); 	// Card acceptor name/location 
		bitmap.set(44, false); 	// Additional response data
		bitmap.set(45, false); 	// Track 1 data
		bitmap.set(46, false); 	// Unused Bit Field					xxx
		bitmap.set(47, false); 	// Unused Bit Field					xxx
		bitmap.set(48, true); 	// Additional data - private
		bitmap.set(49, true); 	// Currency code, transaction
		
		bitmap.set(50, false); 	// Currency code, settlement
		bitmap.set(51, false); 	// Currency code, cardholder billing
		bitmap.set(52, true); 	// Personal Identification Number (PIN) Data
		bitmap.set(53, true); 	// Security-related control information
		bitmap.set(54, true); 	// Additional amount
		bitmap.set(55, true); 	// Integrated Circuit Card (ICC)-Related Data
		bitmap.set(56, false); 	// Unused Bit Field					xxx 
		bitmap.set(57, false); 	// Unused Bit Field					xxx 
		bitmap.set(58, false); 	// Unused Bit Field					xxx 
		bitmap.set(59, true); 	// National POS GEO Data  
		
		bitmap.set(60, true); 	// Additional POS Information 
		bitmap.set(61, false); 	// Unused Bit Field					xxx  
		bitmap.set(62, true); 	// Unused Bit Field					xxx 
		bitmap.set(63, true); 	// Private-Use Field
		bitmap.set(64, false); 	// Message authentication code (MAC) 
		
		bitmap.set(65, false); 	// Tertiary Bit Map 
		bitmap.set(66, false); 	// Settlement code
		bitmap.set(67, false); 	// Extended payment code 
		bitmap.set(68, false); 	// Receiving Institution Country Code 
		bitmap.set(69, false); 	// Settlement institution country code 

		bitmap.set(70, false); 	// Network Management Information Code 
		bitmap.set(71, false); 	// Message number 
		bitmap.set(72, false); 	// Message number, last 
		bitmap.set(73, false); 	// Action Date
		bitmap.set(74, false); 	// Credits, number 
		bitmap.set(75, false); 	// Credits, reversal number 
		bitmap.set(76, false); 	// Debits, number 
		bitmap.set(77, false); 	// Debits, reversal number
		bitmap.set(78, false); 	// Transfer number 
		bitmap.set(79, false); 	// Transfer, reversal number 

		bitmap.set(80, false); 	// Inquiries number 
		bitmap.set(81, false); 	// Authorizations, number 
		bitmap.set(82, false); 	// Credits, processing fee amount 
		bitmap.set(83, false); 	// Credits, transaction fee amount 
		bitmap.set(84, false); 	// Debits, processing fee amount 
		bitmap.set(85, false); 	// Debits, transaction fee amount 
		bitmap.set(86, false); 	// Credits, amount
		bitmap.set(87, false); 	// Credits, reversal amount 
		bitmap.set(88, false); 	// Debits, amount
		bitmap.set(89, false); 	// Debits, reversal amount 

		bitmap.set(90, false); 	// Original Data Elements 
		bitmap.set(91, false); 	// File Update Code 
		bitmap.set(92, false); 	// File Security Code 
		bitmap.set(93, false); 	// Response Indicator 
		bitmap.set(94, false); 	// Service Indicator 
		bitmap.set(95, false); 	// Replacement Amounts 
		bitmap.set(96, false); 	// Message Security Code 
		bitmap.set(97, false); 	// Amount, net settlement 
		bitmap.set(98, false); 	// Payee 
		bitmap.set(99, false); 	// Settlement institution identification code

		bitmap.set(100, false);	// Receiving Institution Identification Code
		bitmap.set(101, false);	// File Name 
		bitmap.set(102, false);	// Account Identification 1 
		bitmap.set(103, false);	// Account Identification 2 
		bitmap.set(104, false);	// Transaction Description and Transaction Specific Data 
		bitmap.set(105, false);	// Double-length DES Key 
		bitmap.set(106, false);	// Unused Bit Field					xxx
		bitmap.set(107, false);	// Unused Bit Field					xxx
		bitmap.set(108, false);	// Unused Bit Field					xxx
		bitmap.set(109, false);	// Unused Bit Field					xxx
		
		bitmap.set(110, false);	// Unused Bit Field					xxx 
		bitmap.set(111, false);	// Unused Bit Field					xxx
		bitmap.set(112, false);	// Unused Bit Field					xxx 
		bitmap.set(113, false);	// Unused Bit Field					xxx 
		bitmap.set(114, false);	// Unused Bit Field					xxx 
		bitmap.set(115, false);	// Unused Bit Field					xxx
		bitmap.set(116, false);	// Unused Bit Field					xxx 
		bitmap.set(117, false);	// Unused Bit Field					xxx
		bitmap.set(118, false);	// Unused Bit Field					xxx 
		bitmap.set(119, false);	// Unused Bit Field					xxx 

		bitmap.set(120, false);	// Unused Bit Field					xxx 
		bitmap.set(121, false);	// Unused Bit Field					xxx
		bitmap.set(122, false);	// Unused Bit Field					xxx 
		bitmap.set(123, false);	// Address Verification Service 
		bitmap.set(124, false);	// Unused Bit Field					xxx
		bitmap.set(125, false);	// Unused Bit Field					xxx 
		bitmap.set(126, false);	// Visa Private Use Fields 
		bitmap.set(127, false);	// Unused Bit Field					xxx
		bitmap.set(128, false);	// Message Authentication Code 
		bitmap.set(129, false);	// Unused Bit Field 

		bitmap.set(130, false);	// Unused Bit Field  
		bitmap.set(131, false);	// Unused Bit Field 
		bitmap.set(132, false);	// Unused Bit Field 
		bitmap.set(133, false);	// Unused Bit Field  
		bitmap.set(134, false);	// Unused Bit Field  
		bitmap.set(135, false);	// Unused Bit Field  
		bitmap.set(136, false);	// Unused Bit Field  
		bitmap.set(137, false);	// Unused Bit Field  
		bitmap.set(138, false);	// Unused Bit Field  
		bitmap.set(139, false);	// Unused Bit Field 

		bitmap.set(140, false);	// Unused Bit Field  
		bitmap.set(141, false);	// Unused Bit Field 
		bitmap.set(142, false);	// Unused Bit Field  
		bitmap.set(143, false);	// Unused Bit Field  
		bitmap.set(144, false);	// Unused Bit Field  
		bitmap.set(145, false);	// Unused Bit Field  
		bitmap.set(146, false);	// Unused Bit Field  
		bitmap.set(147, false);	// Unused Bit Field  
		bitmap.set(148, false);	// Unused Bit Field  
		bitmap.set(149, false);	// Unused Bit Field  

		bitmap.set(150, false);	// Unused Bit Field  
		bitmap.set(151, false);	// Unused Bit Field  
		bitmap.set(152, false);	// Unused Bit Field  
		bitmap.set(153, false);	// Unused Bit Field  
		bitmap.set(154, false);	// Unused Bit Field  
		bitmap.set(155, false);	// Unused Bit Field  
		bitmap.set(156, false);	// Unused Bit Field  
		bitmap.set(157, false);	// Unused Bit Field  
		bitmap.set(158, false);	// Unused Bit Field  
		bitmap.set(159, false);	// Unused Bit Field  

		bitmap.set(160, false);	// Unused Bit Field  
		bitmap.set(161, false);	// Unused Bit Field  
		bitmap.set(162, false);	// Unused Bit Field 
		bitmap.set(163, false);	// Unused Bit Field  
		bitmap.set(164, false);	// Unused Bit Field  
		bitmap.set(165, false);	// Unused Bit Field  
		bitmap.set(166, false);	// Unused Bit Field  
		bitmap.set(167, false);	// Unused Bit Field  
		bitmap.set(168, false);	// Unused Bit Field  
		bitmap.set(169, false);	// Unused Bit Field  

		bitmap.set(170, false);	// Unused Bit Field  
		bitmap.set(171, false);	// Unused Bit Field  
		bitmap.set(172, false);	// Unused Bit Field 
		bitmap.set(173, false);	// Unused Bit Field  
		bitmap.set(174, false);	// Unused Bit Field  
		bitmap.set(175, false);	// Unused Bit Field  
		bitmap.set(176, false);	// Unused Bit Field  
		bitmap.set(177, false);	// Unused Bit Field  
		bitmap.set(178, false);	// Unused Bit Field  
		bitmap.set(179, false);	// Unused Bit Field  

		bitmap.set(180, false);	// Unused Bit Field  
		bitmap.set(181, false);	// Unused Bit Field  
		bitmap.set(182, false);	// Unused Bit Field 
		bitmap.set(183, false);	// Unused Bit Field  
		bitmap.set(184, false);	// Unused Bit Field  
		bitmap.set(185, false);	// Unused Bit Field  
		bitmap.set(186, false);	// Unused Bit Field  
		bitmap.set(187, false);	// Unused Bit Field  
		bitmap.set(188, false);	// Unused Bit Field  
		bitmap.set(189, false);	// Unused Bit Field  

		bitmap.set(190, false);	// Unused Bit Field  
		bitmap.set(191, false);	// Unused Bit Field  
		bitmap.set(192, false);	// Unused Bit Field 
		
		return bitmap;
	}
	/**************************************************************************
	 **************************************************************************/
	public String getPrimaryBitMapString() {

		//									                     10 						   20							 30							   40						     50							   60		   64				   
		//                         00 01 02 03 04 05 06 07 08 09 00 01 02 03 04 05 06 07 08 09 00 01 02 03 04 05 06 07 08 09 00 01 02 03 04 05 06 07 08 09 00 01 02 03 04 05 06 07 08 09 00 01 02 03 04 05 06 07 08 09 00 01 02 03 04 
		String primaryBitmap   = " 01 01 01 01 01 01 01 01 01 01 00 01 01 01 01 00 00 00 01 01 00 00 01 00 00 01 01 00 01 00 00 00 01 00 00 01 00 01 01 01 00 01 01 01 01 00 00 00 01 01 00 00 01 01 01 01 00 00 00 01 01 00 00 01 00 ";

		return primaryBitmap;
		
	}
	/**************************************************************************
	 **************************************************************************/
	public String getSecondaryBitMapString() {

		//						  65	         70							   80							 90						      100						    110						      120				      128   
		//                        05 06 07 08 09 00 01 02 03 04 05 06 07 08 09 00 01 02 03 04 05 06 07 08 09 00 01 02 03 04 05 06 07 08 09 00 01 02 03 04 05 06 07 08 09 00 01 02 03 04 05 06 07 08 09 00 01 02 03 04 05 06 07 08  
		String secondaryBitmap = "01 00 00 01 00 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 01 00 00 ";
		
		return secondaryBitmap;
		
	}
	/**************************************************************************
	 **************************************************************************/
	public String getTertiaryBitMapString() {

		//						129 	          				 140			    		   150					  		 160				       	   170				     	     180					       190	 192			 
		//                       09 00 01 02 03 04 05 06 07 08 09 00 01 02 03 04 05 06 07 08 09 00 01 02 03 04 05 06 07 08 09 00 01 02 03 04 05 06 07 08 09 00 01 02 03 04 05 06 07 08 09 00 01 02 03 04 05 06 07 08 09 00 01 02
		String tertiaryBitmap = "00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 ";
		
		return tertiaryBitmap;
		
	}
	
}		
