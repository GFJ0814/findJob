package 测试;

/**
 * Created by acer on 2016/9/24.
 */
public class Test01 {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            TestThread t=new TestThread();
            t.start();
        }

        System.out.println("我是main方法----------------------hahha");
    }

    static class TestThread extends Thread{
        @Override
        public void run() {
            //super.run();
            System.out.println("我是多线程");
        }
    }
}
