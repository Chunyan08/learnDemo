package FilePathDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class StreamIoDemo {


    public static void main(String[] args) throws IOException {
        //创建BufferedReader 对象 ,read() 方法从控制台读取一个字符，或者用 readLine() 方法读取一个字符串
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符 直到按下q!结束");
        char c;
        do{
            c = (char) br.read();
            System.out.println("c: " + c);
        }while (c!='q');
        String str;
        do{
            str = br.readLine();
            System.out.println("str: " + str);
        }while (!str.equals("end"));

    }



}
