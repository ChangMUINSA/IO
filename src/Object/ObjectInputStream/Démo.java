package Object.ObjectInputStream;

import Object.ObjectOutputStream.Dog;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 使用 ObjectInputStream 读取data.dat 并反序列化恢复数据
 */
public class Démo {
    public static void main(String[] args) throws Exception {
        //指定反序列化的文件
        String filePath = "/home/hxlb3422/Downloads/test/data.dat";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //读取
        //老师解读
        //1. 读取（反序列化）的顺序需要喝你保存数据（序列化）的顺序一致
        //2.否则会出现异常
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        //dog 的编译类型是Object， Dog的运行类型就是Dog
        Object dog = ois.readObject();
        System.out.println("运行类型=" + dog.getClass());
        System.out.println("dog信息="+dog); //底层 Object -> Dog

        //这里是特别重要的细节
        //1.如果我们希望调用Dog的方法，需要向下转型
        //2.需要我们将Dog类的定义，放到可以引用的位置（或者做成公共的可以引用的）
        //（序列化和反序列化对象路径要一致，Dog类需要被反序列化访问到，因为序列化时已经确定了包名）
        Dog dog1 = (Dog) dog;
        System.out.println(dog1.getName());//只会输出名字

        //关闭流,关闭外层流即可，底层会关闭 FileInputStream
        ois.close();



    }

}
