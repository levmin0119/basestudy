package com.zhangyue.study.base.collectiondemo;

import java.util.HashMap;

public class MyLinkedList {

    private NodeDemo head;

    /**
     * 新增元素
     *
     * @param objectData
     */
    public void add(Object objectData) {
        NodeDemo nodeDemo = new NodeDemo(objectData);
        //如果是空，则直接设置为头节点
        if (head == null) {
            head = nodeDemo;
            return;
        }
        NodeDemo temp = head;
        //找到最后一个节点的位置
        while (temp.getNextNode() != null) {
            temp = temp.getNextNode();
        }
        //将最后一个节点的位置修改为新的数据
        temp.setNextNode(nodeDemo);
    }

    public void print() {
        NodeDemo temp = head;
        while (temp != null) {
            System.out.println(temp.getObjData());
            temp = temp.getNextNode();
        }
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("zhangyue");
        myLinkedList.add("张钺");
        myLinkedList.add("levmin");
        System.out.println(myLinkedList.toString());
        myLinkedList.print();

        NodeDemo demo = new NodeDemo("zhangyue");
        NodeDemo temp = new NodeDemo("zhangyue");
        System.out.println(demo.equals(temp));

        HashMap<Object, Object> map = new HashMap<>();
        map.put("zhangyue", demo);
    }

}
