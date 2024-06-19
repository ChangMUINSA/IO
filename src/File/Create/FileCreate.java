package File.Create;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

//演示创建文件
public class FileCreate {
    public static void main(String[] args) {

    }
    //方式一： new File(String pathname) 根据路径构建一个File对象
    @Test
    public void create01(){
        String filePath = "/home/hxlb3422/Downloads/news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //方式二：new File(File parent,String child) 根据父目录文件+子路径构建
    @Test
    public void create02(){
        File parentFile = new File("/home/hxlb3422/Downloads");
        String fileName = "news2.txt";
        //这里的file对象，在java程序中，只是一个对象
        File file = new File(parentFile, fileName);

        try {
            //只有真正执行了 file.createNewFile() 方法，才会在磁盘创建该文件
            file.createNewFile();
            System.out.println("创建成功~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //方式三：new File(String parent,String child) 根据父目录+子路径构建
    @Test
    public void create03(){
        String parentPath = "/home/hxlb3422/Downloads";
        String fileName = "news3.txt";
        File file = new File(parentPath, fileName);

        try {
            file.createNewFile();
            System.out.println("创建成功~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
