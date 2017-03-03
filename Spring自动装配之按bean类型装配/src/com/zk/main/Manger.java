package com.zk.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.zk.user.PrintInfo;

public class Manger {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml"); // װ�������ļ�
		BeanFactory factory = new XmlBeanFactory(resource);
		PrintInfo printInfo = (PrintInfo) factory.getBean("printInfo"); // ��ȡBean
		printInfo.PrintUser();// ���JavaBean������ֵ
	}
}
