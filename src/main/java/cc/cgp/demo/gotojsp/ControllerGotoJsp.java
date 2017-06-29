package cc.cgp.demo.gotojsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerGotoJsp {

	@RequestMapping("/gotos1")
	public String gotos1(){
		return "/index.jsp";
	}
	
	@RequestMapping("/vue")
	public String vuePage(){
		return "/vue/vuePage.jsp";
	}
}
