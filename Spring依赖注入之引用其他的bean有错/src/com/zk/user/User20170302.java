package com.zk.user;

public class User20170302 {

	private String name;// �û�����
	private Integer age;// ����
	private String sex;// �Ա�

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	// ���JavaBean������ֵ����
	public void printInfo() {
		System.out.println("�û�������" + name);// ����û�������
		System.out.println("�û����䣺" + age);// ����û�������
		System.out.println("�û��Ա�" + sex);// ����û����Ա�
	}
}
