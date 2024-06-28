package InputStream.FileReader;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
        String filePath = "/home/hxlb3422/Downloads/test/story.txt";
        java.io.FileReader  fileReader = null;
        int data = ' ';
        //1.创建FileReader对象
        try {
            fileReader = new java.io.FileReader(filePath);
            //循环读取 使用read,单个字符读取
            while ((data = fileReader.read())!= -1){
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 字符数组读取文件
     */
    @Test
    public void readFile02(){
        System.out.println("~~~~~~~~~~02~~~~~~~~~~~");
        String filePath = "/home/hxlb3422/Downloads/test/story.txt";
        java.io.FileReader  fileReader = null;
        int readLen = 0;
        char[] buf = new char[8];
        //1.创建FileReader对象
        try {
            fileReader = new java.io.FileReader(filePath);
            //循环读取 使用read(buf),返回的是实际读取到的字符数
            //如果返回-1说明文件结束
            while ((readLen = fileReader.read(buf))!= -1){
                System.out.print(new String(buf,0,readLen));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
