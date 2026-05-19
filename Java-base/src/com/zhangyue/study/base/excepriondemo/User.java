package com.zhangyue.study.base.excepriondemo;

public class User {
    private String username;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void login(String username, String password) {
        if (username.equals(this.username) && password.equals(this.password)) {
            System.out.println("登录成功！！");
        }else {
            throw new RuntimeException("用户名或密码错误！！");
        }
    }
    public static void main(String [] args){
        User user = new User();
        user.setUsername("zhangyue");
        user.setPassword("123456");
        try {
            user.login("zhangyue","123451");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"username\":\"zhangyue\",");
    }
}
