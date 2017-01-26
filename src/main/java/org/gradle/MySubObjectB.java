package org.gradle;

public class MySubObjectB extends MyObject {
	
	private boolean valid;
	
	public MySubObjectB(){
		super();
	}

	public MySubObjectB(int id, int moduleId, String name, boolean valid) {
		super(id, moduleId, name);
		this.valid = valid;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	@Override
	public String toString() {
		return "MySubObjectB [getId()=" + getId() + ", getModuleId()=" + getModuleId() + ", getName()=" + getName()
				+ ", valid=" + valid + "]";
	}	

}
