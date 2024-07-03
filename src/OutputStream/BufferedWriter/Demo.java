package OutputStream.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/hxlb3422/Downloads/test/write.txt";
        //创建BufferedWriter对象
        //说明：
        //1.new BufferedWriter(new FileWriter(filePath,true))表示以追加的方式写入
        //2.new BufferedWriter(new FileWriter(filePath))表示以覆盖的方式写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("你好，畅！");
        bufferedWriter.newLine();//插入一个和系统相关的换行符
        bufferedWriter.write("你好2，畅！");
        bufferedWriter.newLine();//插入一个和系统相关的换行符
        bufferedWriter.write("你好3，畅！");
        bufferedWriter.newLine();//插入一个和系统相关的换行符
        //插入一个换行符

        //说明关闭外层流即可，传入的 new FileWriter(filePath)，会在底层关闭
        bufferedWriter.close();
    }
}
