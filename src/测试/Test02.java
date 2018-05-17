package 测试;

import com.sun.xml.internal.ws.server.SingletonResolver;

/**
 * Created by acer on 2016/9/24.
 */
public class Test02 {
    //public
    private Test02(){

    }

    private  static  class SingleTon{
        static  Test02 test=new Test02();
    }

    public static  Test02 getSingleTon(){
        return SingleTon.test;
    }

    public static void main(String[] args) {
        Test02 t=getSingleTon();
        Test02 t1=getSingleTon();
        System.out.println(t);
        System.out.println(t1);
    }

}
