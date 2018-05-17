package 测试;

/**
 * Created by acer on 2016/9/25.
 */
public class Test03 extends Thread{
    @Override
    public void run() {
        System.out.println(Test02.getSingleTon());
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Test03 t=new Test03();
            t.start();
        }
    }
}
