package CollectDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("wo");
        linkedList.add("are");
        linkedList.add("employee");
        System.out.println("______________");
        //遍历
        for(String i: linkedList){
            System.out.println(i);
        }
        linkedList.addLast("ppppp");
        linkedList.addFirst("eeeeeeee");
        linkedList.add(3,"four");
        System.out.println("______________");
        //遍历
        for(String i: linkedList){
            System.out.println(i);
        }
        System.out.println("third ele: " +linkedList.get(2));
        System.out.println("get first: " +linkedList.getFirst());
        System.out.println("get last: " +linkedList.getLast());

        LinkedList<String> newLink = new LinkedList<String>();
        newLink.add("huang");
        newLink.add("fei");
        //add整个linklist
        linkedList.addAll(newLink);
        System.out.println("add All");
        for(String i: linkedList){
            System.out.println(i);
        }
        Iterator itera = linkedList.iterator();
        System.out.println("遍历linkedlist元素");
        while (itera.hasNext()){
            System.out.println(itera.next());
        }
    }
}
