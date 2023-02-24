package com.gm0910.board.mapper;

public class Test {
	//메소드 
	public int operate(int x, int  y) { 
		return x+y;
	}
	
	public void operate1(int x) {
		System.out.println(x + 10);
	}
	
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.operate(10,2);
		System.out.println(t1.operate(10, 1));
		t1.operate1(10);
	}
}
