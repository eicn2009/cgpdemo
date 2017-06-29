package cc.cgp.demo.spring.qualifier;

/**
 
验证spring qualifier注解

AnotherPerson 定义一个bean类
PersonConfig 使用java配置生成AnotherPerson的两个对象；命名为 AnotherPersonA AnotherPersonB
PersonService 定义一个服务接口
StudentServiceImpl   接口PersonService  的实现 初始化对象为student
TeacherServiceImpl   接口PersonService  的实现 初始化对象为teacher
PersonRestController 注入 student teacher AnotherPersonA AnotherPersonB 进行验证

 */
public class Readme {
}
