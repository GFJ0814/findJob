package 左程云算法讲解;

/**
 * Created by acer on 2016/9/8.
 */
public class Class03 {
    //竖向打印之字形矩阵
    public  static int[] printMatrix(int[][] mat,int n,int m){
        int[] result=new int[n*m];
        int count=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<m;j++){
                    result[k++]=mat[i][j];
                }
            }else{
                for(int j=m-1;j>=0;j--){
                    result[k++]=mat[i][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[] r=printMatrix(a,3,4);
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]+"   ");
        }
    }
}
