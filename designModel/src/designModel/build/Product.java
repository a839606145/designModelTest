package designModel.build;

public interface Product {
	/*
	 * 不能实例化
	 * 不能实现另一个接口
	 */
	String name="产品";//默认是public static final 显示初始化
	public void make();//默认是public static 不能有方法体

}
