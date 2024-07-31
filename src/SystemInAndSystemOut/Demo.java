package SystemInAndSystemOut;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //System 类 的 public final static InputStream in = null;
        //System.in 的编译类型 InputStream
        //System.in 的运行类型 BufferedInputStream
        //表示标准输入 键盘

        System.out.println(System.in.getClass());


        // System.out public final static PrintStream out = null;
        //编译类型：PrintStream
        //运行类型：PrintStream
        //表示标准输出 显示器
        System.out.println(System.out.getClass());
        System.out.println("hello,Chang!");

        //Scanner会从我们的键盘输入获取数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入内容");
        String next = scanner.next();
        System.out.println("next = "+next);
    }
}
