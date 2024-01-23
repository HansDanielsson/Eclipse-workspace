package trees;

public class LBSTree<E> implements BSTree<E> {

	/*
	 * Attribute: the node
	 */
	private LBSNode<E> root;
	private boolean isRemoved;

	/*
	 * Constructors
	 */
	public LBSTree(Comparable key, E info) {
		root = new LBSNode<>(key, info, new LBSTree<>(), new LBSTree<>());
		isRemoved = false;
	}

	public LBSTree() {
		root = null;
		isRemoved = false;
	}

	/*
	 * Checks if the tree is empty
	 */
	public boolean isEmpty() {
		return (root == null);
	}

	/*
	 * Returns the search key of the information stored in the tree
	 */
	public Comparable getKey() {
		if (isEmpty()) {
			return null;
		}
		return root.getKey();
	}

	/*
	 * Returns the information stored in the tree
	 */
	public E getInfo() {
		if (isEmpty()) {
			return null;
		}
		return root.getInfo();
	}

	/*
	 * Returns the left and right subtrees
	 */
	public BSTree<E> getLeft() {
		if (isEmpty()) {
			return null;
		}
		return root.getLeft();
	}

	public BSTree<E> getRight() {
		if (isEmpty()) {
			return null;
		}
		return root.getRight();
	}

	/*
	 * Inserts information into the tree. If key already exists, the information is
	 * overwritten
	 */
	public void insert(Comparable key, E info) {
		if (isEmpty()) {
			root = new LBSNode<>(key, info, new LBSTree<>(), new LBSTree<>());
			isRemoved = false;
		} else {
			int comp = root.getKey().compareTo(key);
			if (comp > 0) {
				getLeft().insert(key, info);
			} else if (comp < 0) {
				getRight().insert(key, info);
			} else {
				root.setInfo(info);
				isRemoved = false;
			}
		}
	}

	/*
	 * Searches for information in the tree
	 */
	public E search(Comparable key) {
		if (isEmpty()) {
			return null;
		}
		int comp = root.getKey().compareTo(key);
		if (comp > 0) {
			return getLeft().search(key);
		}
		if (comp < 0) {
			return getRight().search(key);
		}
		if (isRemoved) {
			return null;
		}
		return getInfo();
	}

	/*
	 * Searches and extracts information
	 */
	public E extract(Comparable key) {
		if (isEmpty()) {
			return null;
		}
		int comp = root.getKey().compareTo(key);
		if (comp > 0) {
			return getLeft().extract(key);
		}
		if (comp < 0) {
			return getRight().extract(key);
		}
		if (isRemoved) {
			return null;
		}
		isRemoved = true;
		return getInfo();
	}

	/*
	 * Tree traversals
	 */
	public String toStringPreOrder() {
		if (isEmpty()) {
			return "";
		}
		return (!isRemoved ? root + " " : "") + getLeft().toStringPreOrder() + getRight().toStringPreOrder();
	}

	public String toStringInOrder() {
		if (isEmpty()) {
			return "";
		}
		return getLeft().toStringInOrder() + (!isRemoved ? root + " " : "") + getRight().toStringInOrder();
	}

	public String toStringPostOrder() {
		if (isEmpty()) {
			return "";
		}
		return getLeft().toStringPostOrder() + getRight().toStringPostOrder() + (!isRemoved ? root + " " : "");
	}

	/*
	 * Returns size of the tree (the number of pieces of information)
	 */
	public int size() {
		if (isEmpty()) {
			return 0;
		}
		return (isRemoved ? 0 : 1) + getLeft().size() + getRight().size();
	}
}