package org.gradle;

import org.springframework.stereotype.Component;

@Component
public class ModuleTypeProvider {

	public String getType(int moduleId){
		switch(moduleId){
		case 10:
			return "TYPE_A";
		case 20:
			return "TYPE_B";
		default:
			return "UNKNOWN";
		}
	}
	
}
