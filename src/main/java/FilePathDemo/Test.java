package FilePathDemo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    private static Path testDir;

    public static void main(String[] args) {
        /*
        * 静态的Paths.get方法接受一个或多个字符串，并将他们用默认文件系统的路径分隔符
        * （类Unix文件系统是/，Windows是\）连接起来。然后解析连接起来的结果，
        * 如果其表示的不是给定文件系统中的合法路径，那么就抛出InvalidPathException异常。
        * 这个连接起来的结果就是一个Path对象。
        * */
        Path absolute = Paths.get("/Users", "acton_zhang");
        Path relative = Paths.get("pers", "zhang", "ThreadDemo.java");
        System.out.println("absolute: " + absolute);
        System.out.println("relative: " + relative);

    }
}
