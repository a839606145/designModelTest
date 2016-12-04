package designModel.Mediator;
/**
 * 中介模式：消除 A和B之前的相互关联，大家都和中介关联就行
 * @author lzx
 *
 */
public class MyMediator implements Mediator{
 private Users user1;
 private Users user2;
public void createMediator() {
	user1=new User1(this);
	user2=new User2(this);
}
public void workAll() {
	user1.work();
	user2.work();
}
 
}
