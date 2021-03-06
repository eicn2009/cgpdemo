package cc.cgp.demo.db.jdbc.sqlite;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class SqliteJDBCTempleConfig {
	
	@Autowired
	@Qualifier("sqliteds")
	private DataSource ds;
	
//	生成jdbcTemple
	@Bean(name="sqliteJDBCTemple")
//	@Qualifier("sqliteJDBCTemple")
	public JdbcTemplate getmysqlJDBCTemple(){
		return new JdbcTemplate(ds);
	}
}
