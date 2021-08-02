package com.ITrator.study.practice.brainbench;

class Test3 {
	int i = 0;

	public Test3() {
		i = 8;
	}

	public static void main(String args[]) {
		int i = 0;
		Test3 h = new Test3();
		while (h.i <= 10)
			h.doIt();
	}

	public static void doIt() {
		System.out.println("Hello");
	}
}
