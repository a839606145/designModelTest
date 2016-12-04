package designModel.interpreter;

public class Mulit implements Express{

	public int interpret(Content c) {
	 return	c.getNum1()*c.getNum2();
	}

}
