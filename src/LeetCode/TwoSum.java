package LeetCode;

import java.util.*;
import java.util.ArrayList;

/**
 * @program: findJob
 * @description: 两数之和
 * @author: guofangjun001
 * @create: 2019-02-14 12:17
 **/
public class TwoSum {

    /*
    题目：
        给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

        你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

        示例:

        给定 nums = [2, 7, 11, 15], target = 9

        因为 nums[0] + nums[1] = 2 + 7 = 9
        所以返回 [0, 1]
     */

    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]+nums[j]==target) {
                    set.add(i);
                    set.add(j);
                }
            }
        }
       int[] result = new int[set.size()];
        int count = 0;
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            result[count++] = Integer.parseInt(iterator.next().toString());
        }
        return result;
    }

    public void print(int[] nums){
       for(int num:nums){
           System.out.println(num);
       }
    }

    public static void main(String[] args) {
        int [] nums = {3,2,4};
        int target = 6;
        TwoSum twoSum  = new TwoSum();
        int [] result = twoSum.twoSum(nums,target);
        twoSum.print(result);

    }
}




