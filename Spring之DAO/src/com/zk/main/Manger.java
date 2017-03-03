package com.zk.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.zk.dao.UserDAO;
import com.zk.user.User;

public class Manger {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml"); // װ�������ļ�
		BeanFactory factory = new XmlBeanFactory(resource);
		User user = new User();// ʵ����User����
		user.setName("�ſ�");// ��������
		user.setAge(new Integer(26));// ��������
		user.setSex("��");// �����Ա�
		UserDAO userDAO = (UserDAO) factory.getBean("userDAO");// ��ȡUserDAO
		userDAO.inserUser(user);// ִ����ӷ���
		System.out.println("������ӳɹ�!!!");
	}
}
