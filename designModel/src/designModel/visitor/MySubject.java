package designModel.visitor;

public class MySubject implements Subject{

	public void accept(Visitor v) {
		v.visit(this);
	}

	public String getSubject() {
		return "loheo";
	}

}
