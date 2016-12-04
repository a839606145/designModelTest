package designModel.interpreter;

public class Plus implements Express{

	public int interpret(Content c) {
		return Math.abs(c.getNum1()-c.getNum2());
	}

}
