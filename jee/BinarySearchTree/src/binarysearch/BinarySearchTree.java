package binarysearch;

public class BinarySearchTree<E extends Comparable<E>> {

	class Node {
		E value;
		Node leftChild = null;
		Node rightChild = null;

		Node(E value) {
			this.value = value;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof BinarySearchTree.Node))
				return false;
			@SuppressWarnings("unchecked")
			Node other = (BinarySearchTree<E>.Node) obj;
			return other.value.compareTo(value) == 0 && other.leftChild == leftChild && other.rightChild == rightChild;
		}
	}

	protected Node root = null;

	protected void visit(Node n) {
		System.out.println(n.value);
	}

	public boolean contains(E val) {
		return contains(root, val);
	}

	protected boolean contains(Node n, E val) {
		if (n == null)
			return false;

		if (n.value.equals(val)) {
			return true;
		} else if (n.value.compareTo(val) > 0) {
			return contains(n.leftChild, val);
		} else {
			return contains(n.rightChild, val);
		}
	}

	public boolean add(E val) {
		if (root == null) {
			root = new Node(val);
			return true;
		}
		return add(root, val);
	}

	protected boolean add(Node n, E val) {
		if (n == null) {
			return false;
		}
		int cmp = val.compareTo(n.value);
		if (cmp == 0) {
			return false; // this ensures that the same value does not appear more than once
		} else if (cmp < 0) {
			if (n.leftChild == null) {
				n.leftChild = new Node(val);
				return true;
			} else {
				return add(n.leftChild, val);
			}
		} else {
			if (n.rightChild == null) {
				n.rightChild = new Node(val);
				return true;
			} else {
				return add(n.rightChild, val);
			}
		}
	}

	public boolean remove(E val) {
		return remove(root, null, val);
	}

	protected boolean remove(Node n, Node parent, E val) {
		if (n == null)
			return false;

		if (val.compareTo(n.value) < 0) {
			return remove(n.leftChild, n, val);
		} else if (val.compareTo(n.value) > 0) {
			return remove(n.rightChild, n, val);
		} else {
			if (n.leftChild != null && n.rightChild != null) {
				n.value = maxValue(n.leftChild);
				remove(n.leftChild, n, n.value);
			} else if (parent == null) {
				root = n.leftChild != null ? n.leftChild : n.rightChild;
			} else if (parent.leftChild == n) {
				parent.leftChild = n.leftChild != null ? n.leftChild : n.rightChild;
			} else {
				parent.rightChild = n.leftChild != null ? n.leftChild : n.rightChild;
			}
			return true;
		}
	}

	protected E maxValue(Node n) {
		if (n.rightChild == null) {
			return n.value;
		} else {
			return maxValue(n.rightChild);
		}
	}

	/*********************************************
	 * 
	 * IMPLEMENT THE METHODS BELOW!
	 *
	 *********************************************/

	// Method #1.
	public Node findNode(E val) {
		if (val == null)
			return null;
		Node n = root;
		boolean loopOk = true;
		while (loopOk && (n != null))
			if (n.value.equals(val))
				loopOk = false;
			else if (n.value.compareTo(val) > 0)
				n = n.leftChild;
			else
				n = n.rightChild;
		return n; // this line is here only so this code will compile if you don't modify it
	}

	// Method #2.
	protected int depth(E val) {
		int countDepth = -1;
		if (val != null) {
			Node n = root;
			boolean loopOk = true;
			while (loopOk && (n != null)) {
				countDepth++;
				if (n.value.equals(val))
					loopOk = false;
				else if (n.value.compareTo(val) > 0)
					n = n.leftChild;
				else
					n = n.rightChild;
			}
			if (n == null)
				countDepth = -1;
		}
		return countDepth; // this line is here only so this code will compile if you don't modify it
	}

	// Method #3.
	protected int height(E val) {
		int countHeight = -1;
		if (val != null) {
			Node n = findNode(val);
			if (n != null) {
				if ((n.leftChild == null) && (n.rightChild == null)) {
					countHeight = 0;
				} else {
					int countLeft = (n.leftChild == null) ? 0 : height(n.leftChild.value);
					int countRight = (n.rightChild == null) ? 0 : height(n.rightChild.value);
					countHeight = (countLeft > countRight) ? countLeft : countRight;
					countHeight++;
				}
			}
		}
		return countHeight; // this line is here only so this code will compile if you don't modify it
	}

	// Method #4.
	protected boolean isBalanced(Node n) {
		boolean balancedOk = false;
		if (n != null) {
			Node inBST = findNode(n.value);
			if (inBST != null) {
				int heightLeft = (inBST.leftChild == null) ? -1 : height(inBST.leftChild.value);
				int heightRight = (inBST.rightChild == null) ? -1 : height(inBST.rightChild.value);
				balancedOk = (Math.abs(heightLeft - heightRight) < 2);
			}
		}
		return balancedOk; // this line is here only so this code will compile if you don't modify it
	}

	// Method #5. .
	public boolean isBalanced() {
		boolean balanceLeft = isBalanced(root.leftChild);
		boolean balanceRight = isBalanced(root.rightChild);
		return balanceLeft && balanceRight; // this line is here only so this code will compile if you don't modify it
	}
}