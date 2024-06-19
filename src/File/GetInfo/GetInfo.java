package File.GetInfo;

import org.junit.jupiter.api.Test;

import java.io.File;

public class GetInfo {
    public static void main(String[] args) {

    }

    //获取文件的信息
    @Test
    public void info(){
        //先创建文件对象
        File file = new File("/home/hxlb3422/Downloads/news1.txt");

        //调用相应方法，得到对应信息
        System.out.println("文件名字="+file.getName());
        System.out.println("文件绝对路径="+file.getAbsolutePath());
        System.out.println("文件的父目录="+file.getParent());
        System.out.println("文件的大小(字节)="+file.length());
        System.out.println("文件是否存在="+file.exists());
        System.out.println("文件是不是一个文件="+file.isFile());
        System.out.println("文件是不是一个目录="+file.isDirectory());


    }
}
