package SerializeDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Serialize {

    String filePa = this.getClass().getResource("").getPath();

    public static void main(String[] args){
        /*
        * */
        Employee emp = new Employee();
        emp.name = "lucy";
        emp.address = "上东街16号";
        emp.age = 18;
        emp.SSN = 11122333;
        //设定当前文件夹
//        File directory = new File("employee.ser");
        //获取当前文件路径  D:\test11\learnDemo\src\main\SerializeDemo\employee.ser
        File filePath = new File(System.getProperty("user.dir") + File.separator + "src/main/java/SerializeDemo" + File.separator + "employee.ser");
        System.out.println("filePath: " + filePath);

        try {
            //声明文件输出流，如果文件不存在则会自动创建
            FileOutputStream fileOut = new FileOutputStream(filePath);
            //ObjectOutputStream  负责把对象转换成数据
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            //关闭
            fileOut.close();
            //关闭输出流
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Serialized data is saved in employee.ser");
    }
}
