package CollectDemo;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        /*
        * HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。
        * HashSet 允许有 null 值。
        * 无序
        *不是线程安全的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。 您必须在多线程访问时显式同步对 HashSet 的并发访问。
        *
        *  */
        HashSet<String> sites = new HashSet<String>();
        //add
        sites.add("chrome");
        sites.add("edge");
        sites.add("taobao");
        sites.add("taobao");
        sites.add("jigndong");
        sites.add("ssssss");
        sites.add("www");
        sites.add("wo");
        sites.add("ta");


        HashSet<String> sites1 = new HashSet<String>();
        sites1.add("chrome");
        sites1.add("edge");
        sites1.add("taobao");
        //remove
        sites.remove("www");
        sites.removeAll(sites1);
//        sites.removeIf();

        //size
        System.out.println("sites size：" + sites.size());

        for(String i: sites){
            System.out.println(i);
        }
        //clear
        sites.clear();







    }
}


