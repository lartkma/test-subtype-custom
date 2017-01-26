package org.gradle;

public class MySubObjectA extends MyObject {

	private String sender;
	
	public MySubObjectA(){
		super();
	}

	public MySubObjectA(int id, int moduleId, String name, String sender) {
		super(id, moduleId, name);
		this.sender = sender;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	@Override
	public String toString() {
		return "MySubObjectA [getId()=" + getId() + ", getModuleId()=" + getModuleId() + ", getName()=" + getName()
				+ ", sender=" + sender + "]";
	}
	
}
