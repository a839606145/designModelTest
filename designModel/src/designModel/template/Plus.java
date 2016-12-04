package designModel.template;

public class Plus extends ICalcute{

	public int calculte(String exp) {
		String[] l=exp.split(";");
		return l.length;
	}

}
