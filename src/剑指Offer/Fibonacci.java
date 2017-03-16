package 剑指Offer;

import java.util.Scanner;

/**
 * Created by acer on 2016/10/5.
 * 斐波那契数列:
 * 0 1 1 2 3 5
 */
public class Fibonacci {

    //递归方式
    public int finbonacci(int n){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return finbonacci(n-1)+finbonacci(n-2);
    }

    /*
        优点:1.代码简洁
        缺点:1.时间和空间消耗严重,每一次调用函数，都需要在栈空间分配空间保存参数,返回地址以及临时变量，而且每次往栈里面
              压入和弹出元素都很消耗时间
            2.由于方法调用在栈空间执行,栈空间很小，因次当递归产生的空间开销超过栈所能允许的上限时候，会产生栈溢出
            3.在斐波那契数列计算过程中，递归会产生大量的重复的计算，使其效率更低,最差情况下是O(2^n)
     */


    //循环方式
    public int fibonacci(int n){
        if(n<0||n>39){
            throw new RuntimeException("invalid input");
        }
        int[] test={0,1};
        if(n>=0&&n<=1){
            return test[n];
        }
        int addOne=0;
        int addTwo=1;
        int sum=0;
        for(int i=2;i<=n;i++){
            sum=addOne+addTwo;
            addOne=addTwo;
            addTwo=sum;
        }
        return sum;
    }
    //循环的特点:相比于递归的方式来讲降低了大量的重复计算，时间复杂度为O(n)


    //斐波那契数列的应用:
    /*
      1. 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     */
    public int JumpFloor(int target) {
        /**
         * 分析:方法有两种:1.第一次跳一次跳一级 后面还有n-1级台阶台阶的跳法数目
         *               2.第一次跳两级,后面还有n-2级台阶台阶的跳法数目
         *               因此,如果把n次跳法当做一个函数，则f(n)=f(n-1)+f(n-2)
         *
          */
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        return JumpFloor(target-1)+JumpFloor(target-2);
    }

    /**
     * 变态跳台阶
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     * 通过数学归纳法；
     *  1级台阶  直接跳1级 1
     *  2级台阶  先条1级有1种  先跳2级有1种  1+1=2
     *  3级      。。1级。2。      2级 1  跳3级1种 2+1+1=4
     *  。。。。。
     *  数学归纳法：2^(n-1)
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
      if(target==0){
          return 0;
      }
      int result=1;
      for(int i=1;i<target;i++){
          result*=2;
      }
      return result;
    }

    /**
     * 思路分析:
     * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
     * 如果横着去覆盖的话，则还需要覆盖(n-2)*2个大小的矩形,也就是计算覆盖（n-2）*2的方法
     * 如果竖着去覆盖的话,则还需要(n-2)*2的大小的矩形,也就是需要计算覆盖(n-1)*2的方法
     *
     * 递归解法:
     * @param target
     * @return
     */
    public int RectCover(int target) {
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        return RectCover(target-1)+RectCover(target-2);
    }
    //循环解法:
    public int ReCoverII(int target){
        if(target<0){
            throw new RuntimeException("invalid input");
        }
        int[] test={0,1,1};
        if(target<=2){
            return test[target];
        }
        int addOne=1;
        int addTwo=2;
        int sum=0;
        for(int i=3;i<=target;i++){
            sum=addOne+addTwo;
            addOne=addTwo;
            addTwo=sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Fibonacci f=new Fibonacci();
        while(sc.hasNext()){
            int data=sc.nextInt();
            System.out.println(f.finbonacci(data));
            System.out.println(f.fibonacci(data));
        }
    }
}
