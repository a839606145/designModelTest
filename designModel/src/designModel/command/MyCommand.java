package designModel.command;

public class MyCommand implements Command{
    private Receiver receiver;
    public MyCommand(Receiver reveiver){
    	this.receiver=reveiver;
    }
	public void exe() {
		receiver.action();
	}

}
