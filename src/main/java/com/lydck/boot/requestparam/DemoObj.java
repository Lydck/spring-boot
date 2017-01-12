package com.lydck.boot.requestparam;

public class DemoObj {
	private int id;
	
	private String name;

	public DemoObj() {
		super();
	}

	public DemoObj(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
