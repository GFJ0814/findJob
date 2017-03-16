package 剑指Offer;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by acer on 2016/10/1.
 * 利用两个栈构建一个队列
 *思路:1.进队列:直接将元素添加到栈1当中
 *    2.出队列:（1）先将栈1中的所有元素入栈到栈2，再依次从栈2中pop即可。
 *              注意:当栈2里面有元素的时候,栈1中的元素不能往里面加(没有刺激出栈的时候先判断栈2是否为空，如果空，栈s1全部入栈s2)
 */
public class SolutionStack {
    static Stack<Integer> stack1=new Stack<Integer>();
    static Stack<Integer> stack2=new Stack<Integer>();
    public static void push(int e){
       stack1.push(e);
    }

    public static  int pop(){
        //先将栈1中所有元素进入栈2，保证栈2中的元素是从无到有的增加，如果中间插入将会打乱顺序
        if(stack2.size()==0){
            while(stack1.size()!=0){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.size()==0){
            throw  new RuntimeException("队列为空");
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            int data=sc.nextInt();
            push(data);
        }
        System.out.println("输入队列首元素");
        System.out.println(pop());

    }




}
