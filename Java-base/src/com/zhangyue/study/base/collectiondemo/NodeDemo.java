package com.zhangyue.study.base.collectiondemo;


/**
 * linkedlist 是一个节点连接着一个节点，每个节点（Node）中保存的是下一个节点的位置
 * <p>
 * 链表保存的是一个一个节点对象
 * 节点保存的是当前的数据和下一个数据的节点的引用
 */
public class NodeDemo {
    private Object objData;

    private NodeDemo nextNode;

    public NodeDemo(Object objData) {
        this.objData = objData;
    }

    public void setNextNode(NodeDemo nextNode) {
        this.nextNode = nextNode;
    }

    public NodeDemo getNextNode() {
        return nextNode;
    }

    public void setObjData(Object objData) {
        this.objData = objData;
    }

    public Object getObjData() {
        return objData;
    }

}
