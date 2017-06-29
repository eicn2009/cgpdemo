package cc.cgp.demo.db.jdbc.sqlite;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/db/jdbc/sqlite")
public class SqliteDBRestController {
	@Autowired
	private SqliteDataService service;

	/**
	 * 
	 * @return
	 */
	@RequestMapping("/select")
	public String selecta() {
		Map map = service.select();
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
