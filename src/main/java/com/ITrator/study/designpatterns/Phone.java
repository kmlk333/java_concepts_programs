package com.ITrator.study.designpatterns;

public class Phone {
	
	private String phoneName;
	private String os;
	private int imeiNumber;
	private float screenSize;
	private String modelName;
	
	public Phone(PhoneBuilder phoneBuiler) {
		super();
		this.phoneName = phoneBuiler.phoneName;
		this.os = phoneBuiler.os;
		this.imeiNumber = phoneBuiler.imeiNumber;
		this.screenSize = phoneBuiler.screenSize;
		this.modelName = phoneBuiler.modelName;
	}

	@Override
	public String toString() {
		return "Phone [phoneName=" + phoneName + ", os=" + os + ", imeiNumber=" + imeiNumber + ", screenSize="
				+ screenSize + ", modelName=" + modelName + "]";
	}
	
	
	public static class PhoneBuilder {
		private String phoneName;
		private String os;
		private int imeiNumber;
		private float screenSize;
		private String modelName;
		
		public PhoneBuilder(String phoneName, String modelName) {
			this.phoneName = phoneName;
			this.modelName = modelName;
		}
		
		public PhoneBuilder os(String os) {
			this.os = os;
			return this;
		}
		
		public PhoneBuilder screenSize(float screenSize) {
			this.screenSize = screenSize;
			return this;
		}
		public PhoneBuilder imeiNumber(int emeiNumber) {
			this.imeiNumber = emeiNumber;
			return this;
		}
		
		
		public Phone build() {
			Phone phone = new Phone(this);
			
			return phone;
		}
	}
	
	
	
	
}
