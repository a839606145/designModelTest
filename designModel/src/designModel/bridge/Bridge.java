package designModel.bridge;

public abstract class Bridge {
  private Computer computer;
  
  public void open(){
	  computer.open();
  }

public Computer getComputer() {
	return computer;
}

public void setComputer(Computer computer) {
	this.computer = computer;
}
  
}
