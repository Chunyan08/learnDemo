package CollectDemo;

import InterfaceDemo2.Inter;

import java.util.ArrayList;
import java.util.List;

public class genericityDemo {


    public static void main(String[] args) {

        /*
        * 泛型
        * E - Element (在集合中使用，因为集合中存放的是元素)
        * T - Type（Java 类）
        * K - Key（键）
        * V - Value（值）
        * N - Number（数值类型）
        * ？ - 表示不确定的 java 类型
        * */

        //泛型针对的是包装类型*******
        Integer[] intArray = {1,2,3,4,5};

        //String[]
        String[] strArray = {"hello","sss","sdddd"};

        //char[]
        Character[] charArray = {'a','b','c'};

        printArray( intArray );
        printArray( strArray );
        printArray( charArray );

        /*
        * 有界的类型参数
        *你会想限制那些被允许传递到一个类型参数的类型种类范围
        * 例如，一个操作数字的方法可能只希望接受Number或者Number子类的实例。这就是有界类型参数的目的。
        * */
        int max = maxium(3,4,5);
        System.out.println("int max: " + max);
        double max1 = maxium(3.41,4.34,5.25);
        System.out.println("double max1: " + max1);
        String max2 = maxium("peal","appear","hik");
        System.out.println("double max1: " + max2);

        List<String> str = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> num = new ArrayList<Number>();
        str.add("name");
        age.add(18);
        num.add(324);

        get(str);
        get(age);
        get(num);

        //打印，过滤，只要数字类型
//        getNum(str); //报错，部署number类型的参数
        get(age);
        getNum(num);


    }


    //使用 ? extends number,只接受number
    public static void getNum(List<? extends Number> data){
        System.out.println("only get number,data.get(0): " + data.get(0));
    }

    //使用 ? 代替具体的类型参数
    public static void get(List<?> data){
        System.out.println("data.get(0): " + data.get(0));
    }


    public static <T extends Comparable<T>> T maxium(T x, T y, T z){
        T max =  x;
        if ( y.compareTo(max) > 0){
            max = y;
        }
        if ( z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }




    //用于各种类型的数组打印处理
    public static < E > void printArray(E[] array){
        for (E elem: array){
            System.out.println(elem);
        }
    }

}
