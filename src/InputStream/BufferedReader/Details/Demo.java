package InputStream.BufferedReader.Details;
import java.io.BufferedReader;
import java.io.FileReader;

//演示BufferedReader的使用
public class Demo {
    public static void main(String[] args) throws Exception{

        String filePath = "/home/hxlb3422/Downloads/test/story.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取
        String line;//按行读取，效率高
        //1.bufferedReader.readLine() 是按行读取文件
        //2.当返回一个空时，文件读取完毕
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        //关闭流,这里注意，只需要关闭我们的 bufferedReader就可以了，因为底层会自动关闭我们的节点流
        bufferedReader.close();
    }
}

