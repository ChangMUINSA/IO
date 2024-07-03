package Buffered.BufferedInputOutputStream;

import java.io.*;

/**
 * 编程完成图片/音乐的拷贝（要求使用Buffered...流）
 * 演示 BufferedInputStream BufferedOutputStream 的使用
 * 使用他们可以完成二进制拷贝
 * 当然也可以操作文本文件
 * 但是字符流不能操作二进制文件
 */
public class Demo {
    public static void main(String[] args) {
        String srcFilePath = "/home/hxlb3422/Documents/multi_threads/1.jpg";
        String desFilePath = "/home/hxlb3422/Downloads/test/new1.jpg";

        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;

        byte[] buff = new byte[1024];
        int readLen = 0;



        try {
            bi = new BufferedInputStream(new FileInputStream(srcFilePath));
            bo = new BufferedOutputStream(new FileOutputStream(desFilePath));

            //循环的读取文件，并写入到desFilePath
            while ((readLen = bi.read(buff)) != -1){
                bo.write(buff,0,readLen);
            }
            System.out.println("文件拷贝完毕！");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流，关闭外层流即可，底层会去关闭节点流
            try {
                if (bi != null) {
                    bi.close();

                }
                if (bo != null) {
                    bo.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
