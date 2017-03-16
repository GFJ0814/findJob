package 好未来笔试;

/**
 * Created by acer on 2017/3/16.
 */
public class Solution {
    class  Node{
        int data;
        Node next;
    }

    public int  ptintKnode(Node head){
        int result =0;
        if(head.next==null) System.out.println(head.data);
        return ptintKnode(head.next);
    }
}
