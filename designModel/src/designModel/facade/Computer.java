package designModel.facade;
/**
 * cpu 和 memory之间有关联 但内部的运行时无关的 使用另一个类将他们关联起来
 * @author lzx
 *
 */
public class Computer {
  private Cpu cpu;
  private Memory memory;
  public Computer(){
	  cpu=new Cpu();
	  memory=new Memory();
  }
  
  public void start(){
	  cpu.startUp();
	  memory.startUp();
  }
  
}
