package cc.cgp.demo;


import java.util.List;
import java.util.Map;

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
public class Application {
	
	private static Logger logger = Logger.getLogger(Application.class);
	

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(Application.class, args);
		logger.info("app is running...");
//		new SpringApplicationBuilder().sources(WebMvcConfig.class).run(args);
		
//		SpringApplication app2 = new SpringApplication(WebMvcConfig.class);
//	    app2.setBannerMode(Banner.Mode.OFF);
//	    app2.run(args);
		/*
		 //从mtb_userinfo表中获取用户头像信息添加到指定发faceSet中 
		 
		FaceSet1000 fs1000 = app.getBean(FaceSet1000.class);
		fs1000.test();
		 
		 */
		//
		
		
	}
}
