package designModel.observe;

public interface Subject {
   public void add(Observe o);
   public void delete(Observe o);
   public void notifyObserve();
   public void myOp();
}
