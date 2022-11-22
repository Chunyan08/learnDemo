package multithreadingDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        String s1 = "runoob";
//        String s2 = "runoob";
//        //false  + 优先 ==
//        System.out.println("s1 == s2 is:" + s1 == s2);
//        //true
//        System.out.println(s1 == s2);

//        int x=3;
//        int y=1;
//        // ==
//        if(x=y)
//            System.out.println("不相等");
//        else
//            System.out.println("相等");

        String s1 = "&&df";
        String s2 = "&&df";
        //创建对象，返回的是堆中地址的引用
        String s3 = new String("dddd");
        String s4 = "dddd";

        //==比较的是地址
        System.out.println(s1 == s2);
        System.out.println(s4 == s3);
        //比较的是内容
        System.out.println(s3.equals(s4));

        char c = 65;
        //c 变量为 char 类型，65 对应的 ASCII 码为 A。
        System.out.println("c = "+c);

    }

    }

class TestIt
{
    public static void main ( String[] args )
    {
        int[] myArray = {1, 2, 3, 4, 5};
        //引用传递也是一种值传递，并不会修改原来的引用的值，即 myArray 引用的值没有变化，还是和原来一样
        //
        List<String> list = new ArrayList<>();
        ChangeIt.doIt( list );
        System.out.println("lsit " + list);
        for(int j=0; j<myArray.length; j++)
            System.out.print( myArray[j] + " " );

        String a  = "ss";
        //String不可修改？
        doItt(a);
        System.out.println("a: " + a);


    }

    static void doItt(String z)
    {
        z = "lll" ;
        //z=null;
    }
}


class ChangeIt
{
    static void doIt( List<String> list )
    {
        //修改不了数组的地址值
        list.add("hahha");
        //可以修改数组中的值
    }

}
