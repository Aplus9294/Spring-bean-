package com.zk.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zk.user.User;

public class UserDAO extends HibernateDaoSupport {
	// �����û��ķ���
	public void insert(User user) {
		this.getHibernateTemplate().save(user);
	}
}
