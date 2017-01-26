package org.gradle;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public MyObject get(){
		return new MySubObjectB(10, 30, "TEST", true);
	}
	
	@RequestMapping(path="/", method=RequestMethod.POST)
	public MyObject post(@RequestBody MyObject data){
		System.out.println("Input is " + data);
		data.setName(data.getName() + " processed");
		return data;
	}

}
