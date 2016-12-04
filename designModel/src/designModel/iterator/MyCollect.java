package designModel.iterator;

public class MyCollect implements Collect{
	public String string[] = {"A","B","C","D","E"};  
	public int getSize() {
		return string.length;
	}
    /**
     * 这个地方使用了具体的类，能否使用抽象类（适配器模式）
     */
	public Iterator iterator() {
		return new MyIterator(this);
	}

	public Object get(int i) {
		return string[i];
	}

}
