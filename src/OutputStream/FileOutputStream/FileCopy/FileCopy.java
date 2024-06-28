package OutputStream.FileOutputStream.FileCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        //完成文件拷贝
        //将 3.jpg 从 /home/hxlb3422/Documents/multi_threads 拷贝到/home/hxlb3422/Desktop
        //思路分析
        //1.创建文件的输入流 将文件读入到程序
        //2.创建文件的输出流，将读取到的文件数据，写入到指定文件

        String srcFilePath = "/home/hxlb3422/Documents/multi_threads/3.jpg";
        String destFilePath = "/home/hxlb3422/Desktop/3.jpg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        //定义一个字节数组，提高读取效率
        byte[] buf = new byte[1024];
        int readLen = 0;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream  = new FileOutputStream(destFilePath);

            while ((readLen = fileInputStream.read(buf))!=-1){
                //读取到后就写入文件 通过fileOutputStream
                //即是边读遍写

                fileOutputStream.write(buf,0,readLen);//一定要使用这个方法
            }
            System.out.println("拷贝成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭输入流和输出流，释放资源
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
