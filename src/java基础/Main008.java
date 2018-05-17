package java基础;

import java.util.Scanner;

/**
 * Created by acer on 2016/9/17.
 */
public class Main008 {
    public static int getIndex(int target, int[] array) {
        if (array == null || array.length == 0)
            return -1;
       /* if (target < array[0] || target > array[array.length - 1])
            return -1;*/
        int left = 0;
        int right = array.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (target < array[mid])
                right = mid - 1;
            if (target > array[mid])
                left = mid + 1;
            if (target == array[mid])
                return mid;
            mid = (left + right) / 2;
        }
        if(left==-1){
            return left+1;
        }
        return left;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int target=sc.nextInt();
            int length=sc.nextInt();
            int[] num=new int[length];
            for (int i = 0; i <length; i++) {
                num[i]=sc.nextInt();
            }
            System.out.println(getIndex(target, num));
        }

    }
}
