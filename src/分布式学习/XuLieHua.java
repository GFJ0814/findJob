package 分布式学习;


import com.sun.org.apache.xml.internal.utils.SerializableLocatorImpl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by acer on 2017/3/14.
 */
public class XuLieHua {


    public static void main(String[] args) {

        //定义字节输出流
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        Person p = new Person();
        p.setAge(13);
        p.setName("哈哈哈");
        //对象输出流
        try {
            ObjectOutputStream out = new ObjectOutputStream(os);
            out.writeObject(p);
            byte[] personByte =  os.toByteArray();

            //输出序列化后的串
           for(byte b :personByte){
               System.out.print(b);
           }
            System.out.println();

           //反序列化

           //定义字节输入流
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(personByte);
            //定义对象输入流
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

            Person person =(Person)objectInputStream.readObject();

            System.out.println(person.getName()+"--"+person.getAge());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    static class Person extends SerializableLocatorImpl {
        String name;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}
