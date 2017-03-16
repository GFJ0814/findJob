package java基础;

import java.util.Scanner;

/**
 * Created by acer on 2016/9/18.
 */
public class Main010 {

   /* public static  int getZeroNum(int n){
        if(n<1||n>1000){
            throw new RuntimeException();
        }
        int count=0;
        int result=1;
        while(n>=1){
            result*=n;
            n--;
        }
        String re=result+"";
        if(re.charAt(re.length()-1)!='0'){
            return count;
        }
        for(int i=re.length()-1;i>=0;i--){
            if(re.charAt(i)=='0'){
                count++;
            }
        }
        return count;
    }*/

    /**
     * 因为求末尾0的个数，因此。考虑哪些数相乘可以得到0，如果考虑直接求阶乘额话，肯定会溢出，故而如此分析
     * @param n 传入的整数n
     * @return  末尾零的个数
     * N的阶乘可以分解为： 2的X次方，3的Y次方，4的5次Z方，.....的成绩。由于10 = 2 * 5,
     * 所以M只能和X和Z有关，每一对2和5相乘就可以得到一个10，
     * 于是M = MIN(X,Z),不难看出X大于Z，因为被2整除的频率比被5整除的频率高的多。所以可以把公式简化为M=Z
     */
    public static  int getZeroNum(int n)
    {
        int count = 0;
        int i,j;

        for (i = 5;i <= n;i += 5)
        {
            j = i;
            while (j % 5 == 0)
            {
                count++;
                j /= 5;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
                System.out.println(getZeroNum(n));
        }
    }
}
