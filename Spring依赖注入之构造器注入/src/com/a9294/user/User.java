package com.a9294.user;

public class User {
    
    private String name;//�û�����
    private Integer age;//����
    private String sex;//�Ա�
    //���췽��
    public User(String name,Integer age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    //���JavaBean������ֵ����
    public void printInfo(){
        System.out.println("�û�������"+name);//����û�������
        System.out.println("�û����䣺"+age);//����û�������
        System.out.println("�û��Ա�"+sex);//����û����Ա�
    }
}
