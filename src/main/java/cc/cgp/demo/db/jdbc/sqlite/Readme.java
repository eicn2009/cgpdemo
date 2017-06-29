package cc.cgp.demo.db.jdbc.sqlite;

/**
   
   
   SqliteDBSourceConfig  从配置文件中获取数据源；
	配置如下：（applycation.yml)
   ds_sqlite:
    #url: jdbc:sqlite:timeDB.sqlite
    url: jdbc:sqlite:/Users/cgp/worksapcemoko/cgpdemo/src/main/resources/timeDB.sqlite
    driverClassName: org.sqlite.JDBC
    
    SqliteJDBCTempleConfig 通过获得的数据源，注入获得jdbctemple
 
 SqliteDataService 通过注入jdbctemple 进行数据库查询等操作
 
 SqliteDBRestController 通过注入service服务，接受相关restful请求，返回相应的结果；
 
 SqliteStart 用于启动sqlite相关应用
 */
public class Readme {
}
