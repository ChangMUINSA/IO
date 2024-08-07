package Object;

public class Attentions {
    /**
     * 读写顺序要一致
     * 要求实现序列化或反序列化对象，需要实现Serializable
     * 序列化的类中建议添加SerialVersionUID,为了提版本的兼容性
     * 序列化对象时，默认将里面所有属性都进行序列化，但除了static或transient修饰的成员
     * 序列化对象时，要求里面属性的类型也需要实现序列化接口
     * 序列化具有可继承性，也就是如果某类已经实现了序列化，则它的所有子类也已经默认实现了序列化
     *
     */
}
