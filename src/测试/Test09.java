package 测试;

import java.util.Scanner;

/**
 * Created by acer on 2016/10/8.
 *  本题采用"汉诺塔"算法解决
 */
public class Test09 {
    private static int moveCount;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int data=sc.nextInt();
            if(data>20&&data<0){
                return;
            }
            getNum(data);
        }


    }

    private static void getNum(int num) {
        char a = 'A';
        char b = 'B';
        char c = 'C';
        moveCount = 0;//计数器
        move(num, a, b, c);
    }

    /**
     *
     * @param moveNum
     *            移动的个数
     * @param a
     *            原柱子
     * @param b
     *            辅助柱
     * @param c
     *            目标柱子
     */
    private static void move(int moveNum, char a, char b, char c) {//原->辅助->目标
        moveCount++;
        // 看图:2.只有一个时,A把("第"n)个移动到C
        // 内部: 只有一个时,原柱子->目标柱子
        if (moveNum == 1) {
            System.out.println( a + "-" + moveNum + "-" + c);
        } else {
            // 看图: 1.A借C把("共"n-1个)移动到B
            // 内部: 多个:原柱子->辅助柱子
            // C变成辅助,所以排在第二位,B变成目标;
            move(moveNum - 1, a, c, b);
            System.out.println(a + "-" + moveNum + "-" + c);
            // 看图: 3.B借A把("共"n-1)个移动到C
            // 内部: 多个:辅助柱->目标柱子
            // A是辅助,所以排在第二位置,C变目标;
            move(moveNum - 1, b, a, c);
        }
    }
 }

