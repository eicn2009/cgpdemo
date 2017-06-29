package cc.cgp.demo.db.jdbc.mysql;

/**
 目前测试的结果来看，使用service定义的bean，可以不用@primary
 从多数据源的配置上来看，目前还依赖于 @primary 与 @qualifier 一起使用
   
   <!-- 用于支持热部署，便于开发调试 -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
		</dependency>
		在配置文件pom.xml中加入如上依赖，springboot项目将能实现热部署；
用于支持mysql的jdbc连接，
<!-- 用于支持spring jdbc -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-jdbc</artifactId>
		</dependency>
<!-- tag::mysql -->
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
		</dependency>
<!-- end::mysql -->	


MysqlDBSourceConfig  从配置文件中获取数据源；
	配置如下：（applycation.yml)
			spring:
			  ds_mysql_a:
			    url: jdbc:mysql://192.168.0.202:3306/mokodb?useUnicode=true&characterEncoding=UTF-8
			    driverClassName: com.mysql.jdbc.Driver
			    username: cgp
			    password: cgpdb
			    initialSize: 10
			    max-active: 350
			    max-idle: 250
			    min-idle: 90
			    validation-query: SELECT 1
			    validationInterval: 30000
			    removeAbandoned: true
			    removeAbandonedTimeout: 55
			    testOnBorrow: true
			    logAbandoned: true
			  ds_mysql_b:
			    url: jdbc:mysql://192.168.125.55:3306/mokodb?useUnicode=true&characterEncoding=UTF-8
			    driverClassName: com.mysql.jdbc.Driver
			    username: test
			    password: test
			    initialSize: 10
			    max-active: 350
			    max-idle: 250
			    min-idle: 90
			    validation-query: SELECT 1
			    validationInterval: 30000
			    removeAbandoned: true
			    removeAbandonedTimeout: 55
			    testOnBorrow: true
			    logAbandoned: true
			    
MysqlJDBCTempleConfig 通过获得的数据源，注入获得jdbctemple

MysqlDataService 通过注入jdbctemple 进行数据库查询等操作

MysqlDBRestController 通过注入service服务，接受相关restful请求，返回相应的结果；


	
 */
public class Readme {
}
