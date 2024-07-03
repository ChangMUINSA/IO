package Buffered.BufferedReaderWriter;

import java.io.*;

/**
 * 综合使用 BufferedReader 和 BufferedWriter 完成文本文件拷贝，注意文件编码
 * BufferedReader 和 BufferedWriter 是按照字符操作
 * 不要去操作二进制文件，可能造成文件损坏
 */
public class DemoReaderPlusWriter {
    public static void main(String[] args)  {
        String srcFilePath = "/home/hxlb3422/Downloads/test/story.txt";
        String desFilePath = "/home/hxlb3422/Downloads/test/write.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;

        String line;

        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(desFilePath));
            //说明： readLine 读取一行的内容，但是没有换行
            while ((line = br.readLine()) != null){
                //每读取一行就写入
                bw.write(line);
                //插入一个换行
                bw.newLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (br != null){
                    br.close();
                }
                if (bw != null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



        }




    }

