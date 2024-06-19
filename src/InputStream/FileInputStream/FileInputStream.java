package InputStream.FileInputStream;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 演示ileInputStream的使用（字节输入流  文件--->程序）
 */
public class FileInputStream {

    //使用FileInputStream读取hello.txt文件，并将文件内容显示到控制台

    public static void main(String[] args) {

    }

    /**
     * 演示读取文件...
     * 单个字节的读取，效率比较低
     */
    @Test
    public void readFile01(){
        String filePath = "/home/hxlb3422/Desktop/hello.txt";
        int readData = 0;
        java.io.FileInputStream fileInputStream = null;
        try {
            //创建public FileInputStream 对象用于读取文件
            fileInputStream = new java.io.FileInputStream(filePath);
            //从该输入流读取一个字节的数据，如果没有输入可用，此方法将阻止.
            //如果返回-1,表示文件读取完毕.
            while ((readData = fileInputStream.read())!= -1){
                System.out.print((char) readData); //转成char显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    /**
     * 使用read(byte[] b),读取文件提高效率
     */
    @Test
    public void readFile02() {
        String filePath = "/home/hxlb3422/Desktop/hello.txt";
        int readLen = 0;
        byte[] buf = new byte[8];//一次读取8个字节.
        java.io.FileInputStream fileInputStream = null;
        try {
            //创建public FileInputStream 对象用于读取文件
            fileInputStream = new java.io.FileInputStream(filePath);
            //从该输入流读取最多b.length字节的数据到字节数组，如果没有输入可用，此方法将阻止.
            //如果返回-1,表示文件读取完毕.
            //如果读取正常，返回实际读取的字节数
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen)); //显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
