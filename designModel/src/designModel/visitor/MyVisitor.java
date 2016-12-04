package designModel.visitor;
/**
 * 观察者模式：观察者 被观察者 都有一个接口
 *            观察者：能动态的设置要观察谁（使用方法）
 *            被观察者：能动态的接收观察者（使用方法）
 * @author lzx
 *
 */
public class MyVisitor implements Visitor{

	public void visit(Subject subject) {
		System.out.println(subject.getSubject());
	}
	public static void main(String args[]){
		MyVisitor v=new MyVisitor();
		v.visit(new MySubject());
	}

}
