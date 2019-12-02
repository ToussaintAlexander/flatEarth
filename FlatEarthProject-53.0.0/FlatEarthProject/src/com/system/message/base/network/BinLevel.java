package com.system.message.base.network;

public class BinLevel extends SBBSTNode {

	private int binWeightLeft;
	private int binWeightCenter;
	private int binWeightRight;
	
	public BinLevel () {}

	public BinLevel(int binWeightLeft, int binWeightCenter, int binWeightRight) {
		super();
		this.binWeightLeft = binWeightLeft;
		this.binWeightCenter = binWeightCenter;
		this.binWeightRight = binWeightRight;
	}

	public int getBinWeightLeft() {
		return binWeightLeft;
	}

	public void setBinWeightLeft(int binWeightLeft) {
		this.binWeightLeft = binWeightLeft;
	}

	public int getBinWeightCenter() {
		return binWeightCenter;
	}

	public void setBinWeightCenter(int binWeightCenter) {
		this.binWeightCenter = binWeightCenter;
	}

	public int getBinWeightRight() {
		return binWeightRight;
	}

	public void setBinWeightRight(int binWeightRight) {
		this.binWeightRight = binWeightRight;
	}

	@Override
	public String toString() {
		return "       :  binWeightLeft         = " 	+ binWeightLeft 
					   + " binWeightCenter         = " 	+ binWeightCenter 
					   + " binWeightRight         = "	+ binWeightRight;
	}

}
