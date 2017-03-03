package com.zk.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.zk.dao.UserDAO;
import com.zk.user.User;

public class AddUser {
	// ����û���Ϣ
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");// ��ȡ�����ļ�
		BeanFactory factory = new XmlBeanFactory(resource);
		UserDAO userDAO = (UserDAO) factory.getBean("userDAO");// ��ȡUserDAO
		User user = new User();
		user.setName("��ӱӱ");// ��������
		user.setAge(25);// ��������
		user.setSex("Ů");// �����Ա�
		userDAO.insert(user);// ִ���û���ӵķ���
		System.out.println("��ӳɹ���");
	}
}
