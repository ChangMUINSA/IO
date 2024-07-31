package InputStreamReaderAndOutputStreamWriter.InputStreamReader;

import java.io.*;

/**
 * 编程将 字节流FileInputStream 包装成（转换成）字符流InputStreamReader,对文件进行读取（按照utf-8格式），进而再包装成BufferedReader
 * 演示使用InputStreamReader转换流解决中文乱码问题
 * 将字节流FileInputStream转换成字符流InputStreamReader,指定编码gbk/utf-8
 *
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/hxlb3422/Downloads/test/story.txt";
        //1.把 FileInputStream 转换成了 InputStreamReader
        //2.指定编码 gbk
        //InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"Unicode");
        //3.把 InputStreamReader 传入 BufferedReader
        //BufferedReader br = new BufferedReader(isr);


        //将第二步，第三部合在一起
        BufferedReader br = new BufferedReader(new InputStreamReader(
                                                    new FileInputStream(filePath),"Unicode"));
        //4.读取
        String s = br.readLine();
        System.out.println("读取到内容=" + s);

        //5.关闭外层流
        br.close();
    }

}
