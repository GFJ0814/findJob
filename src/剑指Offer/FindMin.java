package 剑指Offer;

/**
 * Created by acer on 2016/10/4.
 * 思想:不断缩小比较的距离,【这也就是和左端比大，和右端比小的原因】，直到上下边界相邻。
 * 用两个指针,一个指向序列最左端，一个指向序列最右端
 * 取两个指针的中间值和分别和左右端的值进行比较，
 * 如果比左端大，则说明中间值在左边递增序列，然而最小值一定是不在左端的，说明还得从该中间值往后找，
 * 如果比右端小，说明中间值是在右边的递增序列中，而最小值要么是它或者是右边递增序列中在它左边的元素【如果和右端比大没意义，因为它肯定比右端小】
 * 如此缩小空间，直到右端到大最小值，左端到大最大值，此时左右指针相差为1，而右端指针指向的正是最小元素值
 *
 * 特殊情况考虑:如果左端指针指向的值,右端指针指向的值以及中间值都相等的情况下，之前的办法已经无用了，
 * 因为，此时无法通过中间值和左右两端的大小来确定中间值是在右端还是左端进而缩小间距，因此此种情况下只得顺序查找最小值
 */
public class FindMin {

    public static  int findMin(int[] array) {
        int index1 = 0;
        int index2 = array.length - 1;
        int midIndex = 0;
        while (array[index1] >= array[index2]) {
            if (index2 - index1 == 1) {
                midIndex=index2;
                return array[midIndex];
            }
            midIndex = (index1 + index2) / 2;
            if(array[index1]==array[index2]&&array[index2]==array[midIndex]){
                return minFind(array,index1,index2);
            }
            if (array[index1] <= array[midIndex]) {
                index1 = midIndex;
            } else if (array[index2] >= array[midIndex]) {
                index2 = midIndex;
            }
        }
        return array[midIndex];
    }

    public static  int minFind(int[] data,int index1,int index2){
        int result=data[index1];
        for(int i=index1;i<=index2;i++){
            if(result>data[i]){
                result=data[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data={1,0,1,1,1};
        System.out.println(findMin(data));
    }
}
