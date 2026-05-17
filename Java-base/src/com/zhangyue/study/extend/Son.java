package com.zhangyue.study.extend;

public class Son extends Father {

    public String hobby;

    public Son(String surname, String name, String sex, String job) {
        super(surname, name, sex, job);
    }


    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String likeHobby() {
        return getName() + " like " + hobby;
    }
}
