package InputStream.BufferedReader.Decorator;

public class Test {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        bufferedReader_.readFile();//调用原有的方法
        //bufferedReader_.readFiles(10);

        //这次希望通过 BufferedReader_ 多次读取字符串
        BufferedReader_ bufferedReader2_ = new BufferedReader_(new StringReader_());
        //bufferedReader2_.readStrings(10);

    }
}
