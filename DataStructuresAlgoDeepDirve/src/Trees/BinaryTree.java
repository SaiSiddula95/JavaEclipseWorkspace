package Trees;

public class BinaryTree {
	
	private TreeNode root;
	
	public void insert(int value) {
		if(root==null) { 
			root = new TreeNode(value);
		}else { 
			root.insert(value);		
		}
	}
	
	public void traverseInOrder() {
		if(root !=null) {
			root.inOrderTraversal();
		}
	}
	
	public TreeNode get(int value) {
		if(root!=null) {
			return root.get(value);
		}
		return null;
	}
	
	public TreeNode min() {
		if(root==null) {
			return null;
		}else {
			if(root.getLeftChild()==null) {
				return root;
			}else {
				return root.getLeftChild().min();
			}
		}
	}
	
	public TreeNode max() {
		if(root==null) {
			return null;
		}else {
			if(root.getRightChild()==null) {
				return root;
			}else {
				return root.getRightChild().max();
			}
		}
	}
	
	public void delete(int value) {
		root = delete(root,value);
	}
	
	private TreeNode delete(TreeNode subtreeRoot, int value){
		if(subtreeRoot == null) {
			return subtreeRoot;
		}
		if(value< subtreeRoot.getData()) {
			subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(),value));
		}else if(value > subtreeRoot.getData()) {
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(),value));
		}else {
			//cases 0 and 1: node to delete
			if(subtreeRoot.getLeftChild()==null) {
				return subtreeRoot.getRightChild();
			}else if(subtreeRoot.getLeftChild()==null) {
				return subtreeRoot.getRightChild();
			}
			
			//case 3: node to delete has 2 children:
			subtreeRoot.setData(subtreeRoot.getRightChild().min().getData());
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(),subtreeRoot.getData()));
		}
		
		return subtreeRoot;
	}
	
}
