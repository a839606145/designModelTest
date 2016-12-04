package designModel.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式
 * @author lzx
 *
 */
public class PrototypeTest implements Cloneable,Serializable{
  private int a;
  private String b;
  private StringBuffer sb;
  private A as=new A();
  public PrototypeTest(){}
  public PrototypeTest(int a,String b,StringBuffer sb){
	  this.a=a;
	  this.b=b;
	  this.sb=sb;
	  as.setVa("1");
  }
  public Object clone() throws CloneNotSupportedException{
	  PrototypeTest p=(PrototypeTest) super.clone();
	  return p;
  }
  //深复制 注意必须序列化 属性的对象类也要实现序列化
  public Object deepClone() throws IOException, ClassNotFoundException {
	  ByteArrayOutputStream bos=new ByteArrayOutputStream();
	  ObjectOutputStream oos=new ObjectOutputStream(bos);
	  oos.writeObject(this);
	  
	  ByteArrayInputStream bin=new ByteArrayInputStream(bos.toByteArray());
	  ObjectInputStream oin=new ObjectInputStream(bin);
	  return oin.readObject();
  }
  public void setSb(){
	  sb=new StringBuffer("eee");
  }
  public void changeAs(){
	  as.setVa("d");
  }
  public void print(){
	  System.out.println(a+":"+b+":"+sb+":"+as.getVa());
  }
  public static void main(String[] args){
	  PrototypeTest t=new PrototypeTest(1,"3",new StringBuffer("34"));
	  PrototypeTest ct;
	  PrototypeTest ct2;
	try {
		ct = (PrototypeTest) t.clone();
		ct2=(PrototypeTest) t.deepClone();
		ct.print();
		ct2.print();
		t.changeAs();
		ct.print();
		ct2.print();
		System.out.println(ct==t);
		System.out.println(ct2==t);
	} catch (Exception e) {
		e.printStackTrace();
	}
	  
  }
}
class A implements Serializable{
	String va;
	public void setVa(String a){
		va=a;
	}
	public String getVa(){
		return va;
	}
}
