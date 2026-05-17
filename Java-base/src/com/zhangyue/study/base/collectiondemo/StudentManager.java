package com.zhangyue.study.base.collectiondemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 集合练习
 */
public class StudentManager<T extends Student> {

    private List<T> studentList;

    /**
     * 通过构造器选择集合类型
     *
     * @param useArrayList
     */
    public StudentManager(boolean useArrayList) {
        if (useArrayList) {
            studentList = new ArrayList<>();
        } else {
            studentList = new LinkedList<>();
        }
    }

    /**
     * 添加学生
     * @param student
     */
    public void addStudent(T student) {
        studentList.add(student);
        System.out.println("添加学生" + student + "成功");
    }

    public void removeStudent(String name){
        T found = null;
        for (T t : studentList) {
            if (t.getName().equals(name)){
                found = t;
                break;
            }
        }
        if (found != null){
            studentList.remove(found);
            System.out.println("删除学生："+found.getName());
        }else {
            System.out.println("没有找到学生："+ name);
        }
    }

    /**
     * 查找学生
     * @param name
     * @return
     */
    public T findStudent(String name){
        for (T t : studentList) {
            if (t.getName().equals(name)){
                return t;
            }
        }
        return null;
    }

    public void showAllStudent(){
        System.out.println("=====学生列表=====");
        for (T t : studentList){
            System.out.println(t);
        }
        System.out.println("=================");
    }

    public int getStudentCount(){
        return studentList.size();
    }

    public static void main(String[] args){
        StudentManager studentManager = new StudentManager(true);
        studentManager.addStudent(new Student("张钺",28));
        studentManager.addStudent(new Student("李金芳",28));
        studentManager.addStudent(new Student("Jack",28));
        studentManager.addStudent(new Student("Tom",28));

        studentManager.showAllStudent();
        Student student = studentManager.findStudent("李金芳");
        System.out.println(student.toString());
        System.out.println("当前学校有："+studentManager.getStudentCount()+"个学生");
        studentManager.removeStudent("Tom");
        System.out.println("当前学校剩余："+studentManager.getStudentCount()+"个学生");

    }
}
