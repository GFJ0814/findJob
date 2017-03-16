package java基础;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by acer on 2016/9/28.
 */
public class Main24 {
    private String[] str=new String[9];//此数组用于存储排序标准，最多有9个大小
    private Map<String,String> map=null;
    private List<Student> list=new ArrayList<Student>();
    public Main24(){
        //利用Map集合存储标题和属性名的对应关系
        map=new HashMap<String, String>();
        map.put("总分","Zongfen");
        map.put("学号","Sno");
        map.put("班级","ClassName");
        map.put("年龄","Age");
        map.put("姓名","Name");
        map.put("语文","Yuwen");
        map.put("数学","Math");
        map.put("计算机","Computer");
        map.put("英语","English");
    }



    class Student implements  Comparable<Student>{
        private String sno;//学号
        private String name;//姓名
        private String className;//班级
        private int age;//年龄
        private int yuwen;//语文
        private int math;//数学
        private int english;
        private int computer;//计算机
        private int zongfen;//总分
        public Student(String sno, String name, String className, int age, int yuwen, int math,int english, int computer) {
            this.sno = sno;
            this.name = name;
            this.className = className;
            this.age = age;
            this.yuwen = yuwen;
            this.math = math;
            this.english=english;
            this.computer = computer;
            this.zongfen=this.yuwen+this.math+this.computer;
        }

        @Override
        public String toString() {
           return this.sno+" "+this.name+" "+this.className+" "+this.age+" "+this.yuwen+" "+" "+this.math+" "+this.computer+" "+this.zongfen;
        }

        @Override
        public int compareTo(Student o) {
            //遍历标准数组,逐个属性进行排序比较
            for(int i=0;i<str.length;i++){
                //比较大小，返回正负数
            }
            //相等返回0
            return 0;
        }
    }

    public void add(Student stu){

        list.add(stu);
    }

}
