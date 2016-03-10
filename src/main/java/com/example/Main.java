package com.example;

public class Main {
	
	private static Main instance;

	public static void main(String[] args) {
		instance = new Main();
		instance.doSomething(1, 2);
	}
	
	public int doSomething(int x, int y){
		return x+y;
	}

}
