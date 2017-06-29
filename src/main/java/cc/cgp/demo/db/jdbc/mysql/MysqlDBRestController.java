package cc.cgp.demo.db.jdbc.mysql;

import java.nio.channels.SelectableChannel;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/db/jdbc/mysql")
public class MysqlDBRestController {
	@Autowired
	private MysqlDataService service;

	/**
	 * 
	 * @return
	 */
	@RequestMapping("/select/a")
	public String selecta() {
		Map map = service.selectA();
		return "mysql query one : " + map.toString();
	}
	
	@RequestMapping("/select/b")
	public String selectb() {
		Map map = service.selectB();
		return "mysql query one : " + map.toString();
	}
	
	
	@RequestMapping("/add")
	public String add(){
		return "mysql add";
	}
	@RequestMapping("/update")
	public String update(){
		return "mysql update";
	}
	
	@RequestMapping("/delete")
	public String delete(){
		return "mysql delete";
	}

}
