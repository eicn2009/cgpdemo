package cc.cgp.demo.db.jdbc.mysql;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class MysqlJDBCTempleConfig {
	
	@Autowired
	@Qualifier("mysqlDBa")
	private DataSource dsa;
	
	@Autowired
	@Qualifier("mysqlDBb")
	private DataSource dsb;
	
//	生成jdbcTemple
	@Bean(name="mysqlJDBCTempleA")
//	@Qualifier("mysqlJDBCTempleA")
	public JdbcTemplate getmysqlJDBCTempleA(){
		return new JdbcTemplate(dsa);
	}
	@Bean(name="mysqlJDBCTempleB")
//	@Qualifier("mysqlJDBCTempleB")
	public JdbcTemplate getmysqlJDBCTempleB(){
		return new JdbcTemplate(dsb);
	}

}
