package oop;

public abstract class Person {
	String name;
	String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	abstract String getName();
	abstract String getAddress();
	
	void setAddress(String address) {
		this.address = address;
	}
	
	String toStr() {
		return this.name+"("+this.address+")";
	}
}
