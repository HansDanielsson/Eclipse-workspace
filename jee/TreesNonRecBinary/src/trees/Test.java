package trees;

public class Test {

	public static void main(String[] args) {
		try {
			BTree<String> colorGreen = new NonRecursiveLBTree<>("color=GREEN");
			BTree<String> colorYellow = new NonRecursiveLBTree<>("color=YELLOW");
			BTree<String> sizeBig = new NonRecursiveLBTree<>("size=BIG");
			BTree<String> sizeMedium = new NonRecursiveLBTree<>("size=MEDIUM");
			BTree<String> sizeSmall = new NonRecursiveLBTree<>("size=SMALL");
			BTree<String> shapeRound = new NonRecursiveLBTree<>("shape=ROUND");
			BTree<String> tasteSweet = new NonRecursiveLBTree<>("taste=SWEET");

			BTree<String> watermelon = new NonRecursiveLBTree<>("watermelon");
			BTree<String> apple = new NonRecursiveLBTree<>("apple");
			BTree<String> grape = new NonRecursiveLBTree<>("grape");
			BTree<String> lemon = new NonRecursiveLBTree<>("lemon");
			BTree<String> banana = new NonRecursiveLBTree<>("banana");
			BTree<String> cherry = new NonRecursiveLBTree<>("cherry");
			BTree<String> berry = new NonRecursiveLBTree<>("berry");
			BTree<String> orange = new NonRecursiveLBTree<>("orange");

			colorGreen.insert(sizeBig, BTree.LEFT);
			colorGreen.insert(colorYellow, BTree.RIGHT);

			sizeBig.insert(watermelon, BTree.LEFT);
			sizeBig.insert(sizeMedium, BTree.RIGHT);

			colorYellow.insert(shapeRound, BTree.LEFT);
			colorYellow.insert(sizeSmall, BTree.RIGHT);

			sizeMedium.insert(apple, BTree.LEFT);
			sizeMedium.insert(grape, BTree.RIGHT);
			shapeRound.insert(lemon, BTree.LEFT);
			shapeRound.insert(banana, BTree.RIGHT);
			sizeSmall.insert(tasteSweet, BTree.LEFT);
			sizeSmall.insert(orange, BTree.RIGHT);

			tasteSweet.insert(cherry, BTree.LEFT);
			tasteSweet.insert(berry, BTree.RIGHT);

			System.out.println("INORDER: " + colorGreen.toStringInOrder());
			System.out.println("PREORDER: " + colorGreen.toStringPreOrder());
			System.out.println("POSTORDER: " + colorGreen.toStringPostOrder());
			System.out.println("SIZE=" + colorGreen.size());
			System.out.println("HEIGHT=" + colorGreen.height());

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}