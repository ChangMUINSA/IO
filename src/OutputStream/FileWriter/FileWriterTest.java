package OutputStream.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {

        String filePath = "/home/hxlb3422/Downloads/test/write.txt";
        //创建FileWriter对象
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c'};
        try {

            fileWriter = new FileWriter(filePath);//默认是覆盖写入
            //写入单个字符
            fileWriter.write('H');
            //写入指定数组
            fileWriter.write(chars);
            //写入指定数组的指定部分
            fileWriter.write("畅畅圣体".toCharArray(),0,2);
            //写入整个字符串
            fileWriter.write("你好巴黎");
            //写入字符串的指定部分
            fileWriter.write("chang chang ST",0,9);
            //在数据量大的情况下可以使用循环操作

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ///对应的FileWriter,一定要关闭流，或者flush,才能真正的把数据写入到文件
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("程序结束");

    }
}
