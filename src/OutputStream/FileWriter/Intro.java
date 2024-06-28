package OutputStream.FileWriter;

public class Intro {
    /**
     * FileWriter 按照字符来操作
     * FileWriter的常用方法
     * new FileWriter(File/String):覆盖模式，相当于流的指针在首端
     * FileWriter（File/String,true）:追加模式，相当于流的指针在尾端
     * write(int)：写入单个字符
     * write(char[]):写入指定数组
     * write（char[],off,len):写入指定数组的指定部分
     * write(String):写入整个字符串
     * write（String,off,len):写入字符串的指定部分
     * 相关API：String类：toCharArray:将String换成char[]
     * 注意：
     * FileWriter使用后，必须要关闭（close）或刷新（flush），否则写入不到指定的文件夹
     */
}
