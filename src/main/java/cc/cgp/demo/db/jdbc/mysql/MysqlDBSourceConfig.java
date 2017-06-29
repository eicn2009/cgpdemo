package cc.cgp.demo.db.jdbc.mysql;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class MysqlDBSourceConfig {
	
//	通过配置文件生成数据库的数据源
	
	
	@Bean(name="mysqlDBa")
//	@Qualifier("mysqlDBa")
	@ConfigurationProperties(prefix="spring.ds_mysql_a")
	public DataSource mysqldsa (){
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name="mysqlDBb")
//	@Qualifier("mysqlDBb")
	@Primary
	@ConfigurationProperties(prefix="spring.ds_mysql_b")
	public DataSource mysqldsb (){
		return DataSourceBuilder.create().build();
	}
	
//	生成jdbcTemple
//	@Bean(name="mysqlJDBCTempleA")
//	public JdbcTemplate getmysqlJDBCTempleA(@Qualifier("mysqlDBa")DataSource dataSource){
//		return new JdbcTemplate(dataSource);
//	}
//	@Bean(name="mysqlJDBCTempleB")
//	public JdbcTemplate getmysqlJDBCTempleB(@Qualifier("mysqlDBb")DataSource dataSource){
//		return new JdbcTemplate(dataSource);
//	}
	
}
