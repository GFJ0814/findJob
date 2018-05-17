package java基础;

import java.util.Scanner;

/**
 * Created by acer on 2016/9/19.
 */
public class Main011 {
    class Node {
        public  int Element;
        public  Node next;
        public Node(int Element,Node next){
            this.Element=Element;
            this.next=next;
        }

    }
    //定义头结点
    private Node head;
    public Node getHead(){
        return this.head;
    }
    private int size;
    //定义操作:
    //添加元素
    public  void add(int e){
        //创建一个新的节点
        Node node=new Node(e,null);
        //如果头结点为空，那么就直接将第一个节点作为头结点
        if(head==null){
            head=node;
            size++;
            return;
        }
        //如果头结点不为空，那么就找到最后一个节点,将新来的元素加在这个最后一个节点的后面
        Node  temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        size++;
    }
    //按照索引位置新增的实现
    public void add(int index,int e){
        //1.找到这个节点:
        Node temp=head;
        if(index>=size){
            throw new RuntimeException("outOfIndexException--超出链表的所允许的下标范围");
        }
        //如果是插在头结点的位置，那么就让该节点的下一个节点指向头结点，并且把这个新加入的节点作为头结点
        if(index==0){
            Node node=new Node(e,head);
            head=node;
            return;
        }
        //如果插入的节点位置不是头结点，那么首先找到索引对应位置的前一个节点，这个节点的新加入的节点的后继应该是
        //前一个节点的后继，然后，前一个节点的后继改成新加入的节点即可
        while(index!=1){
            temp=temp.next;
            index--;
        }
        //2.新建一个Node,并给数据区域赋值
        Node node=new Node(e,temp.next);
        //3.将新节点加入当中【改变引用指向】
        temp.next=node;
    }
    //按照索引删除元素
    public void delete(int index){
        //考虑特殊情况:1,越界  2.删除的是头结点
        Node temp=head;
        if(index>=size){
            throw new RuntimeException("outOfIndexException--超出链表的所允许的下标范围");
        }
        //删除头结点，直接让头结点变成头结点的下一个节点即可，然后把被删的头结点置空，等待垃圾gc回收
        if(index==0){
            head=temp.next;//如果只有一个元素，那么下一个是null,那么整个链表就为空了呗
            return;
        }
        //删除非头结点，找到索引对应位置的前一个元素，然后，让前一个元素的后继指向被删节点的后继，再把被删节点释放掉
        while(index!=1){
            temp=temp.next;
            index--;
        }
        Node delNode=temp.next;
        temp.next=delNode.next;
        delNode=null;
    }
    public void print(Node node){
        if(node==null){
            return;
        }
        Node temp=node;
        while(temp!=null){
            System.out.print(temp.Element+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Main011 m=new Main011();
            while(sc.hasNext()){
                try{
                    int num=sc.nextInt();
                    for(int i=0;i<num;i++){
                        int e=sc.nextInt();
                        m.add(e);
                    }
                }catch(Exception e){
                    System.out.println("error");
                }finally {
                    try{
                        int indexAdd=sc.nextInt();
                        int eAdd=sc.nextInt();
                        m.add(indexAdd,eAdd);
                    }catch (Exception e){
                        System.out.println("error");
                    }finally {
                        try{
                            int indexDel=sc.nextInt();
                            m.delete(indexDel);
                        }catch (Exception e){
                            System.out.println("error");
                        }finally {
                            m.print(m.head);
                        }

                    }
                }




            }


    }
}
