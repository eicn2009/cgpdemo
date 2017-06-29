package cc.cgp.demo.spring.qualifier;

import org.springframework.stereotype.Service;

@Service("teacher")
public class TeacherServiceImpl implements PersonService {

	@Override
	public String printName(String name) {
		// TODO Auto-generated method stub
		return "Teacher name is "+name;
	}

}
