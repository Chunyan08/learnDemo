package SerializeDemo;

import java.io.*;

public class Deserialize {
    public static void main(String[] args){
        //下面的 DeserializeDemo 程序实例了反序列化，/tmp/employee.ser 存储了 Employee 对象。
        Employee e = null;

        File file = new File(System.getProperty("user.dir") + File.separator + "src/main/java/SerializeDemo" + File.separator + "employee.ser");

        try {
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        //当对象被序列化时，属性 SSN 的值为 111222333，但是因为该属性是短暂的，该值没有被发送到输出流。
        // 所以反序列化后 Employee 对象的 SSN 属性为 0。
        /*Deserialized Employee...
         *Name: lucy
         *Address: 上东街16号
         *SSN: 0
         *age: 18
         * */
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);

        System.out.println("SSN: " + e.SSN);
        System.out.println("age: " + e.age);


    }

}
