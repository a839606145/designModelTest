package designModel.adapter;
/**
 * 适配器模式：类适配器，对象适配器，接口适配器
 *   1.一个接口有太多的方法，而有些它的实现类不需要这么多方法，就可以使用适配器
 *   2.三星插座：大陆的插座就是一个Source类，目标的接口就是我们的手机，此时需要一个接口转化器（适配器）在联通这两个
 * 类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
 * 对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
 * 接口的适配器模式：当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可

 * @author lzx
 *
 */
public class Adapter extends Source implements TargetInterface{

	public void newF() {
	   System.out.println("this is new F");
		
	}
	public static void main(String args[]){
		Adapter a=new Adapter();
		a.old();
		a.newF();
	}

}
