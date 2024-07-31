package Object.ObjectOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/**
 * 演示ObjectOutputStream的使用，完成序列的数据化
 * 使用ObjectOutputStream 序列化 基本数据类型和 一个Dog对象（name,age）,并保存到data.dat文件中
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        //序列化后，保存的文件格式，不是纯文本，而是按照他的格式来保存的
        String filePath = "/home/hxlb3422/Downloads/test/data.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        //序列化数据到 /home/hxlb3422/Downloads/test/data.dat 中
        //转换的的大写的皆为包装类
        oos.writeInt(100); //int -> Integer(实现了Serializable接口)
        oos.writeBoolean(true); //boolean -> Boolean (实现了Serializable接口)
        oos.writeChar('a'); //char -> Character (实现了Serializable接口)
        oos.writeDouble(9.5); //double -> Double (实现了Serializable接口)
        oos.writeUTF("Java圣体");// String
        //保存一个Dog对象
        oos.writeObject(new Dog("旺财",3,"日本","白色"));
        oos.close();
        System.out.println("数据保存完毕（序列化形式）");
    }
}

