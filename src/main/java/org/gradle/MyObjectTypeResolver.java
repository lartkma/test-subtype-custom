package org.gradle;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase;

public class MyObjectTypeResolver extends TypeIdResolverBase {
	
	@Autowired
	private ModuleTypeProvider provider;

	public String idFromValue(Object value) {
		System.out.println("idFromValue, input is " + value);
		MyObject entry = (MyObject)value;
		return ""+entry.getModuleId();
	}

	public String idFromValueAndType(Object value, Class<?> suggestedType) {
		System.out.println("idFromValueAndType, input is " + value + " and with type " + suggestedType.getName());
		MyObject entry = (MyObject)value;
		return ""+entry.getModuleId();
	}
	
	@Override
	public JavaType typeFromId(DatabindContext context, String id) {
		System.out.println("typeFromId, id is " + id);
		switch(provider.getType(Integer.parseInt(id))){
		case "TYPE_A":
			return context.constructType(MySubObjectA.class);
		case "TYPE_B":
			return context.constructType(MySubObjectB.class);
		default:
			throw new UnsupportedOperationException("No handler for type " + id);
		}
	}

	public Id getMechanism() {
		return JsonTypeInfo.Id.NAME;
	}

}
