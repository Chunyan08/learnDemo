package CollectDemo;

import java.text.Format;
import java.util.*;

public class CollectionDemo1 {

    public static void main(String[] args) {
        //<E>指定存的数据类型  这里要填基本类型的包装类
        //int ->Integer
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("name");
//        arr.add("age");
//        arr.add("report");
//        System.out.println("arr: " + arr);
//
//        arr.set(1,"replace");
//        System.out.println("after replace index 1: " + arr);
//
//        arr.remove(2);
//        System.out.println("after remove index 2: " + arr);
//
//        System.out.println("get index 0: " + arr.get(0));
//
//        for (int i = 0; i < arr.size(); i++) {
////            System.out.println(arr[i]);
//            System.out.println(arr.get(i));
//        }

        //集合是java中提供的一种容器，可以用来存储多个数据。
        //集合和数组: 数组长度不可变，存储基本类型，存储类型要一致；集合长度可变且存储对象-且对象类型可以不一致
        //集合存储对象： Collection：对象；Map：键值对
        //collcetion: set list sortedSet queue(有序 无序)

        //创建集合
        Collection<String> coll = new ArrayList<String>();
        //add
        coll.add("one");
        coll.add("two");
        coll.add("three");
        coll.add("four");
        Collection<String> coll01 = new ArrayList();
        coll01.add("one");
        coll01.add("two");
        coll01.add("three");
        coll01.add("four");
        Collection<String> coll02 = new ArrayList();
        coll02.add("thttt");
        Collection<String> coll03 = new ArrayList();
        coll03.add("your");
        coll03.add("hai");
        Collection<String> coll04 = new ArrayList();
        coll04.add("one");
        coll04.add("two");
        Collection<String> coll05 = new ArrayList();
        coll05.add("eight");
        coll05.add("seven");

        System.out.println("coll " + coll);
        //remove，缺点： 无法根据条件去删除
        coll.remove("four");
        System.out.println("after remove " + coll);
        //元素个数
        System.out.println("coll size " + coll.size());
        System.out.println("coll.contains(\"one\") " +  coll.contains("one"));
        System.out.println("coll.equals(coll01) " +  coll.equals(coll01));
        //
        coll.addAll(coll02);
        System.out.println("coll.addAll(coll02) " +  coll);
        System.out.println("coll.containsAll(coll04) " +  coll.containsAll(coll04));
        System.out.println("coll.isEmpty() " +  coll.isEmpty());
        System.out.println("coll -- " + coll);

        //使用迭代器遍历
        //获取迭代器
        Iterator<String> it = coll.iterator();
        //判断是否有下一个元素
        while(it.hasNext()){
            String s = it.next();
            System.out.println("elem " + s);
        }


        Iterator<String> it1 = coll.iterator();
        while(it1.hasNext()){
            String s = it1.next();
            if (s.length() == 3) {
                it1.remove();
                /*
                 * 不要在使用Iterator迭代器进行迭代时，调用Collection的remove(xx)方法，
                 * 否则会报异常java.util.ConcurrentModificationException，或出现不确定行为。
                 *
                 * 迭代器代表集合中某个元素的位置，内部会存储某些能够代表该位置的信息。当集合发生改变时，
                 * 该信息的含义可能会发生变化，这时操作迭代器就可能会造成不可预料的事情。因此，果断抛异常阻止，是最好的方法
                 * */
//                coll.remove(s);
            }
            System.out.println("eeeeee " + s);
        }
        System.out.println("after iterator remove " + coll);

        //jdk15后出现的增强for循环
        //目标只能是Collection等或者是数组
        for(String elem : coll){
            System.out.println("elem-enhance " + elem);
        }

        //retainAll 取交集
        //coll04 ["one","two"]
        //coll05 ["eight","seven"]
        System.out.println("coll.retainAll(coll04) " + coll.retainAll(coll04));
        System.out.println("coll.retainAll(coll05) " + coll.retainAll(coll05));



        coll.clear();
        System.out.println("coll.clear() " +  coll);

        //List
        List<String> list = new ArrayList<String>();
        list.add("lucy");
        list.add("Jamie");
        list.add("luc");
        System.out.println("list " + list);
        List<String> list1 = new ArrayList<String>();
        list1.add("sev");
        list1.add("eigh");

        list.addAll(list1);
        System.out.println("list.addAll(list1) " + list);

        list.remove(1);
        System.out.println("list.remove(1) " + list);

        list.remove("luc");
        System.out.println("list.remove(\"luc\") " + list);

        //
        System.out.println("list.get(0) " + list.get(0));
        //得到子集
        System.out.println("list.subList(0,1) " + list.subList(0,3));

        System.out.println("list.indexOf(2) " + list.indexOf(2));
        System.out.println("list.lastIndexOf(0) " + list.lastIndexOf(1));


//        //collection 转 Object 数组
//        Object[] objects = coll.toArray();
//        //遍历
//        for (int i = 0; i < objects.length; i++) {
//            System.out.println(String.format("objects [%s] [%s]",i,objects[i]));
//        }
//
//        //
        System.out.println("++++++++++++++++++++++");
        List<String> li = new ArrayList<String>();
        li.add("we");
        li.add("are");
        li.add("students");
//        //for-each
//        for(String str: li) {
//            System.out.println(str);
//        }
        System.out.println("li " + li);
        // 排序
        Collections.sort(li);
        //排序后使用
        System.out.println("排序后1111 ： " + li);


        //list转数组
        String[] strArray = new String[li.size()];
        //数组转链表，li转换成数组后存储在strArray数组中
        li.toArray(strArray);
        for( String str: strArray){
            System.out.println("str array: " + str);
        }

        //先创建li的迭代器
        Iterator<String> iter = li.iterator();
        while (iter.hasNext()){
            String ele = iter.next();
            System.out.println("----ele: " + ele);
        }




    }


}
