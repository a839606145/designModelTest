package designModel.strategy;

public class Plus implements ICalcute{

	public int calculte(String exp) {
		String[] l=exp.split(";");
		return l.length;
	}

}
