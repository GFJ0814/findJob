package 测试;

import javax.management.RuntimeMBeanException;

/**
 * Created by acer on 2016/10/4.
 */
public class Son  extends Parent {
    public static void main(String[] args) {
        Son s=new Son();
        s.getMoney();
        s.yangjia();
        s.test();
        s.test01();
        s.test02();
    }

    public void test(){
        System.out.println(super.getClass().getName());
    }
    public void test01(){
        String s1="a";
        String s2=s1+"b";
        System.out.println(s1=="ab");
    }

    public void test02(){
        try{
            System.out.println("hahhah");
            throw new RuntimeException("hahah ");
            //System.out.println("这里是测试的");
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally中的");
        }
    }

    @Override
    public void yangjia() {
        super.yangjia();
    }
}
