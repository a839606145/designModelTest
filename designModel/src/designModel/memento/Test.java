package designModel.memento;
/**
 * 备忘录模式：一个原始对象 创建一个存储器 在里面写入原始的值
 *            存储器是属于备忘录的。使用备忘录存储数据
 * @author lzx
 *
 */
public class Test {
 public static void main(String args[]){
	 Original a=new Original("1");
	 Storage storage = new Storage(a.createMemento());  
	 a.restoreMemento(storage.getMemento());
	 System.out.println(a.getValue());
 }
}
