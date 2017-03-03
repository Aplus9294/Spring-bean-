package com.a9294.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.a9294.user.User;

public class Manger {
    
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");            //װ�������ļ�
        BeanFactory factory = new XmlBeanFactory(resource);
        User user = (User) factory.getBean("user");                                    //��ȡBean
        user.printInfo();//���JavaBean������ֵ
    }   
}
