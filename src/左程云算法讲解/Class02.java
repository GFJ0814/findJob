package 左程云算法讲解;

/**
 * Created by acer on 2016/9/2.
 * 之字形打印矩阵
 */
public class Class02 {
    //传入一个矩阵，并告诉几行几列
    public static  void zhiZiXingJuZhen(int[][] a,int c,int r){
       int x1=0,x2=0,y1=0,y2=0;
        boolean isup=false;
        while(x1!=r){
           /* if(isup==false){//从下往上
                int k=x2;
                int n=y2;
                while(k!=x1-1){
                    System.out.print(a[k--][n++]+"  ");
                }
            }else{
                int k=x1;
                int n=y1;
                while(k!=x2+1){
                    System.out.print(a[k++][n--]+"  ");
                }
            }*/
            printLevel(a,x1,y1,x2,y2,isup);
            x1=y1==c-1?x1+1:x1;
            y1=y1==c-1?y1:y1+1;
            y2=x2==r-1?y2+1:y2;
            x2=x2==r-1?x2:x2+1;
            isup=!isup;
        }


    }

    /**
     * 1.上坐标（tR，tC）的初始为（0,0），先沿着矩阵的第一行移动（tC++）,
     * 当达到第一行最右边的元素后，再沿着矩阵最后一列移动  (tR++)。

     2.下坐标（dR，dC）的初始为（0,0），先沿着矩阵的第一列移动（dR++），
     当到达第一列最下边的元素时，再沿着矩阵的最后一行一定（dC++）。

     3.上坐标与下坐标同步移动，每次移动后的上坐标与下坐标的连线就是矩阵中的一条斜线，打印斜线上的元素即可。

     4.如果上次斜线是从左下向右上打印的，这次一定是从右上向左下打印，反之亦然。
     总之，可以把打印的方向用boolean变量表示，每次取反即可。
     * @param matrix
     */
    public static void printMatrixZigZag(int[][] matrix) {
        int tC = 0, tR = 0, dC = 0, dR = 0;
        int endR = matrix.length - 1;
        int endC = matrix[0].length - 1;
        boolean fromUp = false;
        while (tR != endR + 1) {//条件很好理解，如果跳到了矩阵之外则完了
            printLevel(matrix, tR, tC, dR, dC, fromUp);
            tR = tC == endC ? tR + 1 : tR;//如果当前列是最后一列，则行往下加1
            tC = tC == endC ? tC : tC + 1;//否则，列往后加1
            dC = dR == endR ? dC + 1 : dC;//看下坐标当前行是否是最后一行,如果是,下坐标的列加1
            dR = dR == endR ? dR : dR + 1;//如果不是最后一行，行往下加的
            fromUp = !fromUp;
        }
    }
    private static void printLevel(int[][] matrix, int tR, int tC, int dR, int dC, boolean fromUp) {
        if (fromUp) {
            while (tR != dR + 1) {
                System.out.print(matrix[tR++][tC--] + " ");
            }
        } else {
            while (dR != tR - 1) {
                System.out.print(matrix[dR--][dC++] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] a=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
       /*int[] t= printMatrix(a,3,4);
        for (int i = 0; i <t.length; i++) {
            System.out.print(t[i]+" ");
        }*/
//        zhiZiXingJuZhen(a,3,4);
        printMatrixZigZag(a);
//        zhiZiXingJuZhen(a,3,4);

    }
}
