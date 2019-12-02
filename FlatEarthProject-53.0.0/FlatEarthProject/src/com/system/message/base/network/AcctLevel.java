package com.system.message.base.network;

public class AcctLevel extends SBBSTNode {

	private int accountWeightLeft;
	private int accountWeightCenter;
	private int accountWeightRight;
	
	public AcctLevel () {}
	
	public AcctLevel(int accountWeightLeft, int accountWeightCenter, int accountWeightRight) {
		super();
		this.accountWeightLeft = accountWeightLeft;
		this.accountWeightCenter = accountWeightCenter;
		this.accountWeightRight = accountWeightRight;
	}

	public int getAccountWeightLeft() {
		return accountWeightLeft;
	}

	public void setAccountWeightLeft(int accountWeightLeft) {
		this.accountWeightLeft = accountWeightLeft;
	}

	public int getAccountWeightCenter() {
		return accountWeightCenter;
	}

	public void setAccountWeightCenter(int accountWeightCenter) {
		this.accountWeightCenter = accountWeightCenter;
	}

	public int getAccountWeightRight() {
		return accountWeightRight;
	}

	public void setAccountWeightRight(int accountWeightRight) {
		this.accountWeightRight = accountWeightRight;
	}
	
	@Override
	public String toString() {
		return "       :  accountWeightLeft     = " 	+ accountWeightLeft 
					   + " accountWeightCenter     = " 	+ accountWeightCenter 
					   + " accountWeightRight     = "	+ accountWeightRight;
	}
	
}
