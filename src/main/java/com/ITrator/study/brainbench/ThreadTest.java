package com.ITrator.study.practice.brainbench;

public class ThreadTest {
	public static void main(String[] args) {
		Thread t = new MyThread(){
			public void run(){
				System.out.println(" Case ");
			}
		};
		t.start();
	}
}
