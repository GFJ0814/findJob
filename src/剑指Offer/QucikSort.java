package 剑指Offer;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by acer on 2016/10/2.
 * 快排:从任意位置获得基准元素
 */
public class QucikSort {
    public void setInitArray(int[] initArray) {
        this.initArray = initArray;
    }

    private int initArray[];

    public void quickSort(int[] data,int length,int start,int end){
       if(start==end){
           return;
       }
        int index=getIndex(data,length,start,end);
        if(index>start){
            quickSort(data,length,start,index-1);
        }
        if(index<end){
            quickSort(data,length,index+1,end);
        }
    }

    public  int getIndex(int[] data,int length,int start,int end){
        if(data==null||length<=0||start<0||end>=length){
            throw new RuntimeException("Invalid parameters");
        }
        int index=getRandomIndex(start,end);
        swap(data,index,end);
        int small=start-1;
        for(index=start;index<end;++index){
            if(data[index]<data[end]){
                ++small;
                if(small!=index){
                    swap(data,index,small);
                }
            }
        }
        ++small;
        swap(data,small,end);
        return small;
    }


    public void random_partion(int start, int length) {//核心代码（随机位置二分排序）
        if (length <= 1)
            return;
        Random rand = new Random();
        int index = rand.nextInt(length) + start;
        int i = start - 1;
        int j = start;
        // System.out.println("start--->"+start+"length--->"+length+"i--->"+i+"j--->"+j+"index--->"+index+"start+length-1--->"+(start+length-1));
        this.swap(index, start + length - 1);
        for (j = start; j < start + length; j++) {
            if (initArray[j] < initArray[start + length - 1]) {
                this.swap(++i, j);
            }
        }
        this.swap(++i, start + length - 1);
        random_partion(start, i - start + 1);
        random_partion(i + 1, length + start - i - 1);
    }

    public int[] quickSorted() {
        this.random_partion(0, initArray.length);
        return initArray;
    }
    public int getRandomIndex(int start,int end){
        return (int)Math.random()*(end-start);
    }

    public void swap(int[] data,int index,int end){
        int tem=data[index];
        data[index]=data[end];
        data[end]=tem;
    }
    public void swap(int a, int b) {
        int temp = initArray[a];
        initArray[a] = initArray[b];
        initArray[b] = temp;
    }
    public static void main(String[] args) {
        QucikSort qc=new QucikSort();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] data=new int[num];
        for(int i=0;i<num;i++){
            data[i]=sc.nextInt();
        }
        //qc.quickSort(data,num,0,num-1);
        qc.setInitArray(data);
        int[] array=qc.quickSorted();
        for (int i:array){
            System.out.print(i+" ");
        }

    }
}
