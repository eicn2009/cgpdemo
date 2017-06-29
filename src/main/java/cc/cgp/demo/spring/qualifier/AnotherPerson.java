package cc.cgp.demo.spring.qualifier;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.sym.Name;


public class AnotherPerson {
	
	private String name;
	
	public AnotherPerson(String name){
		this.name = name;
	}

	public String getName() {
		this.name = "AnotherPerson name is "+name;
		return this.name;
	}

}
