package com.zk.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.zk.user.User20170302;

public class Manger extends AbstractController {

	private User20170302 user;// 注入User对象

	public User20170302 getUser() {
		return user;
	}

	public void setUser(User20170302 user) {
		this.user = user;
	}

	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		user.printInfo();// 执行User中的信息打印方法
		return null;
	}
}
