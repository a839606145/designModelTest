package designModel.state;
/**
 * 状态模式：根据状态的改变，执行不同的方法
 * 一个状态类：有状态的值 以及执行的方法
 * 一个有关状态改变的类：控制状态的改变
 * @author lzx
 *
 */
public class Content {
 private State state;

 public Content(State state){
	 this.state=state;
 }
public State getState() {
	return state;
}

public void setState(State state) {
	this.state = state;
}

public void method(){
	if(state.getValue().equals("1")){
		state.method1();
	}else{
		state.method2();
	}
}
 
}
