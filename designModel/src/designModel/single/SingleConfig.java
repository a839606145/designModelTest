package designModel.single;
/**
 * 注意点：
 * 私有的构造方法
 * 私有的实体类对象 
 * public static 的方法
 * 同步机制 使用内部类进行 因为类加载的时候是互斥的
 * @author lzx
 * 内部类学习：
 *   内部类含有外部类的引用，使用this 得到它的外部类实体
 *  方法中的内部类：不能添加修饰词
 */
public class SingleConfig {
	static{
		System.out.println("config");
	}
  private SingleConfig(){
	  System.out.println("config1");
	  }
  
  public static SingleConfig getInstance(){
	  return ConfigFactory.config;
  }
  private static class ConfigFactory{
	  static{
		  System.out.println("con");
	  }
	  
	  public static SingleConfig config=new SingleConfig();
  }
  
  public static void main(String args[]){
	  SingleConfig.getInstance();
  }
}
