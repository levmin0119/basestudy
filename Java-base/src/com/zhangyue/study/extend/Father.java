package com.zhangyue.study.extend;

public class Father {

    /**
     * 姓氏
     */
    private String surname;

    /**
     * 名字
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 工作
     */
    private String job;

    public Father(String surname, String name, String sex, String job) {
        this.surname = surname;
        this.name = name;
        this.sex = sex;
        this.job = job;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
