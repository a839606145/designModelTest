package designModel.observe;
/**
 * 观察者模式：
 *   首先要有被观察者，观察者
 *   	因为观察者可以有多个，且被观察者 需要知道如何通知不同的观察者
 *   所有设计一个 观察者接口，提供统一方法给被观察者
 *      因为被观察者添加观察者对象时 方法一致，以及通知的方法也一致，因此使用抽象类（实现一个接口）
 * @author lzx
 *
 */
public class MySubject extends AbstractSubject {
  public void Myop(){
	  System.out.println("I am change");
	  notifyObserve();
  }
  
  public static void main(String args[]){
	  MySubject o=new MySubject();
	  o.add(new Observe1());
	  o.Myop();
  }
}
