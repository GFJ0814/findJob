package 排序算法;

/**
 * Created by acer on 2016/9/25.
 */
public class ChaZhao {
    //1.顺序查找 顺序查找适合于存储结构为顺序存储或链接存储的线性表。
    public static  int sequelSearch(int[] a,int x){
        int result=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                return i;
            }
        }
        int i=0;
        /*while (i<a.length&&a[i]!=x) i++;
        if(i==a.length){
            return -1;
        }else{
            return i;
        }*/
        return result;
    }



    //2.二分查找(循环实现)
    public static int binarySearch(int[] a,int x){
        int result=-1;
        int low=0;
        int high=a.length-1;
        int mid=0;
        while(low<=high){//要是找的的情况肯定是low=high,所以，while循环的条件是low<=high而不仅仅是小于关系
            mid=(low+high)/2;
            if(a[mid]==x){
                return mid;
            }else if(a[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;
    }


    //二分查找(递归实现)
    public static  int binarySearch(int[] a,int low,int high,int x){
        int result=-1;
        int mid;
        if(low>high){
            return result;
        }
        mid=(low+high)/2;
        if(a[mid]==x) return mid;
        if(a[mid]>x) return binarySearch(a,low,mid+1,x);
        else return binarySearch(a,mid+1,high,x);
    }

    public static void main(String[] args) {
        int[] a={1,2,5,6,7,9};
        System.out.println(sequelSearch(a,9));
        System.out.println(binarySearch(a,9));
        System.out.println(binarySearch(a,0,a.length-1,9));
    }
}
