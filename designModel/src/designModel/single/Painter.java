package designModel.single;
/**
 * 普通内部类不能有static修饰
 * 嵌套类可以有static修饰，并且只能访问主类static的属性
 * @author lzx
 *
 */
public class Painter {
  public InnerClass2 getClass2(final String name){ //必须使用final修饰
	  return new InnerClass2(){ //匿名类 实现了接口
		{
			System.out.println(name);
		}
		public void paint() {
		 System.out.println("hhhh");	
		}
	  };
  }
  
  public static void main(String args[]){
	  Painter p=new Painter();
	  p.getClass2("helol");
  }
  
}
