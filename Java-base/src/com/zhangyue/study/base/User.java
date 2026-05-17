package com.zhangyue.study.base;

public class User {

    private String name;

    private String password;

    private int age;

    /**
     * 将方法的参数的值 赋值给 成员变量
     *
     * @param name
     * @param age
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String userInfo() {
        return "名字：" + name + " 年龄：" + age;
    }

    public void setPassword(String password) {
        if (password.length() < 6) {
            System.out.println("密码长度小于6位，请重新输入");
        } else {
            this.password = password;
        }
    }

    public String getName() {
        return this.name;
    }


    public static void main(String[] args) {

        /**
         * Java创建对象的时候，会现在堆内存中开辟空间
         * 比如 User user1 = new User("zhangyue",29)
         * 是先在内存中开辟空间 并且给一个默认值
         * user1 name=null age=0 password=null
         *
         * 然后调用类的构造方法，执行this.name=name,this.age=age
         * 最后返回对象的 “内存地址”，然后User user1 保存这个内存地址
         *
         * User user：代表引用
         * new User()：代表具体的实体对象
         *
         *
         */
        User user1 = new User("张钺", 29);
        User user2 = new User("李金芳", 29);
        String userInfo = user1.userInfo();
        System.out.println(userInfo);
        user1.setPassword("zy5201ljf&");
        user2.setPassword("123qw");
        System.out.println(user1.getName());
        System.out.println(user2.getName());

        User user3 = user1;
        System.out.println(user1 + ":" + user1.getName());
        System.out.println(user3 + ":" + user3.getName());
    }


}
