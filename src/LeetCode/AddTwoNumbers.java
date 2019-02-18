package LeetCode;



/**
 * @program: findJob
 * @description: 2.两数相加
 * @author: guofangjun001
 * @create: 2019-02-15 16:18
 **/
public class AddTwoNumbers {

    /*
        给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，
        并且它们的每个节点只能存储 一位 数字。

        如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

        您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

        示例：

        输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
        输出：7 -> 0 -> 8
        原因：342 + 465 = 807
     */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode node3 = null;
        int temp = 0;
        ListNode root = null;
       while(node1!=null || node2 != null || temp==1){
           int nodeVal1 = 0;
           int node2Val2 = 0;
           if(node1!=null){
               nodeVal1 = node1.val;
               node1 = node1.next;
           }
           if(node2!=null){
               node2Val2 = node2.val;
               node2 = node2.next;
           }
           int val = nodeVal1+node2Val2+temp;
           if(val>=10){
               val = val%10;
               temp = 1;
           }else{
               temp = 0;
           }
           ListNode nodeTemp = new ListNode(val);
           if(root==null){
               node3 = nodeTemp;
               root = node3;
           }else{
               node3.next = nodeTemp;
               node3 = node3.next;
           }
       }
        return  root;
    }

    private void print(ListNode node){
        if(node == null){
           return ;
        }
         print(node.next);
        System.out.print(node.val);
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
  }

    public static void main(String[] args) {
      //  AddTwoNumbers.ListNode node1 = AddTwoNumbers.new ListNode(1);
        AddTwoNumbers addTwoNumbers =  new AddTwoNumbers();
        ListNode node1 = addTwoNumbers.new ListNode(5);
      //  ListNode node2 = addTwoNumbers.new ListNode(8);
      //  ListNode node3 = addTwoNumbers.new ListNode(3);
       // node1.next = node2;
       // node2.next = node3;

        ListNode node4 = addTwoNumbers.new ListNode(5);
      /*  ListNode node5 = addTwoNumbers.new ListNode(6);
        ListNode node6 = addTwoNumbers.new ListNode(4);
        node4.next = node5;
        node5.next = node6;*/

        ListNode nodeResult = addTwoNumbers.addTwoNumbers(node1,node4);
        addTwoNumbers.print(nodeResult);

    }

    /*
        感受：这个题目从直观来看，逻辑上并不算难（如果只考虑实现的话），
        在写的过程中，最好先在纸上写出伪代码，整理清楚逻辑，这个在做题目的时候都可以采纳，而不是一上来就编码
        这个题目感觉主要是要能考虑到异常情况，
            比如listNode1是1->8，listNode2是0的情况，此时，也就是要考虑当长度不一致时候，node.next会出现空指针
            比如listNode1是5，listNode2是5的这种情况下，需要计算下一位的数字，也就是循环条件中，金威的数字要不为0
     */


}
