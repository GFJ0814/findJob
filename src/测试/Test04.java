package 测试;

/**
 * Created by acer on 2016/10/1.
 */
public class Test04 {

    public static  void print(){
        try{
            System.out.println("这是try");
            throw new RuntimeException();
          //  return;
            //System.out.println("这是return之后的");编译型异常
        }catch(Exception e){
            System.out.println("这是catch");
        }finally {
            System.out.println("这是finally");
        }
    }
    public static void main(String[] args) {
        print();
    }
}
