 class Node<T>{
	Node(T x){
		this.value = x;
	}	
	T value;
	Node<T> left ;
	Node<T> right;
}
public class DFS {
	static int sum =0;
	static int s = -2;
	
	public static void main(String args[]) {	
		Node<Integer> rootNode=createBT();
		System.out.println(DFSearch(rootNode));			
	}
 public static Node<Integer> createBT() { 
	 Node<Integer> root = new Node<Integer>(1);
	 root.left = new Node<Integer>(2);
	 root.right = new Node<Integer>(3);
	 root.left.left = new Node<Integer>(4);
	 root.left.left.left  = new Node<Integer>(-8);
  // root.left.left.right = new Node<Integer>(9);
	 root.left.right = new Node<Integer>(5);
  // root.left.right.left = new Node<Integer>(10);
  // root.left.right.right = new Node<Integer>(11);
	 root.right.left = new Node<Integer>(6);
	 root.right.right = new Node<Integer>(7);
	 return root;
 }
 public static boolean DFSearch(Node<Integer>node) {
	 
	 System.out.println(node.value);
	 sum += node.value; 
	 
	 if(node.left!=null)
	 DFSearch(node.left); 
	 
	 if(node.right!=null)
	 DFSearch(node.right); 
	 
     if(sum == s)
	 return true;
     sum-=node.value;
     return false;
 }
}
