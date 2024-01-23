package trees;

public class Test {

	public static void main(String[] args) {
		try {
			BTree<String> colorGreen = new LBTree<>("color=GREEN");
			BTree<String> colorYellow = new LBTree<>("color=YELLOW");
			BTree<String> sizeBig = new LBTree<>("size=BIG");
			BTree<String> sizeMedium = new LBTree<>("size=MEDIUM");
			BTree<String> sizeSmall = new LBTree<>("size=SMALL");
			BTree<String> shapeRound = new LBTree<>("shape=ROUND");
			BTree<String> tasteSweet = new LBTree<>("taste=SWEET");

			BTree<String> watermelon = new LBTree<>("watermelon");
			BTree<String> apple = new LBTree<>("apple");
			BTree<String> grape = new LBTree<>("grape");
			BTree<String> lemon = new LBTree<>("lemon");
			BTree<String> banana = new LBTree<>("banana");
			BTree<String> cherry = new LBTree<>("cherry");
			BTree<String> berry = new LBTree<>("berry");
			BTree<String> orange = new LBTree<>("orange");

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