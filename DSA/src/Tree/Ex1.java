package Tree;
class Node1 {
	int item;
	Node left,right ;
	public Node1(int key) {
		item = key;
		left = right = null;			
	}
}
public class Ex1 {
	Node root;
	Ex1(){
		root= null;
	}
	void inorder(Node node) {
		if(node==null)
			return;
		inorder(node.left);
		System.out.print(node.item+"->");
		inorder(node.right);
	}
	

	public static void main(String[] args) {
		Ex1 tree = new Ex1();
		tree.root=new Node(1);
		tree.root.left = new Node(12);
		tree.root.right=new Node(13);
		tree.root.left.left=new Node(6);
		tree.root.left.right=new Node(10);
		tree.root.left.left.left=new Node(2);
		tree.root.left.left.right=new Node(3);
		tree.root.right.left=new Node(8);
		tree.root.right.right=new Node(9);
		System.out.println("Inorder : ");
		tree.inorder(tree.root);
		

	}

}
