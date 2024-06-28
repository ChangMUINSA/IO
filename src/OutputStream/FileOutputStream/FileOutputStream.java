package OutputStream.FileOutputStream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutputStream {
    /**
     * 使用FileOutputStream在a.txt文件中写入“hello,word",如果文件不存在会创建文件，前提是目录已经存在
     */
    public static void main(String[] args) {

    }

    /**
     * 演示FileOutputStream将数据写到文件中
     * 如果该文件不存在，则创建该文件
     */
    @Test
    public void writeFile(){
        //创建FileOutputStream对象
        String pathFile = "/home/hxlb3422/Desktop/a.txt";
        java.io.FileOutputStream fileOutputStream = null;

        try {
            //得到 FileOutputStream对象
            //1.new java.io.FileOutputStream(pathFile) 创建方式，当写入内容时会覆盖原来的内容
            //2.new java.io.FileOutputStream(pathFile,true)创建方式，当写入内容时会追加到文件后面
            fileOutputStream = new java.io.FileOutputStream(pathFile,true);
            //写入一个字节
            //fileOutputStream.write('a');//char和int可以自动互转

            //写入字符串
            //str.getBytes() 可以把字符串 转换成 字节数组
            String str = "javast,yes!";
            //fileOutputStream.write(str.getBytes());
            //将len字节从位于偏移量off的指定字节数组写入此问价输出流
            //fileOutputStream.write(str.getBytes(),0,str.length());//等价上述写法
            fileOutputStream.write(str.getBytes(),0,2);//等价上述写法
            fileOutputStream.write(str.getBytes(),0,str.length());//等价上述写法

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
