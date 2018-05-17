package 测试;

/**
 * Created by acer on 2016/10/1.
 */
public class Test05 {
    public static void test(int i){
        switch (i){
            case 1:
                System.out.println("这是1");break;
            case 2:
                System.out.println("这是2");break;
            default:
                System.out.println("这是默认");break;
        }
    }

    public static void main(String[] args) {
        test(1);
    }
}
