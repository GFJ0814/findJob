package java基础;

/**
 * Created by acer on 2016/9/12.
 */
public class Main006 {
    public int getResult(int input){
        int result=-1;
        int mul=1;
        for (int i = 0; i <input ; i++) {
            mul=mul*3;
        }
        int strNum=input%3==0?(input/3)*26:(input/3+1);
        return result;
    }

    public static void main(String[] args) {

    }
}
