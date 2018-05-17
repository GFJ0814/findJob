package 剑指Offer;

/**
 * Created by acer on 2016/10/5.
 */
public class WeiYunSuan {

    public static int numberOf1(int n){
        int count=0;
        while(n!=0){
          if(n%2==1){
              count++;
          }
          n=n/2;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOf1(9));
    }
}
