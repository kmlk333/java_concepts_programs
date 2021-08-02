package com.ITrator.study.designpatterns.factory;

public abstract class Car {
	
	private CarType model = null;
	
	public Car(CarType model) {
		this.model = model;
		arrangeParts();
	}
	
	protected abstract void construct();
	
	private void arrangeParts()
	{
		System.out.println("arranging the parts");
	}
	
	 public CarType getModel() {
	        return model;
	    }
	 
	    public void setModel(CarType model) {
	        this.model = model;
	    }
}
