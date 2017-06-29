package cc.cgp.demo.db.jdbc.sqlite;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SqliteDataService {
	
	@Autowired
	@Qualifier("sqliteJDBCTemple")
	private JdbcTemplate jta; 


	public Map<String, Object> select(){
		Map<String, Object> map = new HashMap<>();
		String sql = "select * from timelog limit 1";
		map = jta.queryForMap(sql);
		return map;
	}
	
}
