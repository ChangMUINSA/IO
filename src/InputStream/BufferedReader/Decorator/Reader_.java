package InputStream.BufferedReader.Decorator;

/**
 * 模拟修饰器（设计者模式）
 */
public abstract class Reader_ {//抽象类
    //在Reader_抽象类，分开管理
    public void readFile(){}
    public void readString(){}

    //或者在Reader_抽象类，使用read方法统一管理
    //后面在调用时，利用对象动态绑定机制，来绑定到对应的实现子类即可.
    //public abstract void read();

}

