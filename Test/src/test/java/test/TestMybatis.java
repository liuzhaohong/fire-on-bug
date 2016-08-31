package test;

import java.util.List;

import lzh.model.User;
import lzh.service.RoleService;
import lzh.service.UserService;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runners.JUnit4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
/**
 * JUnit测试方式
 * @author liuzhaohong
 * @version V1.0 2016-3-15
 */
public class TestMybatis {
	
	private static final Logger logger = Logger.getLogger(TestMybatis.class); 
	
	private ApplicationContext ac;
	private UserService userService;
	private RoleService roleService;
	@Before
	public void before(){
		ac = new ClassPathXmlApplicationContext(new String[] { "spring.xml", "spring-mybatis.xml" });
		userService = (UserService) ac.getBean("userService");
		roleService = (RoleService) ac.getBean("roleService");
	}
	@Test
	public void test1() {
		User user = userService.getUserById(1);
		logger.info(JSON.toJSONStringWithDateFormat(user, "yyyy-MM-dd HH:mm:ss"));
		System.out.println("user----"+user.getUsername());
	}
	@Test
	public void test2(){
		System.out.println("test2");
		List<User> list = userService.getAll();
		logger.info(list);
		logger.info(JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
		System.out.println("list");
	}
	@Test
	public void test3(){
		System.out.println("test3");
		List<User> list = userService.getAll2();
		logger.info(list);
		logger.info(JSON.toJSONString(list));
	}
	@Test
	public void test4(){
		System.out.println("test4");
		List<User> list = userService.getAll3();
		logger.info(JSON.toJSONString(list));
	}
//	@Test
//	public void test5(){
//		System.out.println("test5");
//		User user = new User();
//		user.setUserid(10);
//		user.setPassword("1234");
//		user.setUsername("路飞");
//		userService.insert(user);
//	}
}
	