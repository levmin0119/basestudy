package com.zhangyue.study.base.collectiondemo;

public class MyStringBuilder {

    //真正保存字符串内容
    private char[] value;

    //当前保存字符的数量
    private int count;

    private final static int DEFAULT_CAPACITY = 16;

    //创建默认大小的数组
    public MyStringBuilder() {
        value = new char[DEFAULT_CAPACITY];
    }

    /**
     * 追加数组
     * @param str
     */
    public void append(String str){
        if (str == null){
            str = "null";
        }
        if (count+str.length() > value.length){
            //执行扩容
            grow(count+str.length());
        }
        for (int i= 0; i< str.length(); i++){
            value[count] = str.charAt(i);
            count ++;
        }
    }
    private void grow(int minCapacity){
        //新的数组的容量设置为原来的两倍
        int newSize = value.length  * 2;
        // 如果还是不够
        if (newSize < minCapacity) {
            newSize = minCapacity;
        }
        //创建新的长度的数组
        char[] newValue = new char[newSize];
        //复制旧的数组数据
        for (int i = 0; i<count; i++){
            newValue[i] = value[i];
        }
        value = newValue;
        System.out.println("发生扩容，新容量：" + newSize);
    }
    @Override
    public String toString() {
        return new String(value,0,count);
    }

    /**
     * 获取长度
     */
    public int length() {
        return count;
    }

    public static void main(String[] args) {

        MyStringBuilder sb = new MyStringBuilder();

        sb.append("hello");

        sb.append(" ");

        sb.append("world");

        System.out.println(sb);

        System.out.println("长度：" + sb.length());

        // 测试扩容
        sb.append(" Java Java Java Java Java");

        System.out.println(sb);

        System.out.println("长度：" + sb.length());
    }
}
