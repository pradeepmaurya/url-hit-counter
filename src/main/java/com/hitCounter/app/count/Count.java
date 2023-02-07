package com.hitCounter.app.count;

public class Count {

	private int count;

	public int getCount() {
		return count;
	}

	public int setCount(int count) {
		return this.count = setCount(count);
	}

	public Count(int count) {
		super();
		this.count = count;
	}

	public Count() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Count [count=" + count + "]";
	}
	
}
