package designModel.dectorate;
/**
 * 装饰类：应该告知要装饰的是谁 所以传入一个参数
 *        装饰类装饰对要实现的类 添加一些东西，不会代替 所以实现同一个接口
 * 静态代理模式类似于装饰模式
 * @author lzx
 *
 */
public class Decorate implements SourcePrint {
  private SourcePrint base;
  public Decorate(SourcePrint base){
	  super();
	  this.base=base;
  }
  public void print(){
	  System.out.println("hello");
	  base.print();
  }
}
