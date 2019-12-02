package com.system.message.base.network;

public class TransLevel extends SBBSTNode {

	private int transactionWeightLeft;
	private int transactionWeightCenter;
	private int transactionWeightRight;
	
	public TransLevel () {}

	public TransLevel(int transactionWeightLeft, int transactionWeightCenter, int transactionWeightRight) {
		super();
		this.transactionWeightLeft = transactionWeightLeft;
		this.transactionWeightCenter = transactionWeightCenter;
		this.transactionWeightRight = transactionWeightRight;
	}

	public int getTransactionWeightLeft() {
		return transactionWeightLeft;
	}

	public void setTransactionWeightLeft(int transactionWeightLeft) {
		this.transactionWeightLeft = transactionWeightLeft;
	}

	public int getTransactionWeightCenter() {
		return transactionWeightCenter;
	}

	public void setTransactionWeightCenter(int transactionWeightCenter) {
		this.transactionWeightCenter = transactionWeightCenter;
	}

	public int getTransactionWeightRight() {
		return transactionWeightRight;
	}

	public void setTransactionWeightRight(int transactionWeightRight) {
		this.transactionWeightRight = transactionWeightRight;
	}
	
	@Override
	public String toString() {
		return "       :  transactionWeightLeft = " 	+ transactionWeightLeft 
					   + " transactionWeightCenter = " 	+ transactionWeightCenter 
					   + " transactionWeightRight = "	+ transactionWeightRight;
	}
	
}
