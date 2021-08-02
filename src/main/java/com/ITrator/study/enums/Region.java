package com.ITrator.study.enums;

public enum Region 
{
	REGION_APAC("APAC"),
	REGION_EMEA("EMEA"),
	REGION_MEXICO("MEXICO"),
	REGION_LATAM("LATAM"),
	REGION_NAM("NAM");
	
	private String region;
	
	Region(String region){
		this.region = region;
	}
	
	public String toString() {
		return this.region;
	}
}
