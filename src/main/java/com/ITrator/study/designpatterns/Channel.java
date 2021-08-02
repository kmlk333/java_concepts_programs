package com.ITrator.study.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	public String title;
	private List<Subscriber> subs = new ArrayList<>();
	
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}
	
	public void unsubscribe(Subscriber sub) {
		subs.remove(sub);
	}
	
	public void notifySubscriber() {
		for(Subscriber sub : subs) {
			sub.update();
		}
	}
	
	public void updload(String title) {
		this.title = title;
		notifySubscriber();
		System.out.println(" Video Uploaded");
	}
}
