public class BSTtoDLL {
	public static void main(String[] args) {
		Node root = new Node(10, new Node(5, new Node(1), new Node(7)), new Node(15, new Node(12), new Node(17, new Node(16), null)));
		printBST(root);
		System.out.println("BSTtoDLL...");
		root = BSTtoDLL(root);
		System.out.println("printDLL...");
		printDLL(root);
		System.out.println("Done...");
	}

	public static void printBST(Node root) {
		if (root == null) return;
		printBST(root.left);
		System.out.println(root.data);
		printBST(root.right);
	}
	
	public static void printDLL(Node root) {
		if (root == null) return;
		System.out.println(root.data);
		printDLL(root.right);
	}
	

	static class Node {
		Node left;
		Node right;
		int data;

		public Node(int data) {
			this(data, null, null);
		}
		
		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	public static Node BSTtoDLL(Node root) {
		BSTtoDLL(root, null, null);
		while (root.left != null) root = root.left;
		return root;
	}

	public static void BSTtoDLL(Node root, Node next, Node prev) {
		if (root.left == null) {
			root.left = prev;
			if (prev != null) prev.right = root;
		} else {
			BSTtoDLL(root.left, root, prev);
		}
		
		if (root.right == null) {
			root.right = next;
			if (next != null) next.left = root;
		} else {
			BSTtoDLL(root.right, next, root);
		}
	}
}
