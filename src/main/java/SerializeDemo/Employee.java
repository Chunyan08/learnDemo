package SerializeDemo;

//继承java.io.Serializable接口的
public class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public int age;
    public transient int SSN;

    public void mailCheck(){
        System.out.println("name: " + name + " address: " + address);
    }
}
