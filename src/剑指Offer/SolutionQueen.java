package 剑指Offer;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by acer on 2016/10/1.
 * 借助两个队列实现一个栈
 * 思想:保证每次最后添加进来的元素成为队列最前面的元素即可
 */
public class SolutionQueen {
    ArrayDeque<Integer> deque1=new ArrayDeque<Integer>();//用来添加元素
    ArrayDeque<Integer> deque2=new ArrayDeque<Integer>();//用来调整整个队列中元素顺序,使其形成栈的结构


    //入栈
    public void add(int e){
        //如果队列1中有元素,将其先挪到队列2,
        while (deque1.size()!=0){
            deque2.add(deque1.pop());
        }
        //将新来的元素的加入到队列1
        deque1.add(e);
        //再将原来队列中的元素拿回来
        while(deque2.size()!=0){
            deque1.add(deque2.pop());
        }
    }
    //取栈顶
    public int pop(){
        return deque1.pop();
    }

    //输出栈中的所有元素
    public void print(){
        while(deque1.size()!=0){
            System.out.print(pop()+" ");
        }
    }
    public static void main(String[] args) {
        SolutionQueen sq=new SolutionQueen();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i = 0; i < num; i++) {
            int data=sc.nextInt();
            sq.add(data);
        }
        sq.print();
    }

}
