package designModel.iterator;
/**
 * 迭代器模式：迭代器是对集合进行迭代，所以迭代器中含有集合的对象
 *            集合要用迭代器迭代，使用方法返回一个迭代器
 * @author lzx
 *
 */
public class MyTest {
  public static void main(String args[]){
	  MyCollect c=new MyCollect();
	  Iterator it=c.iterator();
  }
}
