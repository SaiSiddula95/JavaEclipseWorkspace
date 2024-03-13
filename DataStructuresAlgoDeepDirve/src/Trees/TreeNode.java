package Trees;

public class TreeNode {
	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	
	public void insert(int value) {
		if(value==data) return;
		
		if(value<data) {
			if(leftChild == null) {
				leftChild = new TreeNode(value);
			}else {
				leftChild.insert(value);
			}
		}else {
			if(rightChild == null) {
				rightChild = new TreeNode(value);
			}else {
				rightChild.insert(value);
			}
		}
	}
	
	public void inOrderTraversal() {
		if(leftChild != null) {
			leftChild.inOrderTraversal();
		}
		System.out.print("Data ="+data+",");
		if(rightChild !=null) {
			rightChild.inOrderTraversal();
		}
	}
	
	public TreeNode get(int value) {
		if(value == data) {
			return this;
		}
		
		if(value>data && rightChild!=null) {
			return rightChild.get(value);
		}else{
			if(leftChild!=null) {				
				return leftChild.get(value);		
			}
		}
		
		return null;		
		
	}
	
	public TreeNode min() {
		if(leftChild==null) {
			return this;
		}else {
			return this.leftChild.min();
		}
		
	}
	
	public TreeNode max() {
		if(rightChild==null) {
			return this;
		}else {
			return this.rightChild.max();
		}
		
	}
	
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
    public String toString() {
        return "Data = " + data;
    }
}
