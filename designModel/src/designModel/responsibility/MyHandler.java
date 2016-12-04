package designModel.responsibility;
/**
 * 责任链模式：特点，你处理完要交给下一个处理 一个接一个
 * 使用一个接口，表示大家的操作
 * 使用一个抽象类，将下一个处理者的获取和设置 方法实现
 * 书写操作类，实现接口 继承抽象类
 * @author lzx
 *
 */
public class MyHandler extends AbstractHandler implements Handle{

	private String name; 
	public MyHandler(String name){
		this.name=name;
	}
	public void operation() {
		System.out.println(name+" deal");
		if(getHandle()!=null){
			getHandle().operation();
		}
	}
	
	public static void main(String args[]){
		MyHandler handle=new MyHandler("A");
		MyHandler handle2=new MyHandler("B");
		handle.setHandle(handle2);
		handle.operation();
	}

}
