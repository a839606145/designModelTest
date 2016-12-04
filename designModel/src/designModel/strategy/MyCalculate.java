package designModel.strategy;
/**
 * 策略模式：同一地方法不同的实现 用户选择
 * 
 * @author lzx
 *
 */
public class MyCalculate {
  public static void main(String args[]){
	  ICalcute c=new Plus();
	  c.calculte("2+3");
  }
}
