package CollectDemo;

import java.util.ArrayList;

public class CollectionDemo1 {

    public static void main(String[] args) {
        //<E>指定存的数据类型  这里要填基本类型的包装类
        //int ->Integer
        ArrayList<String> arr = new ArrayList<>();
        arr.add("name");
        arr.add("age");
        arr.add("report");
        System.out.println("arr: " + arr);

        arr.set(1,"replace");
        System.out.println("after replace index 1: " + arr);

        arr.remove(2);
        System.out.println("after remove index 2: " + arr);

        System.out.println("get index 0: " + arr.get(0));

        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr[i]);
            System.out.println(arr.get(i));
        }

    }


}
