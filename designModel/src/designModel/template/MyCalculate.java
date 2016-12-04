package designModel.template;
/**
 * 模块模式：有一个主方法，里面调用另一个方法，此方法有不同的实现
 * 后面的类似于策略，因为有一个主方法，所以使用抽象类
 * 
 * @author lzx
 *
 */
public class MyCalculate {
  public static void main(String args[]){
	  ICalcute c=new Plus();
	  c.split("2+3");
  }
}
