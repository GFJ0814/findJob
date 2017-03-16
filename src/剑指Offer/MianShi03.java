package 剑指Offer;

import java.util.Scanner;

/**二位数组的查找特定元素
 * Created by acer on 2016/8/25.
 */
public class MianShi03 {
    public static boolean findKey(int[][] a,int key){
        if(a!=null){
            int i=0;//代表行数目
            int j=a[i].length-1;//代表了列数目
            while(i<a.length&&j>=0){
                if(a[i][j]==key){
                    return true;//找到相等的,返回结果为true
                }else if(a[i][j]>key){//因为在j列上的剩余数都比它大,因此就没有在这列再比较的意义
                    j--;
                }else{//因为从右上角往左下方比较,因此，比当前元素大，那肯定比当前左边的元素大，左边的列就不用再比较了，直接向下找
                    i++;
                }
            }
            return false;//循环能走完，说明没有遇到相等的情况,返回false
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
       // MianShi03.findKey()
        System.out.println("输入测试数据的组数");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for (int i = 0; i <x ; i++) {
            int test=sc.nextInt();
            System.out.print("第"+(i+1)+"组的测试结果是"+"--------"+findKey(a,test));
        }

    }
}
