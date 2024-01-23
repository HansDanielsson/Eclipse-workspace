package trees;

public class Test {

	public static void main(String[] args) {

		try {
			// First, create nodes. For instance, as follows:
			BTree<String> colorGreen = new DummyTree<>("color=GREEN");
			BTree<String> sizeBig = new DummyTree<>("size=BIG");
			BTree<String> colorYellow = new DummyTree<>("color=YELLOW");
			BTree<String> sizeMedium = new DummyTree<>("size=MEDIUM");
			BTree<String> shapeRound = new DummyTree<>("shape=ROUND");
			BTree<String> sizeSmall = new DummyTree<>("size=SMALL");
			BTree<String> tasteSweet = new DummyTree<>("taste=SWEET");

			BTree<String> watermelon = new DummyTree<>("Watermelon");
			BTree<String> apple = new DummyTree<>("Apple");
			BTree<String> grape = new DummyTree<>("Grape");
			BTree<String> lemon = new DummyTree<>("Lemon");
			BTree<String> banana = new DummyTree<>("Banana");
			BTree<String> cherry = new DummyTree<>("Cherry");
			BTree<String> berry = new DummyTree<>("Berry");
			BTree<String> orange = new DummyTree<>("Orange");
			// ...

			// Then connect nodes. For instance, as follows:
			tasteSweet.insert(cherry, BTree.LEFT);
			tasteSweet.insert(berry, BTree.RIGHT);

			sizeMedium.insert(apple, BTree.LEFT);
			sizeMedium.insert(grape, BTree.RIGHT);

			shapeRound.insert(lemon, BTree.LEFT);
			shapeRound.insert(banana, BTree.RIGHT);

			sizeSmall.insert(tasteSweet, BTree.LEFT);
			sizeSmall.insert(orange, BTree.RIGHT);

			sizeBig.insert(watermelon, BTree.LEFT);
			sizeBig.insert(sizeMedium, BTree.RIGHT);

			colorYellow.insert(shapeRound, BTree.LEFT);
			colorYellow.insert(sizeSmall, BTree.RIGHT);

			colorGreen.insert(sizeBig, BTree.LEFT);
			colorGreen.insert(colorYellow, BTree.RIGHT);
			// ...

			// Print the tree and its size and height

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}