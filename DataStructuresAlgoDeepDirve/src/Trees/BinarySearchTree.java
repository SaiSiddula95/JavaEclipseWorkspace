package Trees;

public class BinarySearchTree {
	
	public static void main(String[] args) {
		BinaryTree intTree = new BinaryTree();
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(32);
		
		intTree.traverseInOrder();
		System.out.println("---");
		
		System.out.println(intTree.get(30));
		System.out.println(intTree.get(25));
		System.out.println(intTree.get(3123123));
		System.out.println(intTree.get(145));
		System.out.println(intTree.get(15));
		System.out.println(intTree.get(32));
		System.out.println(intTree.get(26));
		
		
		System.out.println("Min: "+intTree.min());
		System.out.println("Max: "+ intTree.max());
		
	}
}
 