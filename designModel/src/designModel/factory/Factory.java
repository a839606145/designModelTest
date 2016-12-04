package designModel.factory;

public class Factory {
	
	public Product createProduct(String name){
		if("苹果".equals(name)){
			return new Apple();
		}else{
			return new Banana();
		}
	}
	public static void main(String args[]){
		Factory factory=new Factory();
		factory.createProduct("苹果").make();
		factory.createProduct("香蕉").make();
	}

}
