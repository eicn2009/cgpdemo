package cc.cgp.demo.db.jdbc.mysql;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MysqlDataService {
	
	@Autowired
	@Qualifier("mysqlJDBCTempleA")
	private JdbcTemplate jta; 

	@Autowired
	@Qualifier("mysqlJDBCTempleB")
	private JdbcTemplate jtb; 

	public Map<String, Object> selectA(){
		Map<String, Object> map = new HashMap<>();
		String sql = "select * from usermaster limit 10";
		map = jta.queryForMap(sql);
		return map;
	}
	
	public Map<String, Object> selectB(){
		Map<String, Object> map = new HashMap<>();
		String sql = "select * from usermaster limit 10";
		map = jtb.queryForMap(sql);
		return map;
	}
}
