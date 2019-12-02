package com.system.configuration.constants;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Vector;

public class Message {

	private Vector<Integer>		integerVector		= new Vector<Integer>(10,2);
	private Vector<String>		stringVector		= new Vector<String>(10,2);
	private Vector<Timestamp>	timestampVector		= new Vector<Timestamp>(10,2);
	private Vector<BigDecimal>	bigDecimalVector	= new Vector<BigDecimal>(10,2);
	private Vector<Object>		objectVector		= new Vector<Object>(10,2);
	
	public Message () {}
	
	public Message ( Vector<Integer>		integerVector
					     , Vector<String>		stringVector
					     , Vector<Timestamp>	timestampVector
					     , Vector<BigDecimal>	bigDecimalVector
					     , Vector<Object>		objectVector					     
						 ) {
		
		this.integerVector 		= integerVector;
		this.stringVector 		= stringVector;
		this.timestampVector 	= timestampVector;
		this.bigDecimalVector 	= bigDecimalVector;
		this.objectVector 		= objectVector;
	}

	public Vector<Integer> getIntegerVector() {
		return integerVector;
	}

	public void setIntegerVector(Vector<Integer> integerVector) {
		this.integerVector = integerVector;
	}

	public Vector<String> getStringVector() {
		return stringVector;
	}

	public void setStringVector(Vector<String> stringVector) {
		this.stringVector = stringVector;
	}

	public Vector<Timestamp> getTimestampVector() {
		return timestampVector;
	}

	public void setTimestampVector(Vector<Timestamp> timestampVector) {
		this.timestampVector = timestampVector;
	}

	public Vector<BigDecimal> getBigDecimalVector() {
		return bigDecimalVector;
	}

	public void setBigDecimalVector(Vector<BigDecimal> bigDecimalVector) {
		this.bigDecimalVector = bigDecimalVector;
	}

	public Vector<Object> getObjectVector() {
		return objectVector;
	}

	public void setObjectVector(Vector<Object> objectVector) {
		this.objectVector = objectVector;
	}

	@Override
	public String toString() {
		return "MessageSearch [integerVector=" + integerVector
				+ ", stringVector=" + stringVector + ", timestampVector="
				+ timestampVector + ", bigDecimalVector=" + bigDecimalVector
				+ ", objectVector=" + objectVector + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((bigDecimalVector == null) ? 0 : bigDecimalVector.hashCode());
		result = prime * result
				+ ((integerVector == null) ? 0 : integerVector.hashCode());
		result = prime * result
				+ ((objectVector == null) ? 0 : objectVector.hashCode());
		result = prime * result
				+ ((stringVector == null) ? 0 : stringVector.hashCode());
		result = prime * result
				+ ((timestampVector == null) ? 0 : timestampVector.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		if (bigDecimalVector == null) {
			if (other.bigDecimalVector != null)
				return false;
		} else if (!bigDecimalVector.equals(other.bigDecimalVector))
			return false;
		if (integerVector == null) {
			if (other.integerVector != null)
				return false;
		} else if (!integerVector.equals(other.integerVector))
			return false;
		if (objectVector == null) {
			if (other.objectVector != null)
				return false;
		} else if (!objectVector.equals(other.objectVector))
			return false;
		if (stringVector == null) {
			if (other.stringVector != null)
				return false;
		} else if (!stringVector.equals(other.stringVector))
			return false;
		if (timestampVector == null) {
			if (other.timestampVector != null)
				return false;
		} else if (!timestampVector.equals(other.timestampVector))
			return false;
		return true;
	}
	
}