package cc.cgp.demo.spring.qualifier;

import javax.print.attribute.standard.PrinterName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/spring/qualifier/")
public class PersonRestController {

	@Autowired
	@Qualifier("student")
	private PersonService s;

	@Autowired
	@Qualifier("teacher")
	private PersonService t;
	
	@Autowired
	@Qualifier("AnotherPersonA")
	private AnotherPerson pA;
	@Autowired
	@Qualifier("AnotherPersonB")
	private AnotherPerson pB;
	
	
	@RequestMapping("another/name/{name}/type/{type}")
	public String PrinterAnotherName(@PathVariable("name") String name, @PathVariable("type") String type) {
		String str = "";
		if (!StringUtils.isEmpty(type)) {
			if ("A".equals(type)) {
				str = " client print name : " + pA.getName();
			} else if ("B".equals(type)) {
				str = " client print name : " + pB.getName();
			}
		}
		return str;
	}

	@RequestMapping("name/{name}/type/{type}")
	public String PrinterName(@PathVariable("name") String name, @PathVariable("type") String type) {
		String str = "";
		if (!StringUtils.isEmpty(type)) {
			if ("s".equals(type)) {
				str = " client print name : " + s.printName(name);
			} else if ("t".equals(type)) {
				str = " client print name : " + t.printName(name);
			}
		}
		return str;
	}
}
