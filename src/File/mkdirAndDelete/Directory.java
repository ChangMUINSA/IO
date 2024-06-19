package File.mkdirAndDelete;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory {
    public static void main(String[] args) {

    }
    //判断/home/hxlb3422/Downloads/news2.txt 是否存在，如果存在就删除
    @Test
    public void m1(){
        String filePath ="/home/hxlb3422/Downloads/news2.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath+"删除成功");
            }else {
                System.out.println(filePath+"删除失败");
            }
        }else {
            System.out.println("该文件不存在！");
        }
    }
    //判断/home/hxlb3422/Downloads 目录是否存在，如果存在就删除，否则提示不存在
    //这里我们需要体会到，在java编程中，目录也被当做文件
    @Test
    public void m2(){
        String filePath ="/home/hxlb3422/Downloads/test";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath+"删除成功");
            }else {
                System.out.println(filePath+"删除失败");
            }
        }else {
            System.out.println("该目录不存在！");
        }
    }
    //判断/home/hxlb3422/Downloads 目录是否存在，如果存在就删除，否则就创建
    @Test
    public void m3(){
        String directoryPath ="/home/hxlb3422/Downloads/test/a/b";
       // String directoryPath ="/home/hxlb3422/Downloads/test";file.mkdir()  创建一级目录
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(directoryPath+"存在...");
        }else {
            if (file.mkdirs()){
                System.out.println(directoryPath+"该目录创建成功");
            }else {
                System.out.println(directoryPath+"该目录创建失败");

            }
        }
    }
}
