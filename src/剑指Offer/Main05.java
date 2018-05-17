package 剑指Offer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by acer on 2016/9/9.
 */
/*
   从尾到头打印链表
   题目描述

    输入一个链表，从尾到头打印链表每个节点的值。
    输入描述:
    输入为链表的表头


    输出描述:
    输出为需要打印的“新链表”的表头
 */
public class Main05 {
    Node head=null;
    class Node{
        int data;
        Node next=null;
        public Node(int data) {
            this.data = data;
        }
    }
    public  void addElement(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return ;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
    }
    ArrayList<Integer> list=new ArrayList<Integer>();
    public  ArrayList<Integer> printListFromTailToHead(Node node){
        if(node!=null){
            if(node.next!=null){
                printListFromTailToHead(node.next);
            }
            list.add(node.data);
        }

        return list;
    }

    public void print(){
        if(head==null){
            return ;
        }
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }


    }
    public static void main(String[] args) {
        Main05 m=new Main05();
        Scanner sc=new Scanner(System.in);
        int data= sc.nextInt();
        while(data!=0){
           m.addElement(data);
            data= sc.nextInt();
        }
        System.out.println("输入数据完");
        ArrayList<Integer> list=m.printListFromTailToHead(m.head);
        System.out.println("数组大小是"+list.size());
//        m.print();
    }
}
