package 测试;

/**
 * Created by acer on 2016/10/4.
 */
public class TestInnerClass {

    String name="张三";
    void testMain(){
        System.out.println("我是外部类中的方法");
        TestStatic02.test02();
    }
    public void  test(){
        final int a=5;
        class Test{
            public void test01(){
                System.out.println(name);//方法中的内部类可与访问外部类中的成员变量
                testMain();//方法中的内部类可与访问外部类中的方法
            }
        }

    }

    class Test01{
       public void test01(){
           System.out.println(name);//方法外的内部类可以访问外部类中的成员变量
           testMain();//方法外的内部类可以访问外部类中的方法
       }
    }

    static  class TestStatic02{
        public static void test02(){
            //System.out.println(name);只能访问外部类中的静态成员变量
            //testMain();只能访问外部类中的静态方法
            TestInnerClass tsi=new TestInnerClass();
            System.out.println(tsi.name);//需要通过外部类的实例访问外部类的非静态成员变量
            tsi.testMain();//需要通过外部类的实例访问外部类中的非静态方法
        }
    }

    static public void test03(){
        final  String name1="老王";
         class TestStatic03{
             void fun(){
                System.out.println(name1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("哈哈");
    }



}
