package StudentSystem;

import Objcet.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSys {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("1 添加学生");
            System.out.println("2 查询学生");
            System.out.println("3 修改学生");
            System.out.println("4 删除学生");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "1" -> addStudent(list);
                case "2" -> queryStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> delStudent(list);
                case "s" -> {
                    System.out.println("退出系统");
//                break loop;
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }


        }
        //添加
        public static void addStudent(ArrayList<Student> list) {

        }

        //删除
        public static void delStudent(ArrayList<Student> list) {

        }
        //修改
        public static void updateStudent(ArrayList<Student> list) {

        }
        //查询
        public static void queryStudent(ArrayList<Student> list) {

        }
    }
}
