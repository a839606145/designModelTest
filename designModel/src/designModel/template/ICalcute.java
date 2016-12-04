package designModel.template;

public abstract class ICalcute {
  public abstract int calculte(String exp);
  public  int split(String exp){
	  return calculte(exp);
  }
}
