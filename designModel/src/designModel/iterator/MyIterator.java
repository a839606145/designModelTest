package designModel.iterator;


public class MyIterator implements Iterator {
    public Collect collect;
    private int pos=-1;
    public MyIterator(Collect collect){
    	this.collect=collect;
    }
	public Object previous() {
		if(pos>0){
			pos--;
		}
		return collect.get(pos);
	}

	public Object next() {
		if(pos<collect.getSize()){
			pos++;
		}
		return collect.get(pos);
	}

}
