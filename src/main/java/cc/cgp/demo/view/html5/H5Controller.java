/**
 * cc.cgp.demo.view.html5.H5Controller.java
 * 2017年6月30日 下午8:36:14 by cgp
 */
package cc.cgp.demo.view.html5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * cc.cgp.demo.view.html5.H5Controller.java
 * 2017年6月30日 下午8:36:14 by cgp
 */
@Controller
@RequestMapping("/html5")
public class H5Controller {

	@RequestMapping("/formField")
	public String showHtml5Field(){
		return "/html5/formField.jsp";
	}
	@RequestMapping("/float")
	public String showHtml5Float(){
		return "/html5/float.jsp";
	}
	@RequestMapping("/float1")
	public String showHtml5Float1(){
		return "/html5/float1.jsp";
	}
}

