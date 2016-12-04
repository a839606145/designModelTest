package designModel.composite;
/**
 * 多用于树型结构
 * @author lzx
 *
 */
public class Tree {
	TreeNode root = null; 
	public Tree(String name){
		root=new TreeNode(name);
	}
	public static void main(String atgs[]){
		Tree tree=new Tree("A");
		TreeNode nodeB=new TreeNode("B");
		tree.root.add(nodeB);
	}
}
