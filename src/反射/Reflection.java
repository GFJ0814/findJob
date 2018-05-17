package 反射;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by acer on 2017/3/17.
 */
public class Reflection {

     //输出一个类的完整信息
    public static void printPersonInfo() throws ClassNotFoundException {
        Class classZZ= Class.forName("反射.Person");
        //获取所有的属性
        Field[] flids=classZZ.getDeclaredFields();
        //定义可变长的字符串用来存储属性
        StringBuffer sb =new StringBuffer();

        sb.append(Modifier.toString(classZZ.getModifiers())+" class "+classZZ.getSimpleName()+"{\n");

        for(Field field:flids){
            sb.append("\t");
            sb.append(Modifier.toString(field.getModifiers())+" ");//获得属性修饰符
            sb.append(field.getType().getSimpleName()+" ");
            sb.append(field.getName()+";\n");
        }
        sb.append("}");
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        try {
            printPersonInfo();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
