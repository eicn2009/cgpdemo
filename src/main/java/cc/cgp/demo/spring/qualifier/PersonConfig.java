package cc.cgp.demo.spring.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
	@Bean("AnotherPersonA")
	public AnotherPerson getP1(){
		return new AnotherPerson("A");
	}
	
	@Bean("AnotherPersonB")
	public AnotherPerson getP2(){
		return new AnotherPerson("B");
	}

}
