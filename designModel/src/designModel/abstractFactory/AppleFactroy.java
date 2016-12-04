package designModel.abstractFactory;

public class AppleFactroy implements Factory {

	public Product crateProduct() {
		return new Apple();
	}

}
