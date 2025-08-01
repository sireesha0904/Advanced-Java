package DSA.Tree;
class TreeNode {
	int val;
	TreeNode left, right;
	
	TreeNode(int val){
		this.val = val;
		left = right = null;
	}
}
public class Main {

	static void preorder(TreeNode root) {
		if(root == null) return;
		System.out.print(root.val + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	static void inorder(TreeNode root) {
		if(root == null) return;
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}
	
	static void postorder(TreeNode root) {
		if(root == null) return;
		inorder(root.left);
		inorder(root.right);
		System.out.print(root.val + " ");
	} 
	
	static int countNodes(TreeNode root) {
		if(root == null) return 0;
		return 1 + countNodes(root.left) +  countNodes(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		System.out.println("Root val : "+root.val);
		
		System.out.println("Preorder Traversal:");
	    preorder(root);  // Output: 1 2 4 5 3
	    System.out.println();
	        
	        System.out.println("Inorder Traversal:");
	        inorder(root);  // Output: 1 2 4 5 3
	        System.out.println();

	        System.out.println("Postorder Traversal:");
	        postorder(root);  // Output: 1 2 4 5 3
	        System.out.println();

	        System.out.println("Total number of Nodes are : "+countNodes(root));

	}

}
