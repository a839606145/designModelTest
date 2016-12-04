/**
 * 
 */
package designModel.command;

/**命令模式：
 * 司令 给 士兵命令，士兵执行。
 * 命令可以有好多，使用接口，命令是需要人接收的
 * 司令要发送命令，得含有命令对象
 * @author lzx
 *
 */
public class Invoker {
 private Command command;
 public Invoker(Command command){
	  this.command=command;
 }
 public void action(){
	 command.exe();
 }
 public static void main(String args[]){
	 Receiver re=new Receiver();
	 Command cmd=new MyCommand(re);
	 Invoker in=new Invoker(cmd);
	 in.action();
 }
}
