package 左程云算法讲解;

import java.util.Scanner;

/**
 * Created by acer on 2016/9/2.
 */
public class Class01 {
    //腾讯笔试题：打印蟒蛇阵
    public static int[][] circleJuzhen(int N){
        int[][] a=new int[N][N];
        int k=0;
        int i=0;//行标志
        int j=0;//列标志
        int z=1;
        while(k<N){
            while(j<N-k){
                a[i][j]=z;
                j++;
                z++;
            }
            j--;//j在循环中超越了边界，因此需要往回退一个
            i++;//此时第一行已经把数都填完了，切换到下一行
            while(i<N-k){
                a[i][j]=z;
                i++;
                z++;
            }
            i--;//同理，while循环结束时候，行边界也超了，需要回退一个
            j--;//此时最外边的一列也填完了，j--切换到左边的一列
            while(j>=k){
                a[i][j]=z;
                j--;
                z++;
            }
            j++;//列往左超出一个，加回来
            k++;//此时行往回退的话，退到原来的下一行即可，故而k++
            i--;//行切换到已经填完的上一行
            while(i>=k){
                a[i][j]=z;
                i--;
                z++;
            }
            i++;//行超出边界回到了原来的行，通过加1切换到原来行的下一行
            j++;//列切换到下一列,相比于开始的时候,相当于从（1，1）切换到了（2,2）
        }
        return a;
    }
    //另外的解法1:技巧处理就在j=cou-1,这一个处理好了后面就好想了，最简要的回退方式

    /**
     *
     * @param a  二维数组
     * @param n  行数
     * @param m  列数
     * @return
     */
    public static  int[] fun(int[][] a,int n,int m){
        int[] result=new int[n*m];
        int cou=0,i,j,k=0;
        while(2*cou<Math.min(n,m)){
            for(i=cou,j=cou-1;j<m-cou-1;j++) result[k++]=a[i][j+1];
            for(;i<n-cou-1;i++) result[k++]=a[i+1][j];
            for(;2*cou!=n-1&&j>=cou+1;j--) result[k++]=a[i][j-1];//第一次的时候,j-1最终值是0，所以,j>=1=cou+1;
            for(;2*cou!=m-1&&i>cou+1;i--) result[k++]=a[i-1][j];//第一次的时候,i-1最终的取值是1,所以i>1不含等号
            cou++;
        }
        return result;
    }


    public static int[] clockwisePrint(int[][] mat,int m, int n) {
        int[] result=new int[m*n];
        if(mat==null)return result;
        int cur=0,i,j,k=0;
        while(2*cur<Math.min(m,n)){
            for(i=cur,j=cur-1;j<n-cur-1;j++) result[k++]=mat[i][j+1];
            for(;i<m-cur-1;i++) result[k++]=mat[i+1][j];
            for(;2*cur!=m-1&&j>=cur+1;j--) result[k++]=mat[i][j-1];
            for(;2*cur!=n-1&&i>cur+1;i--) result[k++]=mat[i-1][j];
            cur++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[] x=fun(a,3,4);
//        int[] x=clockwisePrint(a,3,4);
        for (int i = 0; i <x.length; i++) {
            System.out.print(x[i]+"   ");
        }
    }

  /*  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int[][] a=circleJuzhen(n);
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }*/


}
