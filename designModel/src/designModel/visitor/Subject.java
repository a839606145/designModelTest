package designModel.visitor;

public interface Subject {
 public void accept(Visitor v);
 public String getSubject();
}
