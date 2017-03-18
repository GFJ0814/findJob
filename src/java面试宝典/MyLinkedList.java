package java面试宝典;

import java.util.Hashtable;

/**
 * Created by acer on 2017/3/17.
 * 16:48
 * 该类主要是学习常用的链表操作
 */
public class MyLinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    //添加节点
    public Node addNode(int data) {
        if (head == null) {
            head = new Node(data);
            return head;
        }
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new Node(data);
        return head;
    }

    //按照索引删除节点
    public void delNodeByIndex(int index) {
        if (index < 1 || index > size()) {
            throw new RuntimeException("索引越界");
        }
        if (index == 1) {
            head = head.next;
            return;
        }
        Node p = head;
        Node q = null;
        int i = 1;
        while (i < index) {
            q = p;
            p = p.next;
            i++;
        }
        q.next = p.next;
        p = null;
    }


    //统计链表中的节点元素个数
    public int size() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        Node p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    //对链表进行排序，返回排序后的头结点
    public Node sortLinkedList(Node head) {
        Node cur = head;
        int temp = 0;
        while (cur != null) {
            Node p = cur.next;
            while (p != null) {
                if (p.data < cur.data) { //从小到大排列
                    temp = p.data;
                    p.data = cur.data;
                    cur.data = temp;
                }
                p = p.next;
            }
            cur = cur.next;
        }
        return head;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[\t");
        if (head == null) {
            throw new RuntimeException("链表为空");
        }
        Node temp = head;
        while (temp != null) {
            stringBuffer.append(temp.data + "\t");
            temp = temp.next;
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }


    //从链表中删除重复多余的元素，借助于hashTale数据结构
    public void distinctNodeByHash() {
        Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
        Node temp = head;
        Node p = null;//用节点P保存上一个节点
        while (temp != null) {
            if (hashtable.containsKey(temp.data)) {
                p.next = temp.next;
            } else {
                hashtable.put(temp.data, 1);
            }
            p = temp;
            temp = temp.next;
        }
    }

    //去除重复元素使用自身算法
    public void distinctNodeByMyselfPre() {
        Node cur = head.next;
        while (cur!= null) {
            Node p = head;
            Node q = null;
            while (p.data != cur.data) {
                q = p;
                p = p.next;
            }
            q.next = p.next;
            cur =cur.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode(10);
        myLinkedList.addNode(5);
        myLinkedList.addNode(5);
        myLinkedList.addNode(9);
        myLinkedList.addNode(9);
        myLinkedList.addNode(3);
        System.out.println(myLinkedList.size() + "个元素为：" + myLinkedList.toString());

        //按照索引山删除节点
        /* myLinkedList.delNodeByIndex(1);
        System.out.println(myLinkedList.size() + "个元素为：" + myLinkedList.toString());*/

        //对节点进行排序
        myLinkedList.sortLinkedList(myLinkedList.head);
        System.out.println(myLinkedList.toString());

        //借助hashTale去重复
      /*  myLinkedList.distinctNodeByHash();
        System.out.println(myLinkedList.toString());*/

        myLinkedList.distinctNodeByMyselfPre();
        System.out.println(myLinkedList);
    }


}
