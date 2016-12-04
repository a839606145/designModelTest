package designModel.single;

public class InnerClass {
	private int number;
	public InnerClass(int number){
		this.number=number;
	}
	public InnerClass(){
	}
	
	public void Test(){
		class InnClas{
			private InnClas(){
				System.out.println("ddd");
			}
		}
	}
	public class InClass{
		public void printS(){
			System.out.println(number);
		}
		
		public InnerClass getInnerClass(){
			return InnerClass.this;
		}
		public InnerClass createInnerClass(){
			return new InnerClass();
		}
	}
	
	
	public static void main(String args[]){
		InnerClass cl=new InnerClass(5);
		cl.Test();
		InnerClass.InClass in=cl.new InClass();
		InnerClass c2=in.createInnerClass();
		InnerClass c3=in.getInnerClass();
		System.out.println(cl==c2);
		System.out.println(cl==c3);
		
	}

}
