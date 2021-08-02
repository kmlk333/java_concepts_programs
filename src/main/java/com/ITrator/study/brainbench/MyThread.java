package com.ITrator.study.practice.brainbench;

public class MyThread extends Thread {
	MyThread() {
		System.out.print(" Sample");
	}

	public void run() {
		System.out.print(" example");
	}

	public void run(String s) {
		System.out.print(" model");
	}
}
