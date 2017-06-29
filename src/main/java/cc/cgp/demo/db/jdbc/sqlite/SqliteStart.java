package cc.cgp.demo.db.jdbc.sqlite;


import org.apache.log4j.Logger;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;



/**
 * 程序启动入口
 */
@SpringBootApplication
public class SqliteStart {
	
	private static Logger logger = Logger.getLogger(SqliteStart.class);

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(SqliteStart.class, args);
		logger.info("app is running...");
//		new SpringApplicationBuilder().sources(WebMvcConfig.class).run(args);
		
//		SpringApplication app2 = new SpringApplication(WebMvcConfig.class);
//	    app2.setBannerMode(Banner.Mode.OFF);
//	    app2.run(args);
	}
}
