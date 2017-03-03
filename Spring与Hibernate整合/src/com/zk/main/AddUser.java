package com.zk.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.zk.dao.UserDAO;
import com.zk.user.User;

public class AddUser {
	// 添加用户信息
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");// 获取配置文件
		BeanFactory factory = new XmlBeanFactory(resource);
		UserDAO userDAO = (UserDAO) factory.getBean("userDAO");// 获取UserDAO
		User user = new User();
		user.setName("何颖颖");// 设置姓名
		user.setAge(25);// 设置年龄
		user.setSex("女");// 设置性别
		userDAO.insert(user);// 执行用户添加的方法
		System.out.println("添加成功！");
	}
}
