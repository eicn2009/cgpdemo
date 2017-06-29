package cc.cgp.demo.spring.qualifier;

import org.springframework.stereotype.Service;

@Service("student")
public class StudentServiceImpl implements PersonService {

	@Override
	public String printName(String name) {
		// TODO Auto-generated method stub
		return "Student name is "+name;
	}

}
