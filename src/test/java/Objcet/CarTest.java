package Objcet;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void carTest(){
        //创建数组
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
    //键盘录入
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("enter car brand:");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("enter car color:");
            String color = sc.next();
            c.setColor(color);
            System.out.println("enter car price:");
            int price = sc.nextInt();
            c.setPrice(price);
            //
            arr[i] = c;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBrand());
        }

    }

}