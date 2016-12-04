package designModel.observe;

import java.util.Vector;

public class AbstractSubject implements Subject{
	private Vector<Observe> vector = new Vector<Observe>();  
	public void add(Observe o) {
		vector.add(o);
	}

	public void delete(Observe o) {
		vector.remove(o);
	}

	public void myOp() {
		
	}

	public void notifyObserve() {
		for(int i=0;i<vector.size();i++){
			vector.get(i).update();
		}
	}

}
