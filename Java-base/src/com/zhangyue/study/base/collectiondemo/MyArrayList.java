package com.zhangyue.study.base.collectiondemo;


import java.util.LinkedList;

/**
 * 自己实现一个ArrayList
 */
public class MyArrayList {

    //数组，真正保存元素的位置
    private Object[] elementData;

    //集合要有默认的大小
    private static final int DEFAULT_SIZE = 10;

    //当前集合的实际大小
    private int elementSize;

    public int getElementSize() {
        return this.elementSize;
    }

    //创建一个集合
    public MyArrayList() {
        this.elementData = new Object[DEFAULT_SIZE];
    }

    //开始新增元素，这里只是在末尾新增元素
    public void addElement(Object obj) {
        if (elementSize>=elementData.length){
            grow();
        }
        elementData[elementSize] = obj;
        elementSize++;
    }

    public Object getElement(int index) {
        return elementData[index];
    }

    public void deleteElement(int index) {
        if (index >= elementSize || index < 0) {
            System.out.println("当前数组为空无法删除");
            return;
        }
        for (int i = index; i < elementSize - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        // 清空最后一个元素
        elementData[elementSize - 1] = null;
        elementSize--;
    }

    //扩容其实，增加elementData的长度，然后将就得元素复制到新的数组集合中
    public void grow(){
        //老的数组的长度增加
        int growSize = elementData.length * 2;
        Object[] newObj = new Object[growSize];
        //将老的数据复制到新的数组中
        for (int i = 0;i<elementSize;i++){
            newObj[i] = elementData[i];
        }
        elementData = newObj;
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addElement(1);
        myArrayList.addElement(2);
        myArrayList.addElement(3);
        System.out.println("当前集合的大小：" + myArrayList.getElementSize());
        System.out.println("当前元素值：" + myArrayList.getElement(1));
        myArrayList.deleteElement(1);
        System.out.println("删除一个元素后，集合的大小：" + myArrayList.getElementSize());
        System.out.println("当前元素值：" + myArrayList.getElement(1));

        LinkedList<String> strings = new LinkedList<>();

    }
}
