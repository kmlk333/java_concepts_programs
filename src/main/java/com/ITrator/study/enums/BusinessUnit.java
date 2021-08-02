package com.ITrator.study.enums;

public enum BusinessUnit 
{
	ICG, GCG, IPB;
	
	/*
	 * public String getValue() { return this.getValue(); }
	 */
	
	public String getBuName() {
		return this.name();
	}
	

	/*
	 * public String getBuValue() { return this.toString(); }
	 */
	
	public String toString() {
		return this.name();
	}
}
