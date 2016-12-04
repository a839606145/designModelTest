package designModel.multiFactory;

public class Factory {
	/**
	 * 静态工厂 将方法定义为static
	 * @return
	 */
	public Product createApple(){
			return new Apple();
	}
	public static void main(String args[]){
		Factory factory=new Factory();
		factory.createApple().make();
	}

}
