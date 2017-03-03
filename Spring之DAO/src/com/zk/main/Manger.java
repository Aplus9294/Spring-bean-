package com.zk.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.zk.dao.UserDAO;
import com.zk.user.User;

public class Manger {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml"); // 装载配置文件
		BeanFactory factory = new XmlBeanFactory(resource);
		User user = new User();// 实例化User对象
		user.setName("张凯");// 设置姓名
		user.setAge(new Integer(26));// 设置年龄
		user.setSex("男");// 设置性别
		UserDAO userDAO = (UserDAO) factory.getBean("userDAO");// 获取UserDAO
		userDAO.inserUser(user);// 执行添加方法
		System.out.println("数据添加成功!!!");
	}
}
