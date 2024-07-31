package InputStreamReaderAndOutputStreamWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 看一个中文乱码问题
 */
public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        //读取 /home/hxlb3422/Downloads/test/story.txt 到程序
        //思路
        //1.创建字符输入流 BufferedReader[处理流]
        //2.使用BufferedReader对象读取story.txt文件
        //3.默认情况下，读取文件是按照 utf-8 编码的
        String filePath = "/home/hxlb3422/Downloads/test/story.txt";


        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String s = br.readLine();
        System.out.println("读取读到的内容："+s);

        br.close();
    }
}
