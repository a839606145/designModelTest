package designModel.build;

import java.util.ArrayList;
import java.util.List;

/**
 * 修改了抽象类，构造复杂的对象
 * @author lzx
 *
 */
public class Factory {
	/**
	 * 建造者模型
	 * @return
	 */
	 private List<Product> list = new ArrayList<Product>();  
	public void createApple(int number){
		for(int i=0;i<number;i++){
			list.add(new Apple());
		}
	}

}
