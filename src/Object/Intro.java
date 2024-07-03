package Object;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Intro {
    /**
     * 对象流 ObjectInputStream ObjectOutputStream
     *
     * 能够将基本的数据类型 或者对象进行序列化 和反序列化操作
     *
     * 例如： 将 int = 100数据保存到文件中，注意不是100数字 ,而是int100，并且，能够从文件中直接恢复int100
     * 将Dog dog = new Dog("小黄"，3)这个Dog对象保存到文件中，并且能够从文件中恢复
     *
     * 序列化和反序列化
     * 序列化就是在保存数据时，保存数据的值和数据的类型
     * 反序列化就是在恢复数据时，恢复数据的值和数据类型
     * 需要让某个对象支持序列化机制，则必须让其类是可序列化的，该类必须实现两个借口之一
     * Serializable //这是一个标记接口
     * Externalizable
     */

}
