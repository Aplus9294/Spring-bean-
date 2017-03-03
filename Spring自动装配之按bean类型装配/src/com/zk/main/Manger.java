package com.zk.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.zk.user.PrintInfo;

public class Manger {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml"); // 装载配置文件
		BeanFactory factory = new XmlBeanFactory(resource);
		PrintInfo printInfo = (PrintInfo) factory.getBean("printInfo"); // 获取Bean
		printInfo.PrintUser();// 输出JavaBean的属性值
	}
}
