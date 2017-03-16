package 测试;

/**
 * Created by acer on 2016/10/6.
 */
public class Test08 {
    static Person p=new Person("李四",23);

    static class Person{
        private String name;
        private int age;
        public Person(String  name,int age){
            this.name=name;
            this.age=age;
        }
        public String toString(){
            return this.name+"-"+this.age;
        }

    }

    public static void testString(String param){
        param="abc";
    }

    public  static void testYinYong(Person person){
        person=new Person("张三",12);
    }

    public static void main(String[] args) {
       testYinYong(p);
        System.out.println(p.toString());
    }
}
