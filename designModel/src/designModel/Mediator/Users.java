package designModel.Mediator;

public abstract class Users {
 private Mediator mediator;
 public Users(Mediator mediator ){
	 this.mediator=mediator;
 }
 public abstract void work();
public Mediator getMediator() {
	return mediator;
}

public void setMediator(Mediator mediator) {
	this.mediator = mediator;
}
 
}
