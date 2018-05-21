package Review;

/**
 * Created by gfj43958 on 2018/5/21.
 * time:22:46
 * author:GuoFangjun
 * https://www.cnblogs.com/yangming1996/p/7753656.html
 */
public class Shuati {

    //排序:
    public void insertSort(int array[]){
        int i,j,key=0;
        //默认第一个数是有序的，从第二个数开始插入
        for(i=1;i<array.length;i++){
            key=array[i];//取出当前数值
            j=i-1;//取前一个数的索引
            while(j>=0&&key<array[j]){ //如果要排序的比已经排好序的最后一个值大，则不动，否则向前找到比要插入的值小的
                array[j+1]=array[j];//则从该位开始，将大的数数往后挪一个，
                j--;//一次类推，直到找到了排序数列中前面某数比自己大
            }
            array[j+1]=key;
        }
        for(int v:array){
            System.out.printf(v+" ");
        }
    }

    public void printArray(int[] array){
        for(int i:array){
            System.out.printf(i+" ");
        }
    }

    public static void main(String[] args) {
        Shuati s = new Shuati();
        int[] array = {15,0,45,2,67,56,88,99};
        s.insertSort(array);

    }



}
