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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		System.out.print("Root val : "+root.val);
	}

}
