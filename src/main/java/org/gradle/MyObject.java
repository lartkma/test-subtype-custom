package org.gradle;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;

@JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "moduleId")
@JsonTypeIdResolver(MyObjectTypeResolver.class)
public class MyObject {
	
	private int id;
	private int moduleId;
	private String name;
	
	public MyObject(){
	}
	
	public MyObject(int id, int moduleId, String name) {
		super();
		this.id = id;
		this.moduleId = moduleId;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyObject [id=" + id + ", moduleId=" + moduleId + ", name=" + name + "]";
	}
}
