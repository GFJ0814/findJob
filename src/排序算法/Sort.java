package 排序算法;

/**
 * Created by acer on 2016/8/16.
 */
public class Sort {
    //直接插入排序:
    //排序思想:给一个数列，将整体划分为两部分，假定前面的是已经排序好的数列，后续的每一个元素都是未经排序的
    //将后续数列的每一个元素按照已经排序的序列的排序规则，找到后续元素在已经排好的这个序列中的位置，将其插入进去即可。
    //举例:比如开始插入的时候，假设第一个数就是只有一个元素的排好序的数列，将第二个元素按照从小到大或者从大到小的规则
    //插入，形成一个2元的有序的数列，同理将第三个元素插入到形成的2元有序数列当中，如果有相等，则将新来元素放在与之
    //相等的原来元素之后
    public int[] zhiJieChaRuSort(int[] a){
       for(int i=1;i<a.length;i++){//从第二个元素开始和他前面的比较
           if(a[i]<a[i-1]){
               int x=a[i];
               a[i]=a[i-1];//将该元素前面的元素往后移动一位
               int j=i-1;//记录下该元素之前的一位元素的索引
               while(j>=1&&x<a[j-1]){//如果j为0则没有前面的元素和它比，此时已经挪动完毕，将a[0]=x即可。
                   a[j]=a[j-1];
                   j--;
               }
               a[j]=x;//如果j减成了1，则a[0]=x;达到目标
           }

       }
        return a;
    }



    //希尔排序
    public int[] shellSort(int[] a){

        return a;
    }



    //快速排序

    /**
     * 思想:选第一个作为基准元素，从最后一个元素开始，如果比当前元素小，则把它放在当前元素的前面，如果比当前元素大，则放在当前元素后面
     * @param a
     * @return
     */
    public int[] quickSort(int[] a,int low,int high){
        if(low<high){
            int mid=sort(a,low,high);
            //递归排序中间基准左侧的元素
            quickSort(a, 0, mid - 1);
            //递归排序中间基准右侧的元素
            quickSort(a,mid+1,high);
        }

        return a;
    }
    public static  int sort(int[] a,int low,int high){
        int temp=a[low];//序列第一个为基准元素
        while (low<high){
            //从最后一个开始查找，如果比基准元素大，放在基准元素左侧
            while(low<high&&a[high]>=temp){
                high--;
            }
            a[low]=a[high];
            //从左端查找,比基准元素大，放在基准元素右边
            while(low<high&&a[low]<=temp){
                low++;
            }
            a[high]=a[low];
        }
        a[low]=temp;
        return low;
    }

    //堆排序
    public int[] heapSort(int[] a){
        return a;
    }

    //
    public void print(int[] a){
        for(int x:a){
            System.out.print(x + "  ");
        }
    }

    public static void main(String[] args){
        Sort sort=new Sort();
        int[] a=new int[]{13,15,2,17,0,-1,3,3,4,22};
       // int[] sa=sort.zhiJieChaRuSort(a);
        int[] sa=sort.quickSort(a,0,a.length-1);
        sort.print(sa);

    }

}
