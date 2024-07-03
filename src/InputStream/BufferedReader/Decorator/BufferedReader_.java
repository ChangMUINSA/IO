package InputStream.BufferedReader.Decorator;
//做成处理流/包装流
public class BufferedReader_ extends Reader_{
    private Reader_ reader_;//属性是 Reader_ 类型
    //接受Reader_的子类对象
    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }
    //不想修改方法，调用本身的方法
    public void readFile() {//封装一层
        reader_.readFile();
    }


    //让方法更加灵活，多次读取文件，或者加缓冲char[]...


    public void readFiles(int Num) {
        for (int i = 0; i < Num; i++) {
            reader_.readFile();
        }
    }
    //扩展readString方法，批量处理字符串数据
    public void readStrings(int Num){
        for(int i = 0; i < Num; i++ ) {
            reader_.readString();
        }

    }
}
